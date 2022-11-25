package BasicAlgorighms.SlidingWindow;

import java.util.HashSet;
/*
You are given an array 'ARR' of 'N' positive integers. You need to find the length of the longest switching contiguous subarray.

If the given 'ARR' is [1, 4, 1, 4, 3, 2, 3, 0]. Then {1, 4, 1, 4}, {3, 2, 3}, {3, 0}, {0}
are some of the switching subarrays. But {1, 4, 3}, {1, 4, 1, 4, 3, 2, 3} are not.

Problem: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376576
Solution: Look through solutions in discuss section

 */
public class LongestSwitchingSubArray {
    public static int switchingSubarray(int[] arr, int n) {

        HashSet<Integer> set = new HashSet<>();
        int i=0,j=0,max=0;
        while(j<n){

            if(j>1&&arr[j]!=arr[j-2]){
                i=j-1;
            }
            j++;
            max = Math.max(max,j-i);
        }


        return max;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
