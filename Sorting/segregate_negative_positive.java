import java.util.*;

public class segregate_negative_positive {
    
   public static void segregate(int arr[], int temp[],int low, int mid, int high){
        int i=0, j=0, k=low;

        // copy negative elements from left subarray
        for(i= low; i<=mid; i++){
            if(arr[i]<0){
                temp[k++]= arr[i];
            }
        }
        // copy negative elements from right subarray
        for(j= mid+1; j<=high; j++){
            if(arr[j]<0){
                temp[k++]= arr[j];
            }
        }

        // copy positive elements from left subarray
        for(i= low; i<= mid; i++){
            if(arr[i]>= 0){
                temp[k++]= arr[i];
            }
        }
        // copy positive elements from right subarray
        for(j= mid+1; j<= high; j++){
            if(arr[j]>=0){
                temp[k++]= arr[j];
            }
        }
        // copy back to original array
        for(i= low; i<= high; i++){
            arr[i]= temp[i];
        }

    }
    static void partition(int arr[],int temp[],int low,int high){
        if(high<=low){
            return;
        }
        // divide the array into subproblems
        // mid of array
        int mid= low+(high-low)/2;
      // conquer the subproblems via recursion
        // split the left subarray
        partition(arr, temp, low, mid);

        // spllt the right subarray
        partition(arr, temp, mid+1, high);

        //  combine left and right subarray
        segregate(arr,temp,low,mid,high);

    }
    static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={19, -20, 7, -4, -13, 11, -5, 3};
        int n= arr.length;
        int temp[] = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        System.out.println("Before segregate array: ");
        print(arr, n);

        partition(arr, temp, 0, n-1);

        System.out.println("After segregate array: ");
        print(arr, n);
    }
}
