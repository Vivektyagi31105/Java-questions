// Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;
public class bubbleSortDecreasingOrder {
    static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean swapped= false;

            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int swap= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= swap;

                    swapped= true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number of elements:");
        int n= scn.nextInt();
        System.out.println("Type the elements of an array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        
        bubbleSort(arr);
        
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
