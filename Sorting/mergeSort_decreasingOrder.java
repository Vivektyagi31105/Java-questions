import java.util.*;
public class mergeSort_decreasingOrder {
    static void mergeProcedure(int arr[], int low ,int mid,int high){
        // i- left subarray pointer
        // j- right subarray pointer

         int i,j,k; 
        //  size of left and right subarray
        int n1= mid-low+1;
        int n2= high-mid;

        // left subarray
        int lsubarray[]= new int[n1];
        
        // right subarray
        int rsubarray[] = new int[n2];

        // copy data into left and right subarray
        for(i=0; i<n1; i++){
            lsubarray[i] = arr[low+i];
        }

        for(j=0; j<n2; j++){
            rsubarray[j] = arr[mid+1+j];
        }

        // comparison b/w elements in left and right subarray
        i=0;
        j=0;
        k=low;

        while(i<n1 && j<n2){
            if(lsubarray[i] > rsubarray[j]){
                arr[k] = lsubarray[i];
                i= i+1;

            }else{
                arr[k]= rsubarray[j];
                j= j+1;
            }
            k= k+1;
        }
        // copying all the remaining elements from the left subarray
        while(i<n1){
            arr[k] = lsubarray[i];
            i= i+1;
            k= k+1;
        }

        // copying all the remaining elements from the rigth subarray

        while(j<n2){
            arr[k] = rsubarray[j];
            j=j+1;
            k= k+1;
        }


    }

    static void mergeSort(int arr[], int low, int high){
        if(low< high){
            // divide the array in subproblems
            int mid=  low+(high-low)/2;
            // conquer the subproblems via recursion

            // left subarray
            mergeSort(arr, low, mid);

            // right subarray
            mergeSort(arr, mid+1, high);
            
            // combine solution of all subproblems 
            mergeProcedure(arr,low,mid,high);
        }
    }

    static void print(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter the number of elements in the array: ");
       int n= scn.nextInt();
       
       System.out.println("Enter the elements of array: ");
       int arr[] = new int[n];
       
       for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
       }
      System.out.println("Before sorting:");
      print(arr, n);
      mergeSort(arr, 0, n-1);

      System.out.println("After sorting: ");
      print(arr, n);
    }
}
