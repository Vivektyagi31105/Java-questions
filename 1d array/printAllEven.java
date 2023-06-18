//  traverse over all the elements of the array using for each loop and print all even elements.
import java.util.*;
public class printAllEven {
    public static void main(String[] args) {
        int arr[] ={34,21,64,65,43};
        for(int elements : arr){
            if(elements % 2 == 0){
                System.out.println(elements);
            }
        }
    }
}
