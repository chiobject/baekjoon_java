import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int output = 0;
        for(int i = 0; i < input.length(); i++){
            char s = 'A';
            boolean check = false;
            for(int j =2; j < 10; j++ ){
                int t;
                if(check == true){break;}
                if(j == 7 || j == 9){
                    t = 4;
                }
                else{
                    t = 3;
                }
                for(int k = 0; k < t; k++){
                    if(input.charAt(i) == s){
                        check = true;
                        output = output + j + 1;
                        break;
                    }
                    s += 1;
                }
            }
        }
        System.out.println(output);
    }
}