import java.util.*;

public class segregate {
   public static void segregateArray(int arr[],int n){
        int pIndex= 0;

        for(int i=0; i<n; i++){
            if(arr[i]<0){
                int swap = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex]= swap;
                pIndex++;
            }

        }

    }
   public static void print(int arr[], int n){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={19, -20, 7, -4, -13, 11, -5, 3};
        int n= arr.length;
        System.out.println("Before segregate array: ");
        print(arr, n);
       
        segregateArray(arr,n);
        System.out.println("After segregate: ");
        print(arr, n);
      
    }
}
