import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] count = new int[26];
        int max = 0;
        for(int i = 0; i < input.length(); i++){
            int now = 0;
            if(input.charAt(i) <= 'Z'){
                now = (int)input.charAt(i) - 'A';
            }
            else{
                now = (int)input.charAt(i) - 'a';
            }
            count[now] += 1 ;

            if(count[max] < count[now]){
                max = now;
            }
        }

        char output = (char)(max + 65);
        
        for(int i =0; i < count.length; i++){
            if(i != max && count[i] == count[max]){
                output = '?';
            }
        }
        
        System.out.println(output);
        br.close();
    }
}