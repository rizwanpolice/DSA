package Strings;
/*
You are given a string 'STR'. You have to convert the first alphabet of each word in a string to UPPER CASE.

If the given string 'STR' = ”I am a student of the third year”
so you have to transform this string to ”I Am A Student Of The Third Year"
Problem link:  https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377975?leftPanelTab=0
 */
public class ConvertStringWordsToUppercase {

    public static String convertString(String str) {
        String answer = "";
        String[] words = str.split(" ");
        for(String s:words){
            String firstLetter = String.valueOf(s.charAt(0));
            firstLetter = firstLetter.toUpperCase(); // you have to reassign string after modifying
            String newWord = firstLetter + s.substring(1,s.length());
            answer = answer + newWord + " ";
        }

        return answer.trim();
    }

}
