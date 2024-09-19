package RecurionAndBacktracking.Recursion.BasicProblems;

/*
This is a classic example of multiple recursion calls

https://www.youtube.com/watch?v=kvRjNm4rVBE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=5

Time complexity - O(2^n) --> exponential
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n){
        //base condition is important - 0 1 1 2 3 5, if the element position is 1 or less, we return same number
        if(n<=1)
            return n;

        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);

        return last + slast;
    }
}
