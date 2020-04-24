
public class WhileNon3{

    public static void Non3(int N){

        int i = 0;

        while( i < N-3 ){
       
            System.out.print((i+1) + " " + (i+2) + " ");
            i += 3;
                
        }

        switch( N % 3 ){

            case 1:
                System.out.println(i+1);
                break;

            default:
                System.out.println((i+1) + " " + (i+2) + " ");

        }

    }
    public static void main(String argv[]){
       
        Non3(96);
        Non3(97);
        Non3(98);
        Non3(99);
        Non3(100);        

    }
}