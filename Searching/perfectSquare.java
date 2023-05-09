// Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
// with itself.
// Example 1:
// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
// Example 2:
// Input: num = 14
// Output: false

import java.util.*;
public class perfectSquare {
    public static boolean perfect_Square(int n){
        int low=0, high= n;
        
        while(low<=high){
            int mid= (low+high)/2;
            long value= mid*mid;

            if(value==n){
                return true;
            }else if(value<n){
                low=mid+1;
            }else{
                high= mid-1;
            }
        }
        
        // if(low*low==n|| high*high==n){
        //     return true;
        // }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number:");
        int n= scn.nextInt();

       boolean result= perfect_Square(n);
       System.out.println(" Perfect square is : "+result);
       
    }
}
