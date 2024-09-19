package RecurionAndBacktracking.Recursion.BasicProblems;
/*

https://www.youtube.com/watch?v=un6PLygfXrA&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=2

Time complexity - O(n)
Space complexity - O(n) -> This is due to every function call uses a stack internally to store the function calls
 */

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName("Rizwan",1,10);
    }

    public static void printName(String name, int i, int n){
        if(i>n)
            return;

        System.out.println(name);
        printName(name, i+1, n);
    }
}

