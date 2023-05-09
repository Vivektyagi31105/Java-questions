// write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.
import java.util.*;
public class printBothDiagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m= scn.nextInt();
        int n= scn.nextInt();
             
        int arr[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("Both diagonal element: ");
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            if(i+j==0 || i+j ==m-1|| i==j){
                System.out.print(arr[i][j]+" ");
            }
            }
        }


    }
}
