// quick sorting increament 
// time complexity- nlogn
import java.util.*;

 public class quickSort{
    public static int partition(int arr[],int l, int h){
        int i= l;
        int pivot = arr[i]; //pivot as first element
        for(int j=l+1; j<=h; j++){
            if(arr[j]<= pivot){
                i++;
            
            // swap (arr[i],arr[j])
            int swap = arr[i];
            arr[i]= arr[j];
            arr[j] = swap;
        }
    }
    
    // swap (arr[l], arr[i])
    // to return the correct index of the pivot element

    int temp = arr[l];
    arr[l]= arr[i];
    arr[i] = temp;
    return i;
}
  public static void quick_sort(int arr[], int l, int h){
        if(l<h){
            // 1. divide the array into subproblems
            int m= partition(arr, l,h);
            // 2. conquer those sub problems via recursion
            quick_sort(arr, l, m-1);
            quick_sort(arr, m+1, h);
        }
    }
   static void printArr(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]= {23,54,76,33,98,2,56};
        int n= arr.length;
        System.out.println("Array before sorting: ");
        printArr(arr,n);

        quick_sort(arr, 0,n-1);

        System.out.println("Array after sorting: ");
        printArr(arr, n);
    }
}
