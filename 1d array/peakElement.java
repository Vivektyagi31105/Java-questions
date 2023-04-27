//  find peak element. A peak element which is greater than left and right.
public class peakElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,6,5};

        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
   
            }
        }
    }
}
