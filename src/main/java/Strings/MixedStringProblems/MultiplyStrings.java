package Strings.MixedStringProblems;

import java.math.BigInteger;

/*
You are given two big numbers ‘A’ and ‘B’ as strings. Your task is to find the product of both the numbers.

There are no leading zeros in both the strings, except the number 0 itself.
Do not use any built-in Big Integer Library.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1382161?leftPanelTab=1

 */
public class MultiplyStrings {

    public static String multiplyStrings(String a, String b) {
        BigInteger i,j,ans;
        i = new BigInteger(a);
        j = new BigInteger(b);

        ans = i.multiply(j);

        return String.valueOf(ans);
    }
}
