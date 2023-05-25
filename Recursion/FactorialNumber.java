import java.util.*;
public class factorialNumber{
    public static int findFactorial(int n){
        int result= 0;
        if(n==0 || n==1){
            return 1;
        }else{
            result= n*findFactorial(n-1);
                return result;       
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number:");
        int n= scn.nextInt();

        System.out.println("Factorial is:" + findFactorial(n));

    }
}
        
        
