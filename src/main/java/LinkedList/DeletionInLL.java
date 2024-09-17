package LinkedList;

/*

https://www.youtube.com/watch?v=VaECK03Dz-g
 */

public class DeletionInLL {

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8};
        ConvertArrayToLL convert = new ConvertArrayToLL();
        Node head = convert.convertToLL(arr);
        convert.printLL(head);
        head = removeKElement(head, 5);
        convert.printLL(head);

    }

    private static Node removeHead(Node head){
        if(head == null ) return head;

        head = head.next;
        return head;
    }

    private static Node removeLastElement(Node head){

        //if only one element is present or no element present, then we remove one element from it, the linked list will be null
        if(head == null || head.next == null ) return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    //remove element present in k position
    private static Node removeKElement(Node head, int k) {
        if(head == null) return head;

        if(k==1){
            head = head.next;
            return head;
        }

        Node temp = head, prev = null;
        int counter = 0;

        //traversing through the linked list
        while(temp != null){
            counter++;
            //check if the counter is matching kth element
            if(counter == k){
                prev.next = prev.next.next;
                break;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }

    private static Node removeElement(Node head, int value) {
        if(head == null) return head;

        if(head.data==value){
            head = head.next;
            return head;
        }

        Node temp = head, prev = null;

        //traversing through the linked list
        while(temp != null){

            //check if the counter is matching kth element
            if(temp.data == value){
                prev.next = prev.next.next;
                break;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}
