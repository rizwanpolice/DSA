package Strings.MixedStringProblems;

import java.util.HashMap;

/*
Given a string ‘STR’ consisting of lower case English letters,
the task is to find the first non-repeating character in the string and return it. If it doesn’t exist, return ‘#’.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1382157?leftPanelTab=0
 */

public class FirstUniqueCharacterInAString {

    //In the below solution we are creating hashmap and storing frequency of each character
    // Then we are traversing the string and the first occurence of a character with frequency 1 is returned as answer
    public static char firstNonRepeating(String str) {
        char ans = '#';

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.get(c)==1){
                ans = c;
                return ans;
            }
        }

        return ans;
    }
}
