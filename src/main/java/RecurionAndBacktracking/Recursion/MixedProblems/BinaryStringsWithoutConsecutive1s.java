package RecurionAndBacktracking.Recursion.MixedProblems;

import java.util.ArrayList;

/*
You have been given an integer K.

Your task is to generate all binary strings of length K such that there are no consecutive 1s in the string.
This means that the binary string should not contain any instance of 1’s coming one after another.

A binary string is that string which contains only ‘0’ and ‘1’.
Let ‘K=3’, hence the length of the binary string would be 3.
We can have the following binary strings with no consecutive 1s: 000 001 010 100 101

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118522/offering/1380926?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=NxOjGKpL9Tw

For getting only the count, watch this - https://www.youtube.com/watch?v=H7tshfFTSvw

 */

public class BinaryStringsWithoutConsecutive1s {
    public static ArrayList<String> generateString(int k) {
        ArrayList<String> ans = new ArrayList<>();
        // This is to check the condition when k=0,
        //otherwise it will go into negative numbers
        if(k>0){
            solve(k-1,"0",ans);

            solve(k-1,"1",ans);
        }

        return ans;
    }

    public static void solve(int k, String str, ArrayList<String> ans){
        if(k==0){
            ans.add(str);
            return;
        }
        char lastChar = str.charAt(str.length()-1);

        if(lastChar=='0')
        {
            solve(k-1,str+"0",ans);

            solve(k-1,str+"1",ans);
        }else{
            solve(k-1,str+"0",ans);
        }


    }
}
