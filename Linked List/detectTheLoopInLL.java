public class detectTheLoopInLL {
    Node Head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next =null;
        }
    }
    // implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        // linkedlist is empty
        if(Head == null){
            Head = new Node(newData);
            return;
        }
        // linked list is not empty
        newNode.next= null;
        Node temp = Head;
        while(temp.next != null){
            temp =temp.next;
        }
        temp.next = newNode;
        return;

    }
    // implementation of detecting the loop in Linked list
    // Floyd's cycle detection algorthism
    void detectLoop(){
        int flag=0;
        Node slow = Head, fast= Head;
        while(slow != null && fast!= null && fast.next!= null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("No loop detect");
        }else{
            System.out.println("Loop is detected");
        }
    }
 
    public static void main(String[] args) {
        detectTheLoopInLL list = new detectTheLoopInLL();
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(9);
        list.insertAtEnd(12);
        list.insertAtEnd(15);
        list.insertAtEnd(18);
       list.insertAtEnd(9);
   


         Node temp = list.Head;
         while(temp.next!=null){
            temp= temp.next;
         }
         temp.next = list.Head;
         list.detectLoop();
         System.out.println();

    }
}
