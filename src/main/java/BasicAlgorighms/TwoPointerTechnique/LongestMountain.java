package BasicAlgorighms.TwoPointerTechnique;

/*
A mountain subarray is defined as a subarray which consists of elements that are initially in ascending order until a peak element is reached
 and beyond the peak element all other elements of the subarray are in decreasing order.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376554?leftPanelTab=1
Solution link: watch discuss section
 */
public class LongestMountain {

    public static int longestMountain(int arr[], int n)
    {

        int ans = 0;
        for(int i=1;i<n-1;i++){
            /*
            The approach here is to find the peak element and then traverse towards left and right until
            our mountain conditions are met and find the subarray length
            */
            int currLength=0;
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left = i-1;
                int right = i+1;

                while(left>0 && arr[left]>arr[left-1]){
                    left--;
                }

                while(right<n-1 && arr[right]>arr[right+1]){
                    right++;
                }
                currLength = right-left+1;
                ans = Math.max(ans,currLength);
            }

        }

        return ans;
    }
}
