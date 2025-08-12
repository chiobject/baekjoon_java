import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        if (line == null || line.trim() == ""){
            System.out.println(0); 
            return;
        }
        line = line.trim();
        int count = 1;
        for (int i = 0; i < line.length(); i++){
            if(line.charAt(i) == ' '){
                count += 1;
            }
        }
        System.out.println(count);
    }
}