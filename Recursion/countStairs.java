import java.util.*;
public class countStairs {
    static int countNumOfStairs(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result= countNumOfStairs(n-1)+ countNumOfStairs(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type number of stairs :");
        int n= scn.nextInt();

        System.out.println("Number of ways is: "+countNumOfStairs(n+1));
    }
}
