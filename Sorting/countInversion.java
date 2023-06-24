// Brutal force approach

import java.util.*;
public class countInversion {
    public static int numberOfinversion(int arr[], int n){
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
               if(arr[i]>arr[j]){
                count++;
               }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,8,3,4};
        int n= arr.length;

         int count=numberOfinversion(arr,n);
         System.out.println(count++);
    }
}
