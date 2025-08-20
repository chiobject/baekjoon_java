import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        StringBuilder result = new StringBuilder();

        while(N != 0){
            int i = N % B;
            N = N / B;
            if(i >= 10){
                result.append((char)(i + 55));
            } else {
                result.append(i);
            }
        }

        System.out.println(result.reverse().toString());
    }
}
