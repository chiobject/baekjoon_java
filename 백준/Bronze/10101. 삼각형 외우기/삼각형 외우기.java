import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] angle = new int[3];
        int sum = 0;
        for(int i = 0; i < angle.length; i++){
            angle[i] = Integer.parseInt(br.readLine());
            sum += angle[i];
        }
        
        if(sum != 180){
            System.out.println("Error");
        }
        else if(angle[0] == 60 && angle[0] == angle[1] && angle[1] == angle[2]){
            System.out.println("Equilateral");
        }
        else if(angle[0] == angle[1] || angle[1] == angle[2] || angle[2] == angle[0]){
            System.out.println("Isosceles");
        }
        else{
            System.out.println("Scalene");
        }
        
    }
}