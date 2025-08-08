import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int result = 0;
        for(int i = 0; i < count; i++){
            result += str.charAt(i) - '0';
        }
        System.out.println(result);
    }
}