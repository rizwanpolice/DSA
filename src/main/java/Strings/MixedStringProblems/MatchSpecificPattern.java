package Strings.MixedStringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Ninja has given you a list of WORDS and a PATTERN string. Your task is to find all such words in the list which match the given pattern.
A valid match is found if and only if every character in the pattern is uniquely mapped to a character in a word.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377990?leftPanelTab=0

Solution link: https://www.geeksforgeeks.org/find-all-strings-that-match-specific-pattern-in-a-dictionary/
 */

public class MatchSpecificPattern {
    public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {

        /*
        ********************** In this problem I learnt a new technique of using hashes to get a pattern string and compare ***************
         https://www.geeksforgeeks.org/find-all-strings-that-match-specific-pattern-in-a-dictionary/
         */
        List<String> ans = new ArrayList<String>();
        String patternHash = findHash(pattern);

        for(int i=0;i<words.size();i++){
            String wordHash = findHash(words.get(i));
            if(wordHash.equals(patternHash)){
                ans.add(words.get(i));
            }
        }

        return ans;

    }

    //The below method is used to find the hash for any word given
    // Hash means we assign a unique integer to every character and build hash based on each hash of character
    public static String findHash(String x){
        String hash = "";
        int i=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int k=0;k<x.length();k++){
            char c = x.charAt(k);
            if(!map.containsKey(c))
                map.put(c,++i);

            hash+=map.get(c);
        }

        return hash;
    }
}

/*

Time Complexity: O(N*K).
Here ‘N’ is the number of words and ‘K’ is its length. As we have to traverse each word separately to create its hash.
Auxiliary Space: O(N).
The use of hash_map data structure for mapping characters takes this amount of space.

 */