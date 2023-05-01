// Q4: Write a program to find the largest element of a given 2D array of integers.

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n= scn.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                 arr[i][j]=scn.nextInt();

            }
        }
        int largestNum= arr[0][0];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
              if(arr[i][j]>largestNum){
                largestNum=arr[i][j];
              }

            }
        }
        System.out.println("Largest number: "+largestNum);

    }
}
