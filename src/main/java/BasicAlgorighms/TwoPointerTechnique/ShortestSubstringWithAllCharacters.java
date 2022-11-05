package BasicAlgorighms.TwoPointerTechnique;

import java.util.HashSet;

/*
You have been given a string 'S' which only consists of lowercase English-Alphabet letters.
Your task is to find the shortest (minimum length) substring from 'S' which contains all the characters of 'S' at least once.

If there are more than one substring with the shortest length,
then find one which appears earlier in the string ‘S’ i.e. substring whose starting index is lowest.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376559?leftPanelTab=0

Solution link:
The approach here is to find the length of unique characters
Then use two pointer technique to find substring which has minimum length and all characters in it

 */
public class ShortestSubstringWithAllCharacters {
    public static String shortestSubstring(String s) {
        int allCharSize=0;
        String ans = " ";
        int[] hash = new int[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hash[c]++;
        }

        for(int i=0;i<256;i++){
            if(hash[i]!=0)
                allCharSize++;
        }

        int i=0,j=0;
        int ansLength = Integer.MAX_VALUE;
        while(i<s.length()){
            j=i;
            StringBuilder sb = new StringBuilder();
            HashSet<Character> set = new HashSet<>();
            while(j<s.length()){
                char c = s.charAt(j);
                sb.append(String.valueOf(c));
                if(!set.contains(c)){
                    set.add(c);
                }

                if(set.size()==allCharSize){
                    if(sb.length()<ansLength){
                        ans = sb.toString();
                        ansLength = sb.length();
                    }
                    break;
                }

                j++;
            }
            i++;
        }

        return ans;
    }
}
