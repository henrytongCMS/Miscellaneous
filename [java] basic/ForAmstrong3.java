
public class ForAmstrong3{
    public static void main(String argv[]){

        for(int i=1; i<=9; i++){
            for(int j=0; j<=9; j++){
                for(int k=0; k<=9; k++){

                    int cube = i*i*i + j*j*j + k*k*k;
                    int num = i*100 + j*10 + k;

                    if( num == cube ){
                    System.out.println(Integer.toString(num));
                    }

                }
            }           
        }

    }
}