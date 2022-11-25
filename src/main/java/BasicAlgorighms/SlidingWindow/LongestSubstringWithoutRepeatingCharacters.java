package BasicAlgorighms.SlidingWindow;

import java.util.HashSet;

/*
Given a string 'S' of length 'L', return the length of the longest substring without repeating characters.
Suppose given input is "abacb", then the length of the longest substring without repeating characters will be 3 ("acb").

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376581

Solution link: Discuss section

 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        int i=0,j=0,max=0;
        int n=s.length();
        HashSet<Character> set=new HashSet<>();

        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */