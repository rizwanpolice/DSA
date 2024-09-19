package RecurionAndBacktracking.Recursion.BasicProblems;
/*
https://www.youtube.com/watch?v=twuC1F6gLI8&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=4

 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //reverseArray(0,arr.length-1,arr);
        reverseArray1(0,arr.length,arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverseArray(int l, int r, int[] arr) {
        if(l>=r)
            return;

        //here we are swapping two numbers in the array
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArray(l+1,r-1,arr);
    }

    public static void reverseArray1(int i, int n, int[] arr) {
        if(i>=n/2)
            return;

        //here we are swapping two numbers in the array
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArray1(i+1,n,arr);
    }


}
