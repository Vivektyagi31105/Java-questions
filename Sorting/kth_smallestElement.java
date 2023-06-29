import java.util.*;
public class kth_smallestElement {
     static int  partition(int arr[],int low, int high){
        int pivot = arr[low];
        int i= low;
   
        for(int j=i+1; j<=high; j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int swap = arr[low];
        arr[low]= arr[i];
        arr[i]= swap;

       
       return i;
    }

    static int selectionProcedure(int arr[], int low, int high,int k){
      
        int mid= partition(arr, low, high);

        if(mid== k-1){
            return arr[mid];
        }else if(mid>k-1){
            return selectionProcedure(arr, low, mid-1,k);
        }
        return selectionProcedure(arr, mid+1, high,k);
      
    }
   

    public static void main(String[] args) {
        int arr[] = {20,10,5,30,40,50};
        int n= arr.length;
        int k=1;
    int result= selectionProcedure(arr,  0, n-1,k);
    System.out.println("kth smallest element is: "+result);

    }
}
