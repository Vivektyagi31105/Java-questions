// lower bound or first occurence
import java.util.*;
public class lowerBound {
    public static int firstOccurence(int arr[], int target){
           int low=0, high= arr.length-1;
          int result= -1;
           while(low<= high){

            int mid= low+(high-low)/2;

            if(arr[mid]==target){
                result= mid;
                high= mid-1;
            }else if(arr[mid]> target){
                high= mid-1;
            }else{
                low= mid+1;
            }
           }

           return result;
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Input number of elements in an array: ");
        int n= scn.nextInt();
        System.out.println("Type the elements of an array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("Input the target element:");
        int target= scn.nextInt();
        
        int result = firstOccurence(arr,target);
        if(result== -1){
            System.out.println("Target element not present in array");
        }else{
            System.out.println("Target element first occurence is present at index: "+result);
        }
    }

}
