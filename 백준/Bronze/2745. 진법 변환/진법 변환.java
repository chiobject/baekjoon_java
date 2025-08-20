import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String num = input[0];
        int N = Integer.parseInt(input[1]);
        
        int output = 0; 
        
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int value;
            if (c >= 'A' && c <= 'Z') {
                value = c - 55;  // 
            } else {
                value = c - '0';
            }
            output = output * N + value; 
        }
        
        System.out.println(output);
    }
}