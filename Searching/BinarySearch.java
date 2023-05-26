
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[], int x) {
        int low=0, high= arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                    low= mid+1;
                }else{
                    high= mid-1;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number of element in array:");
        int n= scn.nextInt();
        
        System.out.println("Type elements of array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        
        System.out.println("Type the key element:");
        int x= scn.nextInt();

        int result=binarySearch(arr,x);

         if(result==-1){
            System.out.println("element not found");
         }else{
            System.out.println("element found on index: "+result);
         }
        
    }
}
