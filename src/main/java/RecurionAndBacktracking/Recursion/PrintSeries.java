package RecurionAndBacktracking.Recursion;

import java.util.ArrayList;
import java.util.List;

/*
You have given two positive integers N and K. Your task is to print a series of numbers i.e
 subtract K from N until it becomes 0 or negative then add K until it becomes N.
 You need to do this task without using any loop.

 For  N = 5 , K = 2
Series = [ 5, 3, 1, -1, 1, 3, 5]

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118522/offering/1380916?leftPanelTab=0
Solution link: basic intuition worked

 */

public class PrintSeries {
    public static List<Integer> printSeries(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        printToNegative(ans,n,k);
        int start = ans.get(ans.size()-1);
        printToNumber(ans,start,k, n);
        return ans;
    }

    public static void printToNegative(List<Integer> ans,int n, int k){
        if(n<=0){
            ans.add(n);
            return;
        }

        ans.add(n);
        n=n-k;
        printToNegative(ans,n,k);

    }

    public static void printToNumber(List<Integer> ans,int n, int k, int toFind){
        n=n+k;
        if(n==toFind){
            ans.add(n);
            return;
        }



        ans.add(n);
        printToNumber(ans,n,k,toFind);

    }
}
