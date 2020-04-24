
public class ReverseInt{
    public static void main(String argv[]){

        int i = 239, rev = 0;

        System.out.println("Original: " + i);

        while(i != 0){

            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;

        }

        System.out.println("Reversed: " + rev);

    }
}