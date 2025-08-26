import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        while(!input.equals("0 0 0")){
            String[] input_s = input.split(" ");
            for(int i = 0; i < input_s.length-1; i++){
                for(int j = 1; j < input_s.length; j++){
                    int t1 = Integer.parseInt(input_s[i]);
                    int t2 = Integer.parseInt(input_s[j]);
                    if(t1 < t2){
                        String temp =input_s[i];
                        input_s[i] = input_s[j];
                        input_s[j] = temp;
                    }
                }
            }
            
            int a = Integer.parseInt(input_s[0]);
            int b = Integer.parseInt(input_s[1]);
            int c = Integer.parseInt(input_s[2]);
            
            if(a >= (b + c)){
                System.out.println("Invalid");
            }
            else if (a == b && a == c && b == c){
                System.out.println("Equilateral");
            }
            else if(a == b || a == c || b == c){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }

            input = br.readLine();
            
        }
    }
}