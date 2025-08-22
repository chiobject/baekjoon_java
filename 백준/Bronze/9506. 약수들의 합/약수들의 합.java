import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        while(input != -1){
            int i = 1;
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            while(i < input){
                if(input%i == 0){
                    arr.add(i);
                    sum += i;
                }
                i++;
            }
            if(input == sum){
                System.out.print(input + " = " );
                for(int j = 0; j < arr.size() - 1; j++){
                    System.out.print(arr.get(j) + " + ");
                }
                System.out.println(arr.get(arr.size()-1));
            }
            else{
                System.out.println(input + " is NOT perfect.");
            }
                                   
            input = Integer.parseInt(br.readLine());
        }
    }
}