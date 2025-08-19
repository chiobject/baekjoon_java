import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int input_n = Integer.parseInt(input[0]);
        int input_m = Integer.parseInt(input[1]);
        
        int[][] A_arr = new int[input_n][input_m];
        int[][] B_arr = new int[input_n][input_m];

        for(int i = 0; i < input_n; i++){
            String[] A_arr_line = br.readLine().split(" ");
            for(int j = 0; j < input_m; j++){
                A_arr[i][j] = Integer.parseInt(A_arr_line[j]);
            }
        }

        for(int i = 0; i < input_n; i++){
            String[] B_arr_line = br.readLine().split(" ");
            for(int j = 0; j < input_m; j++){
                B_arr[i][j] = Integer.parseInt(B_arr_line[j]);
            }
        }

        for(int i = 0; i < input_n; i++){
            for(int j = 0; j < input_m; j++){
                System.out.print((A_arr[i][j] + B_arr[i][j]) + " ");
            }
            System.out.println("");
        }
    }
}