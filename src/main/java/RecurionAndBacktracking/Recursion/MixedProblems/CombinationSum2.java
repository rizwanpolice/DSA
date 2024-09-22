package RecurionAndBacktracking.Recursion.MixedProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Problem link: https://leetcode.com/problems/combination-sum-ii/description/
Solution link: https://www.youtube.com/watch?v=G1fRTGRxXU8&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=11
 */
public class CombinationSum2 {

    // This is the second variant of recursion, where instead of pick and non pick (only two recursion calls), we are going to take
    // multiple recursion calls using a for loop and then deciding in for loop, whether to continue or pick it.
    public static void combinationSum2(int ind, int target, int[] arr, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans){
        if(target == 0 ){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<arr.length;i++){
            //This condition is to check whether same element is getting picked up again in combination
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }

            //This is where we will break further recursion calls, when the element exceeds target value,
            // Note the elements in array are in sorted order, that is when this is possible
            if(arr[i]>target){
                break;
            }

            ds.add(arr[i]);
            combinationSum2(i+1, target-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        int target = 4;
        int[] arr = {1,1,1,2,2};
        Arrays.sort(arr);
        combinationSum2(0,target,arr,ds,ans);


        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();

        }
    }
}
