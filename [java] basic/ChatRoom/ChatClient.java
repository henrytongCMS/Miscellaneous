import java.io.*;
import java.net.*;

public class ChatClient {

    BufferedReader reader;
    PrintWriter writer;
    String str = "hi";

    private void setUpNetworking() throws UnknownHostException, IOException {

        Socket clientSocket = new Socket("127.0.0.1", 5000);
        reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        writer = new PrintWriter(clientSocket.getOutputStream());
        System.out.println("Networking established");

    }

    public class IncomingReader implements Runnable {

        public void run() {

            String message;
            try {
                while( (message=reader.readLine()) != null ) {
                    System.out.println("read " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void go() throws UnknownHostException, IOException {

        setUpNetworking();
        
        Thread tr = new Thread(new IncomingReader());
        tr.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Begin chat...");

        while( !str.equals("end") ) {
            str = br.readLine();
            writer.println(str);
            writer.flush();
        }

    }

    public static void main(String[] args) throws UnknownHostException, IOException {

        ChatClient client = new ChatClient();
        client.go();

    }

}