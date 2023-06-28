// WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;

public class selectionSortDecreasingOrder {
    
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min_idx= i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                int swap= arr[min_idx];
                arr[min_idx]= arr[i];
                arr[i]= swap;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Tyep the number of elements in an array:");
        int n= scn.nextInt();

        System.out.println("Type the elements in an array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        } 

        selectionSort(arr);
        
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
