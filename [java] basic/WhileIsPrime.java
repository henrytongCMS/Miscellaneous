import java.io.*;

public class WhileIsPrime{
    public static void main(String argv[]) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Please input a number: ");
        int num = Integer.parseInt(in.readLine());
        
        boolean isPrime = true;

        int i = 2;
        do{

            if( num % i == 0 ){
                isPrime = false;
                break;
            }

            i++;
                
        }while( i <= num/2 );


        if(isPrime){
            System.out.print(Integer.toString(num) + " is a prime number.");

        } else{
            System.out.print(Integer.toString(num) + " is not a prime number.");

        }

    }
}