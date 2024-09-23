package LinkedList.DLL;

public class DeletionInDLL {

    public static void main(String[] args) {

    }

    private static Node deleteKElement(Node head,int k){
        // If LL is empty or has only one element
        if (head ==null)
            return null;

        Node temp = head;
        int counter = 0;

        while(temp!=null){
            counter++;
            if(counter==k){
                break;
            }

            temp = temp.next;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if(prev == null && front == null){
            return null;
        }else if(prev == null){
            return deleteHead(head);
        }else if(front == null){
            return deleteTail(head);
        }

        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back=null;

        return head;
    }

    private static Node deleteHead(Node head){

        // If LL is empty or has only one element
        if (head ==null || head.next == null)
            return null;

        Node prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;

        return head;
    }

    private static Node deleteTail(Node head){

        // If LL is empty or has only one element
        if (head ==null || head.next == null)
            return null;
        Node temp = head;

        while(temp.next!=null){
            temp= temp.next;
        }

        Node prev = temp.back;
        prev.next = null;
        temp.back = null;

        return head;
    }
}
