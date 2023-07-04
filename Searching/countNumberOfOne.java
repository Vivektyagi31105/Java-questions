// Given a sorted binary array, efficiently count the total number of 1’s in it.
// Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
// Output 1: 6
// Input 2: arr = [ 0 0 0 0 0 1 1]
// Output 2: 2

import java.util.*;

public class countNumberOfOne {
   public static int count1(int arr[], int n){
        int low=0, high= arr.length-1;
        int result=0;

        while(low<= high){
            int mid= low+(high-low)/2;
            if(arr[mid]==0){
              low= mid+1;
        }else if(arr[mid]==1){
                result= n-mid;
                high= low-1;
          }
        }
        return result;
       
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Input the number of elements in an array:");
        int n=scn.nextInt();
       
        System.out.println("Type the elements of an array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
   
        int result= count1(arr,n);

        System.out.println("Number of 1's in an array: "+result);

    }
}
