package Arrays.MixedProblems;

import java.util.*;

/*
You are given an unsorted array/list 'ARR' of 'N'  integers.
Your task is to return the length of the longest consecutive sequence.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381889?leftPanelTab=0
 */

public class LongestConsecutiveSequence {

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {

        // Arrays.sort() function is used to sort an array. The time complexity is O(nlogn)
        Arrays.sort(arr);
        int max = 0, count=1 , dup =0;

        if(N==0){
            return 0;
        }

        if(N==1){
            return 1;
        }

        for(int i=0;i<N-1;i++){
            if(arr[i] + 1 == arr[i+1]){
                count++;
            }else if(arr[i] == arr[i+1]){
                dup++;
            }else {
                count=1;
                dup=0;
            }

            if(max<count){
                max = count;
            }
        }

        return max;
    }
}
