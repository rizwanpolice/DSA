package Strings;

/*
This question was asked in my walmart interview in automation testing round

Question:
Given a parenthesis string, print whether the string is balanced string or not

ex:
{[()]} -> is a balanced parenthesis string
{[(])} -> is a NOT balanced parenthesis string
{[](])} -> is a NOT balanced parenthesis string

 */

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }else{
                if(c=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                }

                if(c==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                }

                if(c==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                }
            }
        }


        if(stack.size()==0){
            System.out.println("It is a balanced parenthesis string");
        }else {
            System.out.println("It is NOT a balanced parenthesis string");

        }
    }


}
