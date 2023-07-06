import java.util.*;

public class fibonacciSeries {
   public static int findFibonacci(int n){
      int result=0;
      if(n<=1){
        return n;
      }else{
        result= findFibonacci(n-1)+ findFibonacci(n-2);
      }
      return result;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Type the number:");
        int n= scn.nextInt();

       System.out.println("Result for fibonacci series is: "+findFibonacci(n));

    }
}
