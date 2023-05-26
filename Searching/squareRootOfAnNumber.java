// square root an number with modified binary search
import java.util.*;
public class squareRootOfAnNumber {
    public static int squareRoot(int n){
        int low=0, high=n;
        int result=-1;

        while(low<= high){
            int mid = (low+high)/2;
            long value= mid*mid;

            if(value== n){
            return mid;
            }else if(value< n){
                result= mid;
                low= mid+1;
            }else{
                high= mid-1;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Input number to find square root:");
        int n= scn.nextInt();

        int result= squareRoot(n);
        System.out.println("Square root is: "+ result);
    }
}
