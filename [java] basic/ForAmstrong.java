
public class ForAmstrong{
    public static void main(String argv[]){

        for(int i=100; i<1000; i++){

            int u = i%10;
            int t = (i/10)%10;
            int h = (i/100)%10;

            if( i == h*h*h + t*t*t + u*u*u ){
                System.out.println(Integer.toString(i));
            }           

        }

    }
}