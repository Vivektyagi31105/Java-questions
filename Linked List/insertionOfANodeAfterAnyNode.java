import java.util.*;
public class insertionOfANodeAfterAnyNode {
    
    Node Head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next = null;
        }
    }
   
    // implementation of insertion of a node at the end

    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        // linked list is empty

        if(Head == null){
           Head= new Node(newData);
           return;
        }
        // linked list is not empty

        newNode.next=null;
        Node temp = Head;
        while(temp.next != null){
          temp= temp.next;
        }
        temp.next= newNode;
        return;
    }
     // implementation of insertion of a node after any node

     public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The previous node cannot contain null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }
       //   implementation of display the linked list
       public void displayLinkedList(){
        Node temp =Head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        insertionOfANodeAfterAnyNode list = new insertionOfANodeAfterAnyNode();
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);

        System.out.println("Before insertion");
        list.displayLinkedList();
        System.out.println();

        list.insertAfter(list.Head.next.next, 10);

        System.out.println("After insertion");
        list.displayLinkedList();
        System.out.println();

    }
}
