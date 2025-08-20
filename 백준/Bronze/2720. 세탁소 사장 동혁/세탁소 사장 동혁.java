import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++){
            int[] output = new int[4];
            int input = Integer.parseInt(br.readLine());
            if(input / 25 != 0){
                output[0] = input / 25;
                input = input % 25;
            }
            if (input/10 != 0){
                output[1] = input / 10;
                input = input % 10;   
            }
            if (input/5 != 0){
                output[2] = input / 5;
                input = input % 5;   
            }
            if (input/1 != 0){
                output[3] = input;
            }
            for(int j = 0; j < output.length; j++){
                System.out.print(output[j] + " ");
            }
            System.out.println("");
        }
    }
}