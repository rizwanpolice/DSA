package BasicAlgorighms.TwoPointerTechnique;

/*
You are given a string 'STR' consisting of lower and upper case characters.
You need to remove the consecutive duplicates characters, and return the new string.

For a given string, "aaaAAbbcccbd"
The new string formed after removing the consecutive duplicates characters will be, "aAbcbd".

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376565?leftPanelTab=0



 */
public class removeConsecutiveDuplicates {
    public static String removeConsecutive(StringBuilder str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}

/*
Time Complexity: O(n)
Space complexity: O(n)

 */
