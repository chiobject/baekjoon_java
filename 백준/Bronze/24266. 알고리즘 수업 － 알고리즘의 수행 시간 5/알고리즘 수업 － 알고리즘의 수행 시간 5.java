import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        long output = (long)input * input * input;
        int len = Long.toString(output).length();
        long firstdigit = 1;
        for(int i = 1; i <len; i++) firstdigit *= 10;
              
        System.out.println(output);
        System.out.println(3);
    }
}