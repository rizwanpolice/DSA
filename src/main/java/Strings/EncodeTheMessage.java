package Strings;
/*

You have been given a text message. You have to return the Run-length Encoding of the given message.
Run-length encoding is a fast and simple method of encoding strings.
The basic idea is to represent repeated successive characters as the character and a single count.
For example, the string "aaaabbbccdaa" would be encoded as "a4b3c2d1a2".

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377976?leftPanelTab=0
 */
public class EncodeTheMessage {

    public static String encode(String message) {
        int count=1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<message.length();i++){
            if(message.charAt(i)!=message.charAt(i-1)){
                sb.append(message.charAt(i-1));
                sb.append(count);
                count=1;
            }else {
                count++;
            }

        }

        sb.append(message.charAt(message.length()-1));
        sb.append(count);

        return sb.toString();
    }

}
