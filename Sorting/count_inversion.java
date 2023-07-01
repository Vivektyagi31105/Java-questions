// partition-merge approach

import java.util.*;

public class count_inversion {
   
   public static int mergeProcedure(int arr[], int low, int mid, int high){
      
         int swap=0;
      
         int lsubArray[]= Arrays.copyOfRange(arr,low, mid+1);
         int rsubArray[]= Arrays.copyOfRange(arr,mid+1,high+1);

         int i=0,j=0, k=low;

         while(i< lsubArray.length && j<rsubArray.length){
        
            if(lsubArray[i] <= rsubArray[j]){
               
                arr[k++]= lsubArray[i++];
              
            }else{
                arr[k++] = rsubArray[j++];
          
                swap+= (mid+1)-(low+i);
            }
         }
         while(i< lsubArray.length){
            arr[k++]= lsubArray[i++];
         }

         while(j< rsubArray.length){
            arr[k++] = rsubArray[j++];
         }
         return swap;

    }
    public static int partition(int arr[], int low, int high){
   
        int count=0;

        if(low<high){
        
        int mid= low+(high-low)/2;
           
        count += partition(arr, low, mid);
        count += partition(arr ,mid+1, high);

        count += mergeProcedure(arr, low, mid, high);
        }
        
        return count;
    }
   
    public static void main(String[] args) {
        int arr[]= {1,5,2,8,3,4};
        int n= arr.length;
        
         int count= partition(arr, 0, n-1);

         System.out.println("The count inversion of array: "+count);
         
    }
}
