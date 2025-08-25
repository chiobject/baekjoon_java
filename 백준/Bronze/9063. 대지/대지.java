import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        if(count == 1){
            System.out.println(0);
            return;
        }
        
        String[] input = br.readLine().split(" ");
        int min_x = Integer.parseInt(input[0]);
        int max_x = min_x;
        int min_y = Integer.parseInt(input[1]);
        int max_y = min_y;
        for(int i = 0; i < count - 1; i++){
            input = br.readLine().split(" ");
            int input_x = Integer.parseInt(input[0]);
            int input_y = Integer.parseInt(input[1]);
            
            if(min_x > input_x){
                min_x = input_x;
            }
            else if(max_x < input_x){
                max_x = input_x;
            }
            if(min_y > input_y){
                min_y = input_y;
            }
            else if(max_y < input_y){
                max_y = input_y;
            }
        }
        System.out.println((max_x - min_x)*(max_y-min_y));
    }
}