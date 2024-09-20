package RecurionAndBacktracking.Recursion.MixedProblems;

import java.util.ArrayList;

/*

Print only one subsequence with Sum K

https://www.youtube.com/watch?v=eQCS_v3bw0Q&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=7

 */
public class PrintOnlyOneSubsequenceWithSumK {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1,2,1};

        solveSubsequenceKSum(ans,0,0,2,arr,3);
    }

    public static boolean solveSubsequenceKSum(ArrayList<Integer> ans,int ind, int s, int sum, int[] arr, int n){
        if(ind == n){
            if(s==sum){
                for(int i=0;i<ans.size();i++){
                    System.out.print(ans.get(i));
                }
                System.out.println();
                return true;
            }

            return false;
        }

        //This is the take case
        ans.add(arr[ind]);
        s += arr[ind];
        if(solveSubsequenceKSum(ans, ind+1,s,sum,arr,n)){
            return true;
        }

        //This is the not take case
        ans.remove(ans.size()-1);
        s -= arr[ind];
        if(solveSubsequenceKSum(ans, ind+1,s,sum,arr,n)){
            return true;
        }

        return false;
    }


}
