import java.util.*;

public class middleDataInLinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        
        Node(int d){
            data =d;
            next = null;
        }
    }
    // implementation of insertion of a node at end 
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
        temp.next=newNode;
        return;
     }
    //  implementation of finding of middle data in linked list
    void middleNode(){
        Node slow = head, fast= head;
        while(fast != null&& fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        System.out.println("The middle data of a given linked list: "+slow.data);
    }

    public static void main(String[] args) {
        middleDataInLinkedList list = new middleDataInLinkedList();

        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.insertAtEnd(15);
      

        list.middleNode();
    }

}
