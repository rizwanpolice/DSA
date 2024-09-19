package RecurionAndBacktracking.Recursion.BasicProblems;

/*

https://www.youtube.com/watch?v=un6PLygfXrA&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=2

Time complexity - O(n)
Space complexity - O(n) -> This is due to every function call uses a stack internally to store the function calls
 */

public class printNumbersBacktracking {

    public static void main(String[] args) {
        printNumbers(9);
        printNumbersReverse(1,5);

    }

    public static void printNumbers(int i){
        if(i<1)
            return;

        printNumbers( i-1);
        System.out.println(i);

    }

    public static void printNumbersReverse(int i, int n){
        if(i>n)
            return;

        printNumbersReverse( i+1,n);
        System.out.println(i);

    }
}
