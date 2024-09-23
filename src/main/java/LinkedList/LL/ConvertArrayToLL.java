package LinkedList.LL;

/*

This class has multiple things
1. Converting an array to linked list
2. finding length of the linked list
3. finding an element in linked list

https://www.youtube.com/watch?v=Nq7ok-OyEpg&t=1759s
 */
public class ConvertArrayToLL {

    public static void main(String[] args) {
        int[] arr = {8,4,7,6};
        Node head = convertToLL(arr);

        printLL(head);
        System.out.println("The length of linked list is: " + findLengthLL(head) );
    }

    static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println();

    }

    static Node convertToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static int findLengthLL(Node head){
        Node temp = head;
        int count =0;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    private static Boolean findElement(Node head, int target){
        Node temp = head;

        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }

        return false;
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