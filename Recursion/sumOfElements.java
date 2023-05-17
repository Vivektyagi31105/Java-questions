import java.util.*;
public class sumOfElements {
    static int sumOfElement(int arr[],int n){
        if(n<=0){
            return 0;
        }else{
            return sumOfElement(arr, n-1)+ arr[n-1];
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type the number of elements in an array:");
        int n= scn.nextInt();
        System.out.println("Type the elements of an array:");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        System.out.println("The sum of elements is: "+ sumOfElement(arr,n));
    }
}
