import java.util.Arrays;

public class Triangle{
    public static void main(String argv[]){

        final int N = 9;

        int[] array = new int[N];

        for( int n=1; n<=N; n++ ){
            
            for( int k=0; k<n; k++ ){
                array[k] = pascal(n, k);
            }

            System.out.println(Arrays.toString(array));

        }    

    }

    static int pascal(int n, int k){

        if( n == 0 )
            return 0;
        else if( k == 0 )
            return 1;
        else
            return pascal(n-1, k-1) + pascal(n-1, k);
        
    }

}