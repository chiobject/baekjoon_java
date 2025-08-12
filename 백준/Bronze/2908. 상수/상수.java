import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] q = bf.readLine().split(" ");
        int answer = 0;
        for (int i = q[answer].length() - 1; i >= 0; i--){
            if (q[0].charAt(i) > q[1].charAt(i)){
                answer = 0;
                break;
            }
            else if (q[0].charAt(i) < q[1].charAt(i)){
                answer = 1;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = q[answer].length() - 1; i >=0; i--){
            sb.append(q[answer].charAt(i));
        }
        System.out.println(sb);
    }
}