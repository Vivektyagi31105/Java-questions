// Bubble sort implement
//  time complexity= O(n^2)

import java.util.*;

public class bubbleSort1{  
public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
      System.out.println("Type the number of elements in an array:");
    int n= scn.nextInt();
    System.out.println("Type the elements of an array");
    int arr[] = new int[n];
     for(int i=0; i<n; i++){
        arr[i]= scn.nextInt();
     }
  

     for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                // [<] for decreasing order
                int swap= arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= swap;
            }
        } 
     }
     System.out.println("Sorted array is: ");
     for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
     }
     
}
}
