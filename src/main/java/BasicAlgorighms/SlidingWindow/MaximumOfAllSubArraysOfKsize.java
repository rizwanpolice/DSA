package BasicAlgorighms.SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/*
You are given an array “A” of N integers.
Your task is to find the maximum element in all K sized contiguous subarrays from left to right.

Can you solve the problem in O(N) time complexity and O(K) space complexity?

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376580

Solution link: https://www.youtube.com/watch?v=xFJXtB5vSmM

 */
public class MaximumOfAllSubArraysOfKsize {

    public static List<Integer> maximumInAllSubarraysOfSizeK(int[] arr, int n, int k) {
        // Write your code here!
        // Need to learn about Array Deque data structure for this code

        List<Integer> ans=new ArrayList<>();
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        for(int i=k;i<n;i++){
            ans.add(arr[dq.peek()]);
            while(!dq.isEmpty() &&dq.peekFirst()<=i-k)
                dq.removeFirst();
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }
        ans.add(arr[dq.peek()]);
        return ans;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
