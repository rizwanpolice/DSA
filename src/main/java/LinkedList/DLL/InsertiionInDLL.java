package LinkedList.DLL;

public class InsertiionInDLL {

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,3,6,7,8,3};
        ConvertArrayToDLL convert = new ConvertArrayToDLL();
        Node head = convert.convertArray2DLL(arr);

        convert.printDLL(head);

    }

    public static Node insertBeforeHead(Node head, int val){


        return head;
    }
}
