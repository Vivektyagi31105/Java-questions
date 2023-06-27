// implement insertion sort
// time compelxity = O(n^2)

import java.util.*;
public class insertionSort {
    public static void insertion_Sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                // arr[j]>arr[j-1] for decreasing order
                int swap = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = swap;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number of elements in an array:");
        int n= scn.nextInt();
          System.out.println("Type the number of elements in an array:");
          int arr[]= new int[n];
          for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
          }

          insertion_Sort(arr);
           System.out.println("Sorted array is: ");

          for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
          }

    }
}
