import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] rank = {"A+","A0","B+","B0", "C+", "C0", "D+", "D0","F"};
        double[] score = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
        double output = 0;
        double total_count = 0;
        while(input != null){
            String[] input_list = input.split(" ");
            int i = 0;
            if(!input_list[2].equals("P")){
                for(String s : rank){
                    if(s.equals(input_list[2])){
                        break;
                    }
                    i++;
                }
                output = output + Double.parseDouble(input_list[1]) * score[i];
                total_count += Double.parseDouble(input_list[1]);
            }
            input = br.readLine();
        }
        System.out.printf("%6f", (output / total_count));
    }
}