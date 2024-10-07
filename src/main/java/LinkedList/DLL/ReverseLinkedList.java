package LinkedList.DLL;


import java.util.Stack;

/*

https://www.youtube.com/watch?v=u3WUW2qe6ww&list=PLgUwDviBIf0rAuz8tVcM0AymmhTRsfaLU&index=5

 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,3};
        ConvertArrayToDLL convert = new ConvertArrayToDLL();
        Node head = convert.convertArray2DLL(arr);

        convert.printDLL(head);

        head = reverseDLL(head);

        convert.printDLL(head);
    }

    public static Node reverseDLL(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();

        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }

        // we make temp is equal to head again so that we can traverse from the beginning again
        temp = head;
        while(temp!=null){
            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;

    }

}
