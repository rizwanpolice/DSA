package RecurionAndBacktracking.Recursion.MixedProblems;

import java.util.ArrayList;

/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
frequency of at least one of the chosen numbers is different.

Problem link: https://leetcode.com/problems/combination-sum/description/
Solution link: https://www.youtube.com/watch?v=OyZFFqQtu98&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=10

 */
public class CombinationSum1 {

    public static void combinationSum(int ind, int n, int target, int[] arr, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans){
        if(ind == n){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }

            return;
        }

        // This is the pick case, since we are picking the same element again and again until it does not cross target
        //Very important, not that we have not incremented index here because we want to pick the same element again and again
        if(arr[ind] <= target) {
            ds.add(arr[ind]);
            combinationSum(ind, n, target - arr[ind],arr, ds, ans);
            ds.remove(ds.size()-1);
        }

        //This is the not pick case.
        combinationSum(ind+1,n,target,arr,ds,ans);
    }

    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> ds = new ArrayList<>();
            int target = 7;
            int[] arr = {2,3,6,7};
            combinationSum(0,4,target,arr,ds,ans);


            for(int i=0;i<ans.size();i++){
                for(int j=0;j<ans.get(i).size();j++){
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();

            }
    }
}
