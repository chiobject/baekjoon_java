import java.io.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int input_len = input.length();
        int output = 1;
        for(int i = 0; i < (int)input_len/2; i++){
            if(input.charAt(i) != input.charAt(input_len-i-1)){
                output = 0;
                break;
            }
        }
        System.out.println(output);
    }
}