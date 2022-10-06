package Arrays.KadaneAlgorithm;

/*

You are given an array of integers ARR[] of size N consisting of zeros and ones. You have to select a subset and flip bits of that subset.
You have to return the count of maximum one’s that you can obtain by flipping chosen sub-array at most once.

A flip operation is one in which you turn 1 into 0 and 0 into 1.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381872

Solution link: https://www.youtube.com/watch?v=Etkf8sRQdbU&t=853s
 */
public class flipBits {

    public static int flipBits(int[] arr,int n) {
        int[] b = new int[n];
        int answer = 0;

        for(int i=0;i<n;i++){
            if (arr[i] == 0){
                b[i] = 1;
            }else {
                answer++;
                b[i] = -1;
            }
        }

        int maxSum = Integer.MIN_VALUE, sum=0;

        for(int i=0;i<n;i++){
            // Use Math.max funtion to find the maximum of two values
            // Use Math.min funtion to find the minimum of two values
            sum = Math.max(sum+b[i],0);

            maxSum = Math.max(maxSum,sum);
        }

        return answer+maxSum;
    }

}
