import java.io.*;
import java.util.Arrays;

public class AddTwoMatrix{
    public static void main(String argv[]) throws IOException{

        int[][] matrix_1 = {{1,2,3},{4,5,6}};
        int[][] matrix_2 = {{6,5,4},{3,2,1}};

        int[][] sum = new int[2][3];

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];

            }

        }

        System.out.println(Arrays.deepToString(sum));
        
    }
}