package Arrays.MixedProblems;

/*
You have been given an integer array/list 'ARR' of size 'N'.
Write a solution to check if it could become non-decreasing by modifying at most 1 element.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381888?leftPanelTab=1

solution link: https://www.youtube.com/watch?v=iL7oSNc3OXA
 */
public class NonDecreasingArray {
    public static boolean isPossible(int[] arr, int n) {
        int pos = -1;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                if(pos!=-1){
                    return false;
                }
                pos = i;
            }

        }

        return pos == -1 || pos == 0 || pos == n-2 || arr[pos-1] <= arr[pos+1] || arr[pos] <= arr[pos+2];
    }
}
