import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String output = bf.readLine();
            if(output == null) {break;}
            System.out.println(output);
        }
    }
}