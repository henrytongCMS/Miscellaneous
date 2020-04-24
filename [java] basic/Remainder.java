import java.io.*;

public class Remainder{
    public static void main(String argv[]) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Please input a number: ");
        int num = Integer.parseInt(in.readLine());

        switch(num%3){

            case 0:
                System.out.println("zero");
                break;

            case 1:
                System.out.println("one");
                break;
            
            case 2:
                System.out.println("two");
                break;

            default:
                System.out.println("Error");
                
        }

    }
}