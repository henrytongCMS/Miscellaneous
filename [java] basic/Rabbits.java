
public class Rabbits{
    public static void main(String argv[]){

        int month = 9;
        System.out.println("How much rabbit after " + Integer.toString(month) + " months? : " + Integer.toString(rabbit(month))); 

    }

    private static int rabbit(int i){

        if ( i <= 3 )
            return 1;
        else
            return rabbit(i-1) + rabbit(i-3);
        
    }

}