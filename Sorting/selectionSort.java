// implement Selection Sort
// Time complexity= O(n^2)

import java.util.*;
public class selectionSort {
    static void selection_Sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min_idx=i;
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_idx]){
                    // arr[j]> arr[min_idx] = for decrasing order
                  min_idx=j;
                }
            
            }
            if(min_idx != i){
                int swap= arr[min_idx];
                arr[min_idx]= arr[i];
                arr[i]= swap;
            }
           
        }
    }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Type the number of elements of aan array:");
    int n= scn.nextInt();
      
    System.out.println("Type the elements of an array:");
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
      arr[i]= scn.nextInt();
    }
    selection_Sort(arr);

     System.out.println("The sorted array is: ");
     System.out.println(Arrays.toString(arr));
    // for(int i=0; i<n; i++){
    //     System.out.print(arr[i]+" ");
    // }
  }
}
