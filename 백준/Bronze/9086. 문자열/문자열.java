import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        for (int i = 0; i < count; i++){
            String str = bf.readLine();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }
    }
}