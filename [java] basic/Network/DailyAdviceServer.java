import java.io.*;
import java.net.*;

public class DailyAdviceServer {

    String adviceList [] = {
        "Take smaller bites.",
        "Go for the tight jeans. No they do NOT make you look fat.",
        "One word: inappropriate.",
        "Tell your boss what you *really* think.",
        "You might want to rethink that haircut."
    };

    public void go() throws UnknownHostException, IOException {

        ServerSocket serverSock = new ServerSocket(8000);

        while(true) {

            Socket sock = serverSock.accept();
            PrintWriter writer = new PrintWriter(sock.getOutputStream());
            String advice = getAdvice();
            writer.println(advice);
            writer.close();
            System.out.println(advice);
            // serverSock.close();

        }

     }

     private String getAdvice() {

         int random = (int)(Math.random() * adviceList.length);
         return adviceList[random];

     }

     public static void main(String [] argv) throws UnknownHostException, IOException {

        DailyAdviceServer server = new DailyAdviceServer();
        server.go();

     }

}