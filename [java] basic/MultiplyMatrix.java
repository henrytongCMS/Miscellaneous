import java.io.*;
import java.util.Arrays;

public class MultiplyMatrix{
    public static void main(String argv[]) throws IOException{

        int[][] matrix_1 = {{1,1,1},{2,2,2},{3,3,3}}; 
        int[][] matrix_2 = {{1,1,1},{2,2,2},{3,3,3}}; 
        int[][] sum = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){

                sum[i][j] = 0;
                for(int k=0; k<3; k++){
                    sum[i][j] += matrix_1[i][k] * matrix_2[k][j];

                }
            }
        }

        System.out.println(Arrays.deepToString(sum));
        
    }
}