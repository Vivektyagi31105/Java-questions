// Print the max value of the array [ 13, 1, -3, 22, 5].

import java.util.*;
class maxValueOfAnArray{
    static int maxValue(int arr[], int n){
        
            if(n==1){
                return arr[0];
            }else{
                return Math.max(arr[n-1],maxValue(arr, n-1));
            }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number of elements in an array:");
        int n= scn.nextInt();
        System.out.println("Type the elements of an array:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();

        }
        System.out.println("Max element in an array is:"+maxValue(arr, n));


    }
}