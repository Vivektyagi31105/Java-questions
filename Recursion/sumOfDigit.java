// Given an integer, find out the sum of its digits using recursion.
// Input: n= 1234
// Output: 10
// Explanation: 1+2+3+4=10

import java.util.*;
public class sumOfDigit {
    static int sumOfItsDigit(int n){
        int result=0;
           if(n==0){
            return n;
           }else{
             result= n%10 + sumOfItsDigit(n/10);
           }
           return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number: ");
        int n= scn.nextInt();

        System.out.println("Sum of digit is: "+ sumOfItsDigit(n));
    }
}
