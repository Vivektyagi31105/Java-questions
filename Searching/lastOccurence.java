// Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
// not present return -1.
// Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
// Output 1: 6
// Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
// Output 2: -1

import java.util.*;

public class lastOccurence {
   public static int lastOccurance1(int arr[], int target){
        int low=0, high= arr.length-1;
        int result=-1;

        while(low<= high){
            int mid= low+(high-low)/2;
           
            if(arr[mid]== target){
               
                result= mid;
                low= mid+1;
               
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high= mid-1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Input number of elements in an array:");
        int n= scn.nextInt();
        System.out.println("Type elements of an array");
       
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
       
        System.out.println("Input the target element");
        int target = scn.nextInt();

        int result = lastOccurence1(arr, target);

        if(result == -1){
            System.out.println("Target element not present");
        }else{
            System.out.println("Target Element last occurence present on element: "+ result);
        }    
    }
   
}
