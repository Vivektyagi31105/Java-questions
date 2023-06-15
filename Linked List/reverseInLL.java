// reverse with recursion
import java.util.*;

public class reverseInLL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next= null;
        }
    }
    // implementation of insertion of a node at the end

    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        // linked list is empty
        if(head == null){
            head = new Node(newData);
            return;
        }
        // linked list is not empty

        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = newNode;
        return;
    }
    // implementation of reverse in linked list
    public void reverseRecursion(Node curr, Node prev){
        // last node of a linked list
          if(curr.next == null){
            head= curr;
            curr.next = prev;
            return;
          }
          Node nextPtr = curr.next;
          curr.next = prev;
          reverseRecursion(nextPtr, curr);
    }
    void displayLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp= temp.next;

        }
    }
  
    public static void main(String[] args) {
        reverseInLL list = new reverseInLL();
        list.insertAtEnd(3);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.insertAtEnd(15);
        list.insertAtEnd(18);

        System.out.println("Before reverse:");
        list.displayLinkedList();
        System.out.println();

        list.reverseRecursion(list.head, null);

        System.out.println("After reverse:");
        list.displayLinkedList();
        System.out.println();

    }
}
