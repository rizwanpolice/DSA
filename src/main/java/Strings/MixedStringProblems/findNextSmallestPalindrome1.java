package Strings.MixedStringProblems;

/*
You are given a number 'N' in the form of a string 'S',
your task is to find the smallest number strictly greater than the given number 'N' which is a palindrome.

1) A palindrome is a word, number, phrase, or another sequence of characters that reads the same backward as forward, such as 'naman', 'abcba', '1234321', etc
2) The numerical value of the given string 'S' will be greater than 0.
3) A single-digit number is also considered as a palindrome.
4) Note that the length of the string 'S' is nothing but the number of digits in the number 'N'.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1382156?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=pEFpMdOtDYo
 */
public class findNextSmallestPalindrome1 {
    
    // **** This solution will only work for smaller length strings which fit in integer size, 
    // ***** for longer length strings, this solution will not work

    // TODO: Look at this solution for higher values : https://www.youtube.com/watch?v=Mm3zKDP_ajI
    public static String nextLargestPalindrome(String number, int length) {
        int num = Integer.parseInt(number);
        int rev=0;
        int flag = 1;
        while(flag == 1){
            num++;
            rev = reverseNumber(num);
            if(rev==num)
                flag=0;
        }

        return String.valueOf(rev);
    }

    public static int reverseNumber(int num){
        int ans=0;
        while(num >0){
            ans = ans * 10 + num % 10;
            num = num / 10;
        }

        return ans;
    }
}
