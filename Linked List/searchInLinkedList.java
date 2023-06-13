import java.util.*;
class searchInList{
    Node Head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next=null;
        }
    }
    // implementation of insert a new node at front of list
    public void push(int newData){
        
        Node newNode = new Node(newData);
        newNode.next = Head;
        Head=  newNode;
    }

    // check whether the value X is present in linked list
    
    public boolean search(Node Head, int X){
        Node current = Head;

        while(current != null){
            if(current.data == X)
                return true;
               current= current.next; 
             
        }   
        return false;
          
    }
    public static void main(String[] args) {
        searchInList list = new searchInList();
        list.push(14);
        list.push(21);
        list.push(11);
        list.push(30);
        list.push(10);

        if(list.search(list.Head, 14)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
