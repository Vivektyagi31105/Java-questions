// second largest element 
import java.util.*;
public class secondLargestElement {
    public static void main(String[] args) {
        int arr[] ={34,21,54,65,43};

        int max=Integer.MIN_VALUE;
    

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2=Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
            if(arr[i]<max && arr[i]>max2){
             max2= arr[i];
            }
        }

        System.out.println(max2);
    }
}
