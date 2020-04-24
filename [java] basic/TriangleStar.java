
public class TriangleStar{
    public static void main(String argv[]){

        for(int i=5; i>=0; i--){

            for(int j=(5-i); j>=0; j--){
                System.out.print(" ");
            }

            for(int j=0; j<i; j++){
                System.out.print("*");
            }    
            System.out.println(); 
        }

    }
}