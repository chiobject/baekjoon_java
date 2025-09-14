import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int a0 = Integer.parseInt(a[1]);
        int a1 = Integer.parseInt(a[0]);
        int output;
        if(a1 == c){
            output = (a0 <= 0) ? 1 : 0;
        }
        else if(a1 < c){
            output = (a1-c)*n0 + a0 <= 0 ? 1 : 0;
        }
        else{
            output = 0;
        }
        System.out.println(output);
    }
}