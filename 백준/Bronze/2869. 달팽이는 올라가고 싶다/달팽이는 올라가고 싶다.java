import java.io.*;

class Main{
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_s[] = br.readLine().split(" ");
        int A = Integer.parseInt(input_s[0]);
        int B = Integer.parseInt(input_s[1]);
        int V = Integer.parseInt(input_s[2]);
        int day = (V-A)%(A-B) == 0 ? (V-A)/(A-B) : (V-A)/(A-B) +1;
        System.out.println(day+1);
    }
}