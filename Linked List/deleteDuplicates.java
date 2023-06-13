public class deleteDuplicates {
    Node Head;

    class Node{
        int data;
        Node next;

        Node(int d){
         data = d;
         next= null;
        }
    }
    // implementation of insertion of a node at the end of linked list
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
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    // implementation of delete duplicate of linked list
     public void deleteDuplicate(){
        if(Head== null || Head.next!= null ){
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
    //  implementaton of displaying the linked list
     public void displayLinkedList(){
        Node temp = new Node();
        temp = this.Head;
        if(temp != null){
            
            System.out.println("The list contains:");
        
        while(temp != null){
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }else{
        System.out.println("List is empty");
    }
     }

     public static void main(String[] args) {
        deleteDuplicates list = new deleteDuplicates();
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.insertAtEnd(15);

        list.displayLinkedList();

        list.deleteDuplicate();

        list.displayLinkedList();
     }
}
