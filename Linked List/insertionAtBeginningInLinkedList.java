import java.util.*;

public class insertionAtBeginningInLinkedList {
    Node Head;

    class Node{
        int data;
        Node Next;
        
        Node(int d){
            data =d;
            Next =null;
        }
    }

 // implementation of insertion of a node at the beginning

    public void insertionAtBeginning(int newData){
        Node newNode =new Node(newData);
        newNode.Next =Head;
        Head= newNode;
       
    }

    //   implementation of display the linked list
    public void displayLinkedList(){
        Node temp =Head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.Next;
        }

    }
    public static void main(String[] args) {
        insertionAtBeginningInLinkedList list = new insertionAtBeginningInLinkedList();
        list.insertionAtBeginning(3);
        list.insertionAtBeginning(6);
        list.insertionAtBeginning(9);
        list.insertionAtBeginning(27);

        System.out.println("Before insertion: ");
        list.displayLinkedList();
        System.out.println();

        list.insertionAtBeginning(1);

        System.out.println("After insertion: ");
        list.displayLinkedList();
        System.out.println();
        

    }
}
