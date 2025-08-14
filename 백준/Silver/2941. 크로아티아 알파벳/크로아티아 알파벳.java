import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int output = 0;
        for(int i = 0; i < input.length(); i++){
            output += 1;
            if(i+2 < input.length()&& input.substring(i,i+3).equals("dz=")){
                i = i + 2 ;
            }
            else if (i+1 < input.length()){
                switch(input.substring(i,i+2)){
                    case "c=":
                    case "c-":
                    case "d-":
                    case "lj":
                    case "nj":
                    case "s=":
                    case "z=":
                        i = i + 1;
                        break;
                }
            }
        }
        System.out.println(output);
    }
}