package Arrays.KadaneAlgorithm;

/*
You are given an array (ARR) of length N, consisting of integers. You have to find the sum of the subarray
 having maximum sum among all subarrays.

 A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning,
 and 0 or more integers from the end of an array.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381870
 */

public class MaximumSubArraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        // Use Integer.MIN_VALUE and Integer.MAX_VALUE to get min and max values while calculating sum
        long maxSum = Integer.MIN_VALUE;
        long sum=0;

        for(int i=0;i<n;i++){
            sum = Math.max(sum + arr[i],0L);
            /*
            The above line can also be written as
            sum = sum + arr[i];
            if(sum<0){
                sum=0;
            }
            */
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
