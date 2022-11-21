package BasicAlgorighms.SlidingWindow;

import java.util.HashMap;

/*
Given an array 'arr' of 'N' integers and an integer 'K'. The array 'arr'  may contain duplicate integers. Return "true"
if the array contains any duplicate element within the 'K' distance from each other, otherwise, return  "false".

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376579?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=yHIEUkW6BnY

 */
public class ContiansDuplicate {
    public static boolean checkDuplicate(int[] arr, int n, int k) {

        //This problem does not even require sliding window technique
        //The below solution clearly works
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(i-map.get(arr[i])<=k){
                    return true;
                }
            }
            map.put(arr[i],i);
        }

        return false;
    }
}

/*
Time complexity: O(n)
space complexity: O(n)
 */