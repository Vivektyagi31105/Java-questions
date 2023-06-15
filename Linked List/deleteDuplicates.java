
import java.util.*;

public class deleteDuplicates {
static Node Head;

    class newNode{
        int data;
        Node next;

        newNode(int d){
            data =d;
            next=null;
        }
    }
 
    
    // implementation of insertion of a node at the end of linked list
    public void insertAtEnd(int newData){
        
         Node newNode = new Node();
    newNode.data = newData;
    newNode.next = null; 
        
    if(Head == null) {
      Head = newNode;
    } else {
      Node temp = new Node();
      temp = Head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
    }   
    }
    
    // implementation of delete duplicate of linked list
     public static void delete_Duplicate(){
        if(Head== null || Head.next== null ){
            return;
            
        }
        Node curr= Head;
        while(curr!= null && curr.next!= null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return;
     }
    
    //  implementation of displaying the linked list
     public void displayLinkedList(){
        Node temp = new Node();
        temp = this.Head;
        if(temp != null){

            System.out.print("The list contains: ");
        
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }else{
        System.out.println(" The list is empty.");
    }
     }

     public static void main(String[] args) {
        deleteDuplicates list = new deleteDuplicates();

        list.insertAtEnd(3);
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.insertAtEnd(12);
        list.insertAtEnd(12);
        list.insertAtEnd(15);

        list.displayLinkedList();

        delete_Duplicate();

        list.displayLinkedList();
     }
}
