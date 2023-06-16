// with iteratively

import java.util.*;
public class reverseInLinkedList {
    
    Node Head;

   class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next=null;
        }
    }
    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
            // linked list is empty
            if(Head == null){
                Head =new Node(newData);
                return;
            
        }
        // linked list is not empty
        newNode.next = null;
        Node temp = Head;

        while(temp.next != null){
            temp= temp.next;
        }
        temp.next= newNode;
        return;
     
    }
    // implementation of reversal in linked list
    public void reversalLinkedList(){
        Node curr = Head;
        Node prev = null;
        Node nextPtr = null;

        while(curr!= null){
            nextPtr = curr.next;
            curr.next= prev;
            prev= curr;
            curr= nextPtr;
        }
        Head= prev;
        return;
    }
        // implementation of displaying the linked list
         public void displayLinkedList(){
            Node temp= Head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp= temp.next;
            }

        }


    // implementation of displaying linked list
   public static void main(String[] args) {
    
   
         reverseInLinkedList list = new reverseInLinkedList();
          list.insertAtEnd(3);
          list.insertAtEnd(6);
          list.insertAtEnd(9);
          list.insertAtEnd(12);
          list.insertAtEnd(15);

          System.out.println("Before reverse:");
          list.displayLinkedList();
          System.out.println();

          list.reversalLinkedList();

          System.out.println("After insertion:");
          list.displayLinkedList();
          System.out.println();
      }
}
