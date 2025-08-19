import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] input_arr = new String[5];
        int count = 0;
        int i = 0;
        String output = "";
        while(input != null){
            input_arr[count] = input.replace(" ", "") + "$";
            input = br.readLine();
            count++;
        }  
        count = 0;
        while(count < 5){
            if(!input_arr[i].equals("$")){
                output = output + input_arr[i].substring(0,1);
                input_arr[i] = input_arr[i].substring(1);
            }
            else{
                count++;
            }

            i++;
            if(i >= 5){
                i = 0;
                if(count < 5){
                    count = 0;
                }
            }
        }
        System.out.println(output);
    }
}