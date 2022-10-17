package Strings.MixedStringProblems;

/*
You have been given two strings, let's say 'STR1' and 'STR2' of equal lengths.
You are supposed to return the minimum number of manipulations required to make the two strings anagrams.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
We can generalise this in string processing by saying that an anagram of a string is another string with the same quantity of each character in it,
in any order.


Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377987?leftPanelTab=1

Solution link: https://www.youtube.com/watch?v=hgBjY3KfLFc

 */

public class AnagramDifference {

    public static int getMinimumAnagramDifference(String str1, String str2) {

        int al[] = new int[256];
        int ans = 0;

        for(char c: str1.toCharArray()){
            int index = (int) c;
            al[index]++;
        }

        for(char c: str2.toCharArray()){
            int index = (int) c;
            al[index]--;
        }

        for(int i=0;i<256;i++){
            if(al[i]!=0){
                ans = ans + Math.abs(al[i]);
            }
        }

        //We are returning answer by 2 because if there are two different characters we need to modify only 1 to match it with other.
        return ans/2;

    }
}

/*
Time complexity: O(n)
Space complexity: O(n)

**************************************
Find anagram question and solution here:
https://www.youtube.com/watch?v=wEZHehDWSto
 */