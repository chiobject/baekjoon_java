import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        if (line == null || line.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] s = line.trim().split(" ");
        System.out.println(s.length);
    }
}