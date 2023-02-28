package RecurionAndBacktracking.Recursion.MixedProblems;

import java.util.ArrayList;
import java.util.List;

/*
You are given an input string 'S'. Your task is to find and return all possible permutations of the input string.

1. The input string may contain the same characters, so there will also be the same permutations.

2. The order of permutation does not matter.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118522/offering/1380929?leftPanelTab=0
Solution link: https://www.youtube.com/watch?v=YK78FU5Ffjw&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12

 */
public class PrintPermutations {

    public static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<>();
        boolean[] freq = new boolean[s.length()];
        String ds = "";
        solvePerm(s,ans,ds,freq);
        return ans;

    }

    public static void solvePerm(String s, List<String> ans,String ds, boolean[] freq ){

        if(ds.length() == s.length()){
            ans.add(ds);
            return;
        }

        for(int i=0;i<s.length();i++){
            if(freq[i]==false){
                freq[i] = true;
                ds = ds + s.charAt(i);
                solvePerm(s,ans,ds,freq);
                freq[i] = false;
                ds = ds.substring(0,ds.length()-1);
            }
        }
    }
}
