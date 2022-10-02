package Arrays.MixedProblems;

/*
You have been given an array/list 'ARR' of integers. Your task is to find the second largest element present in the 'ARR'.

a) Duplicate elements may be present.
b) If no such element is present return -1.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381890?leftPanelTab=0
 */

public class SecondLargestElementInArray {

    public static int findSecondLargest(int n, int[] arr) {

        // If array is empty or has single value, second larger would not be present
        if(n==0 || n== 1){
            return -1;
        }

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(secondMax<arr[i]){
                if(max!=arr[i])          // we need this condition to check the second largest is not largest before assigning
                    secondMax = arr[i];
            }
        }

        // The below line is to handle case when we do not have second max value in array eg:  3,3,3,3 or -4,-4,-4,-4
        if(secondMax == Integer.MIN_VALUE)
            secondMax=-1;
        return secondMax;

    }
}
