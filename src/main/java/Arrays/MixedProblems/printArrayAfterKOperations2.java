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

Solution: See discuss section
 */


public class printArrayAfterKOperations2 {

    public static ArrayList<Integer> printArrayAfterKOperations(ArrayList<Integer> arr, int n, int k) {

        int max = Integer.MIN_VALUE;
        if(k==0)
            return arr;
        // If you observe after every 2 iterations, the order and values of modified array
        // are same, so implemented this logic to modify at max 2 times and return the array
        if(k%2==1){
            for(int i=0;i<arr.size();i++){
                if(max<arr.get(i)){
                    max=arr.get(i);
                }
            }

            for(int i=0;i<arr.size();i++){
                arr.set(i, max - arr.get(i));
            }
        } else {

            for(int i=0;i<arr.size();i++){
                if(max<arr.get(i)){
                    max=arr.get(i);
                }
            }

            for(int i=0;i<arr.size();i++){
                arr.set(i, max - arr.get(i));
            }

            //we have to reset max here again, otherwise the max value will be still max
            max = Integer.MIN_VALUE;

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
