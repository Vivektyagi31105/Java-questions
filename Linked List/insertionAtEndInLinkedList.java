import java.util.*;

 class insertionAtEndInLinkedList {
         Node Head;
         class Node{
            int data;
            Node next;

            Node(int d){
                data= d;
                next= null;
                
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
            // implementation of displaying the linked list
            public void displayLinkedList(){
                Node temp= Head;
                while(temp!= null){
                    System.out.print(temp.data+ " ");
                    temp= temp.next;

                } 
         }

         public static void main(String[] args) {
            insertionAtEndInLinkedList list= new insertionAtEndInLinkedList();
            list.insertAtEnd(2);
            list.insertAtEnd(4);
            list.insertAtEnd(8);

            System.out.println("Before insertion: ");
            list.displayLinkedList();
            System.out.println();

            list.insertAtEnd(10);

            System.out.println("After insertion: ");
            list.displayLinkedList();
            System.out.println();

         }
    
}
