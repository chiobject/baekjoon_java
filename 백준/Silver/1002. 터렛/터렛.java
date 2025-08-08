import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] joe = new int[3];
        int[] baek = new int[3];
        for(int i = 0; i < count; i ++){
            int output = 0;
            joe[0] = sc.nextInt();
            joe[1] = sc.nextInt();
            joe[2] = sc.nextInt();
            baek[0] = sc.nextInt();
            baek[1] = sc.nextInt();
            baek[2] = sc.nextInt();
            
            double d = Math.pow(Math.pow((joe[0]-baek[0]),2)+Math.pow((joe[1]-baek[1]),2),0.5);
            if (joe[0] == baek[0] && joe[1] == baek[1] && joe[2] == baek[2]){
                output = -1;
            }
            else if(d < joe[2] + baek[2] && d > Math.abs(joe[2] - baek[2])){
                output = 2;
            }
            else if(d == joe[2] + baek[2] || d == Math.abs(joe[2] - baek[2])){
                output = 1;
            }
            else{
                output = 0;
            }
            System.out.println(output);
        }
    }
}