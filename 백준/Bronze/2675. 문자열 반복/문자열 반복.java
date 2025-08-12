import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(bf.readLine());
            for (int i =0; i < count; i++){
                String[] s = bf.readLine().split(" ");
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < s[1].length(); j++){
                    for (int k = 0; k < Integer.parseInt(s[0]); k++){
                        sb.append(s[1].charAt(j));
                    }
                }
                System.out.println(sb);
            }
    }
}