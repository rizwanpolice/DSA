package RecurionAndBacktracking.Recursion.BasicProblems;

/*

https://www.youtube.com/watch?v=un6PLygfXrA&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=2

Time complexity - O(n)
Space complexity - O(n) -> This is due to every function call uses a stack internally to store the function calls
 */

public class printNumbers {
    public static void main(String[] args) {
        printNumbers(1,10);
        printReverse(5);
    }

    public static void printNumbers(int i, int n){
        if(i>n)
            return;

        System.out.println(i);
        printNumbers( i+1, n);
    }

    public static void printReverse(int i){
        if(i<1)
            return;

        System.out.println(i);
        printReverse( i-1);
    }
}
