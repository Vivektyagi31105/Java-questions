public class isPalindrome {
    Node Head;
    Node slow, fast, second_half_part;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
     boolean is_palindrome(Node Head){
        slow = Head;
        fast = Head;

        Node prevOfSlow = Head;
        Node midNode =null;
        boolean result= true;

        if(Head != null && Head.next != null){
            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                prevOfSlow = slow;
                slow= slow.next;
            }
            if(fast != null){
                midNode = slow;
                slow = slow.next;
            }
            second_half_part= slow;
            prevOfSlow.next =null;

            reverse();
            result= compare_lists(Head, second_half_part);
            reverse();

            if(midNode != null){
                prevOfSlow.next = midNode;
                midNode.next = second_half_part;
            }else{
                prevOfSlow.next = second_half_part;
            }
        }
            return result;
        }
         void reverse(){
            Node prev = null;
            Node current = second_half_part;
            Node next;

            while(current != null){
                next= current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            second_half_part = prev;
        }

        boolean compare_lists(Node head1, Node head2){
            Node temp1= head1;
            Node temp2= head2;

            while(temp1 != null && temp2 != null){
                if(temp1.data == temp2.data){
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }else
                return false;
            }
            if(temp1 == null && temp2 == null)
                return true;
                
            
            return false;
        

    }
    public void push(int newData){
       Node newNode = new Node(newData);
       newNode.next = Head;
       Head = newNode;
    }
    public static void main(String[] args) {
        isPalindrome list = new isPalindrome();
          int arr[] = {1,2,2,1};

          for(int i=0; i<arr.length; i++){
            list.push(arr[i]);
          }
          if(list.is_palindrome(list.Head)!= false){
            System.out.println("Is palindrome");
          }else{
            System.out.println("Not palindrome");
          }
    }
}
