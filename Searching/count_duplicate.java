// Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
// is not found in the array, report that as well.
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 5
// Output: Target 5 occurs 3 times
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 6
// Output: Target 6 occurs 2 times.

import java.util.*;
public class count_duplicate {
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

public static void countDuplicate(int arr[],int target){
    int firstOccurence= firstOccurence(arr, target);
    int lastOcurrence= lastOccurance1(arr, target);
     int result= lastOcurrence-firstOccurence+1;

     if(firstOccurence==-1 && lastOcurrence==-1){
        System.out.println("Target element not found");
     }else{
        System.out.println("Target occurs "+result+" times.");
     }

     
}
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Type number of elements in an array:");
        int n= scn.nextInt();
          System.out.println("Type the elements in an array:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("Type the target elements:");
        int target= scn.nextInt();
       
         countDuplicate(arr, target);

    }
}
