// Merge sort
// Time complexity- O(nlogn)
// space complexity- O(n)

import java.util.*;

public class mergeSort{
    
    public static void mergeProcedure(int arr[], int l, int mid, int r){
        
        int i,j,k;   //i- left subarray pointer, j- right subarray pointer

        // size of left and right subarray
        int n1 = mid-l+1;
        int n2 = r -mid;
        
        // left subarray and right subarray
        
        int lsubarray[]= new int[n1];
        int rsubarray[]= new int[n2];

        // copying data into left and right subarrays
        for(i=0; i<n1;i++){
            lsubarray[i]= arr[l+i];
        }

        for(j=0; j<n2; j++){
            rsubarray[j]= arr[mid+1+j];
        }

        // comparison b/w elements in left and right subarray
        i=0;
        j=0;
        k=l;

        while(i<n1 && j< n2){
            if(lsubarray[i] <= rsubarray[j]){
                arr[k] = lsubarray[i];
                i++;
            }else{
                arr[k]= rsubarray[j];
                j++;
            }
            k++;
        }
        // copying all the remaining elements from the left subarray
        
        while(i<n1){
            arr[k] = lsubarray[i];
            i++;
            k++;
        }
        // copying all the remaining elements from the right subarray

        while(j<n2){
            arr[k] = rsubarray[j];
            j++;
            k++;
        }


    }
   public static void merge_Sort(int arr[],int l, int r){
        if(l<r){
            // divide the array into two subproblem
            int mid = l+(r-l)/2;
            // conquer subproblems using recursion
            // left subarray
            merge_Sort(arr, l, mid);

            // right subarray
            merge_Sort(arr, mid+1, r);
            // combine solution of all subproblems
            mergeProcedure(arr,l,mid,r);
        }
    }
    public static void printArr(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={34,23,55,12,64,98};
        int n= arr.length;

        System.out.println("Array before sorting: ");
        printArr(arr,n);
         merge_Sort(arr,0,n-1);
        System.out.println("Array after sorting: ");
        printArr(arr, n);
    }
}
