class Solution {
    public int solution(int[] arr) {
        int answer = lcm_arr(arr);
        return answer;
    }
    
    //lcm(A,B,C) = lcm(lcm(A,B),C)
    public int lcm_arr(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        else if(arr.length == 2){
            return lcm(arr[0], arr[1]);
        }
        else{
            int prv = lcm(arr[0], arr[1]);
            for(int i = 2; i < arr.length; i++){
                System.out.println(prv);
                prv = (lcm(prv,arr[i]));
            }
            return prv;
        }
    }
    
    //lcm(A,B) = A*B/gcd(A,B)
    public int lcm(int A,int B){
        return A * B / gcd(A,B);
    }
    
    public int gcd(int A, int B){
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        
        int R = A % B;
        if (R==0){
            return B;
        }
        else{
            return gcd(B,R);
        }
    }
}