import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        while(!input.equals( "0 0")){
            String input_s[] = input.split(" ");
            int a = Integer.parseInt(input_s[0]);
            int b = Integer.parseInt(input_s[1]);
            if(a>b && a % b == 0){
                System.out.println("multiple");
            }
            else if(a < b && b % a == 0){
                System.out.println("factor");
            }
            else{
                System.out.println("neither");
            }
            input = br.readLine();
        }
    }
}