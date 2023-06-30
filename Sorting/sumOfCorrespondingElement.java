import java.util.*;

public class sumOfCorrespondingElement {
    public static boolean correspondingSum(int []a,Integer b[], int n, int k){
        // a and b array length is not equal
          if(n!=b.length){
            return false;
          }
         // sort array a[] in ascending order
          Arrays.sort(a);
        // sort b[] in descending order
            Arrays.sort(b,Collections.reverseOrder());
       
        
          for(int i=0; i<n; i++)
            if(a[i]+ b[i]<k)
                return false;
          
          return true;
    }
    public static void main(String[] args) {
        int a[]= {2,1,3};
        Integer b[]= {7,8,9};

        int n= a.length;
     
        int k=10;

        if(correspondingSum(a, b, n, k)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
