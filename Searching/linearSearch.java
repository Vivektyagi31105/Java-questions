// Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
// else print “Element not found in array”. Input the size of array, array from user and the element X from user.
// Use Linear Search to find the element.

import java.util.*;
public class linearSearch {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    System.out.println("Input number of element in array:");
    int n= scn.nextInt();
    
    System.out.println("Input array elements:"); 
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i]= scn.nextInt();
    }
    
    System.out.println("Input target element:");
    int target= scn.nextInt();

    int idx=-1;
    for(int i=0; i<n; i++){
        if(arr[i]==target){
            idx=i;
            break;
        }
    }
    
    if(idx==-1){
        System.out.println("Element not found in array");
    }else{
        System.out.println("Element found on index: "+ idx);
    }
  }
    
}
