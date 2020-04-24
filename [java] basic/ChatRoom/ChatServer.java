import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    ArrayList<PrintWriter> clientOutputStreams;

    public class ClientHandler implements Runnable {

        BufferedReader reader;

        public ClientHandler(Socket clientSocket) throws IOException {

            Socket sock = clientSocket;
            reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));

        }

        public void run() {

            String message;
            try {
                while( (message=reader.readLine()) != null ) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void go() throws IOException {
        
        clientOutputStreams = new ArrayList<PrintWriter>();

        ServerSocket serverSocket = new ServerSocket(5000);

        while(true) {
            
            Socket clientSocket = serverSocket.accept();
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
            clientOutputStreams.add(writer);

            Thread t = new Thread(new ClientHandler(clientSocket));
            t.start();

            System.out.println("New connections...");

        }
        
    }

    public void tellEveryone(String message) {

        Iterator<PrintWriter> it = clientOutputStreams.iterator();

        while( it.hasNext() ) {

            PrintWriter writer = (PrintWriter) it.next();
            writer.println(message);
            writer.flush();
            
        }

    }

    public static void main(String[] args) throws IOException {

        new ChatServer().go();

    }
        
}