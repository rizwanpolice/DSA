package CommonProblems;

/*
This program shows the logic how to reverse a number

 */
public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(1023));
    }

    public static int reverse(int num){
        int ans = 0;

        while(num>0){
            ans = ans*10 + num%10;
            num = num/10;
        }

        return ans;
    }
}
