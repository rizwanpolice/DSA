package CommonProblems;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "DESSERTSIDESIRENOTSOLONGNOLOSTONERISEDISTRJSSED";
        int n = str.length();
        int flag=0;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("It is not a palindrome");
        }else{
            System.out.println("It is a palindrome");
        }
    }

}
