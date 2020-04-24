import java.io.*;
import java.net.*;

public class DailyAdviceClient {

    public void go() throws UnknownHostException, IOException {
      
        Socket s = new Socket("127.0.0.1", 8000);
        InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
        BufferedReader reader = new BufferedReader(streamReader);
        String advice = reader.readLine();
        System.out.println("Today you should: " + advice);
        s.close();
       
    }

    public static void main(String [] argv) throws UnknownHostException, IOException {
        
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();

    }

}