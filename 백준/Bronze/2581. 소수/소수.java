import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = M;
        for(int i = N; i < M+1; i++){
            int j = 2;
            while(i > j){
                if(i % j == 0){
                    break;
                }
                j++;
            }
            
            if(i == j){
                sum += i;
                if(min > i){
                    min = i;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}