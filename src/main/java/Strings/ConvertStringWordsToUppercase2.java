package Strings;

/*
You are given a string 'STR'. You have to convert the first alphabet of each word in a string to UPPER CASE.

If the given string 'STR' = ”I am a student of the third year”
so you have to transform this string to ”I Am A Student Of The Third Year"
Problem link:  https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377975?leftPanelTab=0
 */

public class ConvertStringWordsToUppercase2 {

    //This solution uses string builder class to implement
    public static String convertString(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String s:words){
            sb.append(Character.toUpperCase(s.charAt(0)));
            sb.append(s.substring(1));
            sb.append(" ");
        }

        return sb.toString().trim();


    }

}
