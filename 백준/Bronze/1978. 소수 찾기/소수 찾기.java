import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N_cnt = Integer.parseInt(br.readLine());
        String[] N_str_arr = br.readLine().split(" ");
        int output = N_cnt;
        for(int i = 0; i < N_cnt; i++){
            int N = Integer.parseInt(N_str_arr[i]);
            int j = 2;
            
            if(N < 2){
                output--;
            }
            
            while(j < N){
                if(N % j == 0){
                    output--;
                    break;
                }
                j++;
            }
        }
        System.out.println(output);
    }
}