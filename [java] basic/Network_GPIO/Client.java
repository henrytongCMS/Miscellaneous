import java.io.*;
import java.net.*;

public class Client {

    public void go() throws UnknownHostException, IOException {
      
        Socket socket = new Socket("192.168.137.10", 8000);

        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        System.out.println("Begin...");

        while( !str.equals("end") ) {
            str = reader.readLine();
            writer.println(str);
            writer.flush();
        }

    }

    public static void main(String [] argv) throws UnknownHostException, IOException {
        
        Client client = new Client();
        client.go();

    }

}