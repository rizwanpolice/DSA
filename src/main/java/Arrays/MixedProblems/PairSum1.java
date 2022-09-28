package Arrays.MixedProblems;

import java.util.*;


/*

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381883?leftPanelTab=0

*/

public class PairSum1 {
    public static int[][] pairSum(int[] arr, int s) {
        // We can use the Arrays.sort() method to sort our input array first
        // Time complexity of Arrays.sort() is O(nlogn)

        // Find array length by arr.length

        Arrays.sort(arr);
        int n= arr.length;
        int p1,p2;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n-1 ;i++){
            for(int j=i+1;i<n;j++){
                if(i+j == s){
                    List<Integer> li = new ArrayList<>();
                    if(i<=j){
                        p1=i;
                        p2=j;
                    }else{
                        p1=j;
                        p2=i;
                    }

                    li.add(p1);
                    li.add(p2);
                    ans.add(li);
                }
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
