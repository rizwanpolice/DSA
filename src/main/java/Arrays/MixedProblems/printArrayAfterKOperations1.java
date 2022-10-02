package Arrays.MixedProblems;

import java.util.ArrayList;

/*

You are given an array 'ARR' consisting of 'N' integers and a non-negative integer 'K'.
 Consider an operation on the array as replacing every element 'ELE' of the array with 'MX - ELE',
 where 'MX' is the maximum element of the array. You need to return the updated array,
 given that this operation is performed on the array exactly 'K' number of times.

1. The array follows 0-based indexing.
2. Note that after each operation, the next operation will be performed on the updated array
  i.e the array obtained after the last operation.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381891?leftPanelTab=0
 */

public class printArrayAfterKOperations1 {

    // This is a brute force solution and not an optimized solution
    public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {

        for(int j=0;j<k;j++){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<arr.size();i++){
                if(max<arr.get(i)){
                    max=arr.get(i);
                }
            }

            for(int i=0;i<arr.size();i++){
                arr.set(i, max - arr.get(i));
            }
        }

        return arr;

    }
}
