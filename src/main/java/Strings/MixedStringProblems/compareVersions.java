package Strings.MixedStringProblems;

import java.math.BigInteger;

/*
You are given two versions numbers A and B as a string. Your task is to compare them and find out which one of them is a newer version.
There are no leading zeros in any of the strings except in the case of zero itself.
 Note that, the leading zeroes are not allowed even after a '.' ie: 121.005 is an invalid version, while 121.5 is an valid version.

 For each test case, print 1 if version A is latest, -1  if version B is latest and 0 if both versions are the same.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1382159?leftPanelTab=1

Solution link: https://www.youtube.com/watch?v=Z4Af1_t7wzk
 */
public class compareVersions {
    public static int compareVersions(String a, String b)
    {
        // Learnt about big integer in this problem
        // https://www.geeksforgeeks.org/biginteger-class-in-java/
        String[] words1 = a.split("\\.");
        String[] words2 = b.split("\\.");

        // A very important thing to note, while splitting use \\ infront of the .(dot)
        int len1 = words1.length;
        int len2 = words2.length;
        BigInteger v1,v2;

        for(int i=0;i<Math.max(len1,len2);i++){
            if(i<len1){
                v1 = new BigInteger(words1[i]);
            }else{
                v1=new BigInteger("0");
            }

            if(i<len2){
                v2 = new BigInteger(words2[i]);
            }else{
                v2=new BigInteger("0");
            }

            if(v1.compareTo(v2) == 1){
                return 1;
            }else if (v1.compareTo(v2) == -1){
                return -1;
            }
        }

        return 0;
    }
}
