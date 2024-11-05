package Strings.MixedStringProblems;

public class ReverseInputString {
    public static void main(String[] args) {

        //Input: I Love!@#$% My Country
        //Output: I evoL!@#$% yM yrtnuoC

        String s = "I Love!@#$%Do My Country";
        String[] words = s.split(" ");
        String answer = "";

        for(String word: words){
            String temp = "";

            int k=word.length()-1;
            String ans = "";
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);

                if(Character.isLetter(c)){
                    temp = temp + c;
                }else{
                    for(int l=temp.length()-1;l>=0;l--){
                        ans = ans + temp.charAt(l);
                    }

                    temp = "";
                    ans = ans + word.charAt(i);
                }
            }


            for(int l=temp.length()-1;l>=0;l--){
                ans = ans + temp.charAt(l);
            }


            answer = answer + ans + " ";
        }

        System.out.println(answer);


    }
}
