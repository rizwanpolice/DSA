package Strings;

/*
Given a string "pattern", which contains only two types of characters ‘(’, ‘)’.

Your task is to find the minimum number of parentheses either ‘(’, ‘)’ we must add the parentheses in string ‘pattern’ and the resulted string is valid.
Condition for valid string-
Every opening parenthesis ‘(’ must have a correct closing parenthesis ‘)’.
Example - ‘(()(()))’, ‘()()()’, ‘((()))’ are valid string, and ‘(((’, ‘(()’, ‘)(())’ are invalid string.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377978

Solution link: https://www.youtube.com/watch?v=fCsea1Koq6I
 */

public class MinimumParenthesis {
    public static int minimumParentheses(String pattern) {
        //The below commented code provides solution using stack

// 		Stack<Character> stack = new Stack<Character>();

//         for(int i=0;i<pattern.length();i++){
//             if(pattern.charAt(i)=='('){
//                 stack.push('(');
//             }else {
//                 if(stack.empty() || stack.peek() == ')'){
//                     stack.push(')');
//                 }else{
//                     stack.pop();
//                 }
//             }
//         }

//         return stack.size();
        int open = 0 , close = 0;
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='('){
                open++;
            } else {
                if(open == 0){
                    close++;
                }else if (open!=0){
                    open--;
                }
            }
        }

        return open+close;
    }
}

/*
Time complexity of commented code: O(n)
Space complexity of commented code: O(n)

Time complexity: O(n)
Space complexity: O(1)
 */