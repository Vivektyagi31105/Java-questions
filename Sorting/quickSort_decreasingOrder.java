// Quick sort decreasing order
import java.util.*;

public class quickSort_decreasingOrder {
    static int partition(int arr[], int low, int high){
       int i=low;
       int pivot= arr[i]; // first element as pivot

       for(int j=low+1;j<=high; j++){
        if(arr[j]>= pivot){
            i= i+1;

            // swap arr[i] & arr[j]
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }
       }
        // swap arr[low] & arr[i]
        // to return correct index of the pivot element
         int temp = arr[low];
         arr[low] = arr[i];
         arr[i] = temp;
         return i;
       
    }
    static void quickSort(int arr[],int low, int high){
        if(low<high){
        //   divide array in subproblems
        int mid= partition(arr,low,high);

        // conquer those subproblems via recursion

        quickSort(arr, low, mid-1);
        quickSort(arr, mid+1, high);

        }
    }
    static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n= scn.nextInt();
        System.out.println("Enter the elements of an array: ");
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("Before sorting: ");
        print(arr, n);

        quickSort(arr, 0,n-1);
        System.out.println("After sorting");
        print(arr, n);
    }
}
