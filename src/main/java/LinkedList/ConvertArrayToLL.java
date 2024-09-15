package LinkedList;

/*

https://www.youtube.com/watch?v=Nq7ok-OyEpg&t=1759s
 */
public class ConvertArrayToLL {

    public static void main(String[] args) {
        int[] arr = {8,4,7,6};
        Node head = convertToLL(arr);

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=0;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

}

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}