package BasicAlgorighms.TwoPointerTechnique;

/*
You have been given two strings ‘STR1’ and ‘STR2’.
Your task is to find if ‘STR1’ is a subsequence of ‘STR2’.
A subsequence of a string is a new string that can be derived from the original string by deleting some characters
(can be none) without changing the relative ordering of other characters.


‘ACE’ is a subsequence of ‘ABCDE’ because ‘ACE’ can be formed by deleting ‘B’ and ‘D’ without changing the
 relative order of characters. ‘ADB’ is not a subsequence of ‘ABCDE’ because we can get ‘ABD’ from ‘ABCDE’
 but not ‘ADB’ and in ‘ADB’ relative order of ‘B’ and ‘D’ are different from original strings.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376572?leftPanelTab=0

Solution approach:
Traverse through the main string and take another pointer to traverse through second string simultaneously

 */
public class isSubsequence {
    public static String isSubsequence(String str1, String str2) {
        int n = str2.length();
        int m = str1.length();

        int j=0;
        for(int i=0;i<n;i++){
            if(str1.charAt(j)==str2.charAt(i)){
                j++;
            }

            if(j==m)
                break;
        }

        if(j==m){
            return "True";
        }else{
            return "False";
        }

    }
}

/*

Time complexity: O(n)
Space complexity: O(1)
 */