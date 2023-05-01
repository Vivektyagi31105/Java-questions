// Print the following
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.

import java.util.Scanner;

class assignmentNo1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m= scn.nextInt();
        int n=scn.nextInt();

        int arr[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            arr[i][j]=scn.nextInt();
            }
        }

        int numOfPositive =0;
        int numOfNegative =0;
        int numOfOdd =0;
        int numOfEven =0;
        int numOfZero =0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] >0){
                    numOfPositive++;
                }
                if(arr[i][j] < 0){
                    numOfNegative++;
                }
                
                if(arr[i][j] % 2 != 0){
                    numOfOdd++;
                }
                if(arr[i][j] % 2 == 0){
                    numOfEven++;
                }

                if(arr[i][j] == 0){
                    numOfZero++;
                }
            }
        }
        System.out.println("Number of Positive "+numOfPositive);
        System.out.println("Number of Negative "+numOfNegative);
        System.out.println("Number of Odd "+numOfOdd);
        System.out.println("Number of Even "+numOfEven);;
        System.out.println("Number of Zero "+numOfZero);

        
    }
}
