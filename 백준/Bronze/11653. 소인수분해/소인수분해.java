import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int N_half = N / 2;
        int i = 2;

        if(N == 1){
            return;
        }
        
        while(N > i){
            if(N % i == 0){
                N = N / i;
                System.out.println(i);
            }
            else{
                i++;
            }
        }
        if(N != 0){
            System.out.println(N);
        }
    }
}