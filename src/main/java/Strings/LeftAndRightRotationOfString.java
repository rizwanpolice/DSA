package Strings;

public class LeftAndRightRotationOfString {
    public static String leftRotate(String str, int d) {
        d = d%str.length();
        String temp = str.substring(0,d);
        String answer = str.substring(d,str.length());
        answer = answer + temp;
        return answer;
    }

    public static String rightRotate(String str, int d) {
        d = d%str.length();
        int rightIndex = str.length()-d;
        String temp = str.substring(rightIndex,str.length());
        String answer = str.substring(0,rightIndex);
        answer = temp + answer;
        return answer;
    }
}
