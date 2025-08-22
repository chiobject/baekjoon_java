import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = 0;
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int i = 1;
        int output = 0;
        while(count < K && i <= N){
            if(N%i == 0){
                count++;
                output = i;
            }
            i++;
        }
        System.out.println(count < K ? 0 : output);
    }
}