import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String output = bf.readLine();
        while(output != null){
            System.out.println(output);
            output = bf.readLine();
        }
    }
}