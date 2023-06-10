import java.util.*;
public class deletionInLinkedList {
    
    Node Head;

    class Node{
        int data;
        Node Next;

        Node(int d){
            data =d;
            Next= null;
        }

    }
    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        // linked list is empty

        if(Head == null){
          Head = new Node(newData);
          return;
        }

        //linked list is not empty

        newNode.Next = null;
        Node temp = Head;
        while(temp.Next != null){
            temp = temp.Next;
        }
        temp.Next = newNode;
        return;
    }
    //  implementation of deletion of a node in a linked list

    public void deleteNode(int position){
        // linked list is empty
        if(Head == null){
            return;
        }

        Node temp = Head;
        // deletion is in the beginning of node
        if(position ==0){
            Head= temp.Next;
            return;
        }
        // deletion is not in the beginning of node
        for(int i=0; temp!= null && i<position-1; i++){
            temp= temp.Next;
        }
        if(temp==null && temp.Next==null){
            return;
        }
        temp.Next = temp.Next.Next;
    }

    // implementation of displaying the linked list
       public void displayLL(){
            Node temp = Head;
            while(temp!= null){
                System.out.print(temp.data+ " ");
                temp = temp.Next;
            }
        }
    public static void main(String[] args) {
        deletionInLinkedList list= new deletionInLinkedList();
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);

        System.out.println("Before deletion:");
        list.displayLL();
        System.out.println();

         list.insertAtEnd(15);
        list.deleteNode(3);

        System.out.println("After deletion:");
        list.displayLL();

        System.out.println();
    }
}
