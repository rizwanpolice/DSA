package Strings;

/*
You are given a string STR of length N. Your task is to remove all the vowels present in that string and print the modified string.
English alphabets ‘a’, ‘e’, ‘i’, ‘o’, ‘u’ are termed as vowels. All other alphabets are called consonants.

Note: You have to only remove vowels from the string.
There will be no change in the relative position of all other alphabets.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377977?leftPanelTab=0
 */
public class RemoveVowels {
    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                //do nothing
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
