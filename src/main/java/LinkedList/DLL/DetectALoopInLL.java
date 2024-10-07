package LinkedList.DLL;

import java.util.HashMap;

/*

https://www.youtube.com/watch?v=wiOo4DC5GGA&list=PLgUwDviBIf0rAuz8tVcM0AymmhTRsfaLU&index=15

Problem link: https://leetcode.com/problems/linked-list-cycle/solutions/1322320/detect-loop-in-singly-linked-list-using-java/

 */
public class DetectALoopInLL {

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,3,6,7,8,3};
        ConvertArrayToDLL convert = new ConvertArrayToDLL();
        Node head = convert.convertArray2DLL(arr);

        convert.printDLL(head);

        boolean flag = detectLoop(head);

        System.out.println("Loop detected is: " + flag );
    }

    //The below code is using a hashmap, this require extra space complexity
    public static boolean detectLoop(Node head){
        Node temp = head;

        HashMap<Node, Integer> map = new HashMap<>();

        while(temp!=null){

            if(map.containsKey(temp)){
                return true;
            }else {
                map.put(temp,1);
            }


            temp = temp.next;
        }

        return false;

    }


    //The below code is the optimized code using slow and fast pointers
    public static boolean detectLoop1(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null || fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
