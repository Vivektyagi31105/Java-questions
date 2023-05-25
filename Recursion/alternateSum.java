// Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
// Constraints : 0<=n<=1e6
// Input1 : n = 10
// Output 1 : -5
// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
// Input 2 : n = 5
// Output 2 : 3

import java.util.*;
public class alternateSum {
   public static int alternateSumOfNaturalNum(int n){
        int result=0;
        if(n%2 != 0){
            result= (n+1)/2;
        }else{
            result= (-n)/2 ;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= scn.nextInt();

        System.out.println("The alternate sum is: "+ alternateSumOfNaturalNum(n));
    }
}
