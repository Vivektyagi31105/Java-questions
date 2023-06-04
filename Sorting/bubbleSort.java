import java.util.*;
public class bubbleSort {
    public static void bubble_Sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean swapped= false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int swap = arr[j];
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
        Scanner scn= new Scanner(System.in);
        System.out.println("Type number of elements in an array: ");
        int n= scn.nextInt();
        System.out.println("Type the elements of an array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        bubble_Sort(arr);

         System.out.println("Sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
