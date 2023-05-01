// Write a program to print the elements above the secondary diagonal in a user inputted square matrix.

import java.util.*;
public class aboveSeconaryDiagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m= scn.nextInt();
        int n= scn.nextInt();

        int arr[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();

            }
        }
        System.out.println("Elements above secondary diagonal:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
    
            if(i+j <m-1){
            
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}
