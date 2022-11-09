package BasicAlgorighms.TwoPointerTechnique;

/*
You have been given a string 'S' containing only three types of characters, i.e. '(', ')' and '*'.
A Valid String is defined as follows:

1. Any left parenthesis '(' must have a corresponding right parenthesis ')'.
2. Any right parenthesis ')' must have a corresponding left parenthesis '('.
3. Left parenthesis '(' must go before the corresponding right parenthesis ')'.
4. '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
5. An empty string is also valid.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376560

Solution link: https://www.youtube.com/watch?v=KuE_Cn3xhxI
 */
public class ValidString {
    public static boolean checkValidString(String s) {
        int open=0,close=0,star=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                open++;
            }else if(c=='*'){
                star++;
            }else if(c==')'){
                if(open!=0){
                    open--;
                }else if(star!=0){
                    star--;
                }else{
                    return false;
                }
            }
        }

        if(open==0)
            return true;

        //The below code is to balance left parenthesis with star.
        //Need to revisit and understand the below logic
        star =0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c==')'){
                close++;
            }else if(s.charAt(i)=='('){
                if(close!=0){
                    close--;
                }else if(star!=0){
                    star--;
                }else{
                    return false;
                }

            }else{
                star++;
            }
        }

        return true;

    }
}
