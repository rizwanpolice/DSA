package Arrays.MixedProblems;

import java.util.*;

/*

You are given an integer array 'ARR' of size 'N' and an integer 'S'.
Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.

Each pair should be sorted i.e the first value should be less than or equals to the second value.

Return the list of pairs sorted in non-decreasing order of their first value.
In case if two pairs have the same first value, the pair with a smaller second value should come first.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381883?leftPanelTab=0

Sol link: youtube.com/watch?v=s1xA_K1JReo
*/

public class PairSum2 {

    public static int[][] pairSum(int[] arr, int s) {
        // We can use the Arrays.sort() method to sort our input array first
        // Time complexity of Arrays.sort() is O(nlogn)

        // Find array length by arr.length

        Arrays.sort(arr);
        int n= arr.length;
        int p1,p2,left=0,right=n-1;

        List<List<Integer>> ans = new ArrayList<>();

        // this logic we use when we have to find all the pairs
        while (left<right){
            if(arr[left] + arr[right] > s){
                right--;
            }else if(arr[left] + arr[right] < s){
                left++;
            }else{
                List<Integer> li = new ArrayList<>();
                li.add(arr[left]);
                li.add(arr[right]);
                ans.add(li);
                left++;
            }
        }

        int[][] finalAns = new int[ans.size()][2];

        for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                finalAns[i][j] = ans.get(i).get(j);
            }
        }

        return finalAns;
    }
}
