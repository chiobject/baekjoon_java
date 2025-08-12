import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String input = bf.readLine();
            int[] output = new int[26];
            for(int i = 0; i < output.length; i++){
                output[i] = -1;
            }
            for (int i = 0; i < input.length(); i++){
                if(output[input.charAt(i)-97] == -1){
                    output[input.charAt(i)-97] = i;  
                }
            }
        for(int i : output){
            System.out.print(i + " ");
        }
    }
}