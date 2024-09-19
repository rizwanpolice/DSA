package RecurionAndBacktracking.Recursion.BasicProblems;
/*

https://www.youtube.com/watch?v=69ZCDFy-OUo&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=3

This is an example of functional parameters
*/

public class PrintSumFunctionalParameters {
    public static void main(String[] args) {
        System.out.println(findSum(5));
    }

    public static int findSum(int n) {
        if(n==0)
            return 0;

        return n+findSum(n-1);
    }
}
