package BasicAlgorighms.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array 'A' consisting of 'N' integers, find the smallest subarray of 'A' containing exactly 'K' distinct integers.

If more than one such contiguous subarrays exist, consider the subarray having the smallest leftmost index.

For example - if A is [1, 2, 2, 3, 1, 3 ] and k = 2 then the subarrays: [1,2], [2,3], [3,1], [1,3] are the smallest
subarrays containing 2 distinct elements. In this case, we will consider the starting
and ending index of subarray [1,2] i.e. 0 and 1.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376574

Solution link: https://www.youtube.com/watch?v=akwRFY2eyXs
 */
public class SmallestSubArrayWithKDistinctElements {
    public static ArrayList<Integer> smallestSubarrayWithKDistinct(ArrayList<Integer> arr, int k)
    {
        // Write your code here
        // I need to review the below code again
        int n = arr.size();
        int start = 0, end = n;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (j < n)
        {
            map.put(arr.get(j), map.getOrDefault(arr.get(j), 0) + 1);
            j++;
            if (map.size() < k)
                continue;
            while (map.size() == k)
            {
                int windowLen = (j - 1) - i + 1;
                int subArrayLen = end - start + 1;
                if (windowLen < subArrayLen) {
                    start = i;
                    end = j - 1;
                }
                if (map.get(arr.get(i)) == 1)
                    map.remove(arr.get(i));
                else
                    map.put(arr.get(i), map.get(arr.get(i)) - 1);
                i++;
            }
        }
        if (start == 0 && end == n)
        {
            ar.add(-1);
            return ar;
        }
        else
        {
            ar.add(start);
            ar.add(end);
            return ar;
        }
    }
}
