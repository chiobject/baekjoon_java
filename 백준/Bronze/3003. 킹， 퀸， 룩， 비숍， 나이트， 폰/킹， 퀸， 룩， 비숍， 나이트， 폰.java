import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] white_piece = br.readLine().split(" ");
        int[] black_piece = {1,1,2,2,2,8};
        int[] output = {0,0,0,0,0,0};
        for(int i = 0; i < white_piece.length; i++){
            output[i] = black_piece[i] - Integer.parseInt(white_piece[i]);
            System.out.print(output[i] + " ");
        }
    }
}