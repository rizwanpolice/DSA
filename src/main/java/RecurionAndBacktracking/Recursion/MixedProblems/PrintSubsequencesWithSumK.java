package RecurionAndBacktracking.Recursion.MixedProblems;

/*

Print all the subsequences with Sum K

https://www.youtube.com/watch?v=eQCS_v3bw0Q&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=7
 */
import java.util.ArrayList;

public class PrintSubsequencesWithSumK {

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1,2,1};

        solveSubsequenceKSum(ans,0,0,2,arr,3);
    }


    public static void solveSubsequenceKSum(ArrayList<Integer> ans,int ind, int s, int sum, int[] arr, int n){
        if(ind == n){
            if(s==sum){
                for(int i=0;i<ans.size();i++){
                    System.out.print(ans.get(i));
                }
                System.out.println();

            }

            return;
        }

        //This is the take case
        ans.add(arr[ind]);
        s += arr[ind];
        solveSubsequenceKSum(ans, ind+1,s,sum,arr,n);

        //This is the not take case
        ans.remove(ans.size()-1);
        s -= arr[ind];
        solveSubsequenceKSum(ans, ind+1,s,sum,arr,n);
    }
}
