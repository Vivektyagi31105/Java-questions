import java.util.*;
public class powerOfElement {

    public static long findPower(long a, long b){
        long mid=0;
        long result=0, finalResult=0;

        if(b==1){
            return a;
        }else{
            mid=b/2;
            result= findPower(a,mid);
            finalResult= result*result;
            if(b%2==0){
                return finalResult;
            }else{
               return a*finalResult;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the value:");
        long a= scn.nextLong();

        System.out.println("Type the power");
        long b= scn.nextLong();

        System.out.println("The result is :"+findPower(a, b));
    }
}
