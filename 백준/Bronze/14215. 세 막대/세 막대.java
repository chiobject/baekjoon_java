import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < input.length-1; i++){
            for(int j = 1; j < input.length; j++){
                int t1 = Integer.parseInt(input[i]);
                int t2 = Integer.parseInt(input[j]);
                if(t1 < t2){
                    String temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        if(a < b+c){
            System.out.println(a + b + c);
        }
        else{
            System.out.println(2*(b+c)-1);
        }
        
    }
}