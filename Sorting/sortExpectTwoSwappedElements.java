import java.util.*;9p
public class sortExpectTwoSwappedElements {
    static void sortArr(int arr[],int n){
        int a=-1,b=-1;
        int prev = arr[0];

        for(int i=1; i<n; i++){
            if(prev >arr[i]){
                if(a == -1){
                    a= i-1;
                    b=i;
                }else{
                    b=i;
                }
                
                }else{
                    prev= arr[i];
            }

        }
        int swap = arr[a];
        arr[a]= arr[b];
        arr[b]=swap;
    }
    static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,8,6,7,5,9,10};
        int n= arr.length;

        System.out.println("Before swap: ");
        print(arr, n);

        sortArr(arr, n);

        System.out.println("After swap: ");
        print(arr, n);
    }
}
