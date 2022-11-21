package BasicAlgorighms.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

/*
You are given an array ‘ARR’ of size ‘N’ and an integer ‘K’. Your task is to find the total number of distinct elements present in every ‘K’ sized window of the array.
A ‘K’ sized window can also be viewed as a series of continuous ‘K’ elements present in the sequence.

1. The size of ‘ARR’ will always be greater than or equal to the ‘K’.
2. Here window refers to a subarray of ‘ARR’. Hence ‘K’ sized window means a subarray of size ‘K’.
3. You are not required to print the output explicitly. It has already been taken care of.
Just implement the function and return an array of the count of all distinct elements in the ‘K’ size window.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376578?leftPanelTab=0

Solution: Follow the standard pattern for sliding window - https://www.youtube.com/watch?v=xFJXtB5vSmM
 */

public class DistinctElementinKWindowSize {
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;

        while(j<arr.size()){
            int num = arr.get(j);

            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }

            if((j-i+1)==k){
                int count = map.size();
                ans.add(count);
                int start = arr.get(i);

                if(map.get(start)==1){
                    map.remove(start);
                }else{
                    map.put(start,map.get(start)-1);
                }

                j++;
                i++;
            }

            //This condition should be below the above (j-i+1) condition as J gets incremented in this case and matches the condition for sliding window
            if((j-i+1) < k)
                j++;
        }

        return ans;
    }
}

/*
Time complexity: O(n)
Space complexity: O(n)
 */