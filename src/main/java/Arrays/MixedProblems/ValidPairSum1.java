package Arrays.MixedProblems;

import java.util.*;

/*

You need to return true if the given array can be divided into pairs such that the sum of every pair gives remainder 'M' when divided by 'K'.
Otherwise, you need to return false.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381885?leftPanelTab=3

Solution link1: https://www.youtube.com/watch?v=uVLp1tkT4NU
Solution link2: https://www.youtube.com/watch?v=BvKv-118twg

 */
public class ValidPairSum1 {

    public static boolean isValidPair(int[] arr, int n, int k, int m)
    {

        // If there are no even set of numbers, we cannot form a pair itself
        if(n%2 != 0){
            return false;
        }

        boolean answer = true;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int rem = ((arr[i]%k) + k ) % k;

            int val = map.getOrDefault(rem,0);
            map.put(rem, val+1);
        }

        int check1,check2;
        for(int i=0;i<n;i++){
            int rem = arr[i]%k;

            check1 = map.get(rem);

            if(rem <=m){
                check2 = map.getOrDefault(m-rem,-1);
            } else {
                check2 = map.getOrDefault(k-rem+m,-1);
            }

            if(check1!=check2){
                answer= false;
            }
        }

        return answer;
    }

}
