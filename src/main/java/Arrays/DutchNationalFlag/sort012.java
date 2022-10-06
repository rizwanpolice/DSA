package Arrays.DutchNationalFlag;

/*
You have been given an integer array/list(ARR) of size 'N'.
It only contains 0s, 1s and 2s. Write a solution to sort this array/list.

Try to solve the problem in 'Single Scan'. ' Single Scan' refers to iterating over the array/list just once or to put it in other words,
you will be visiting each element in the array/list just once.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118820/offering/1381875

 */

public class sort012 {

    public static void sort012(int[] arr)
    {
        //Using dutch national flag algorithm to solve the problem
        //in single traversal and constant space
        int low=0,mid=0,high=arr.length-1,temp;
        while(mid<=high){
            if(arr[mid]==0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if(arr[mid]==1){
                mid++;
            }else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high] = temp;
                high--;
                //We do not increment mid here because the swapped element can be 0 as well,
                //hence we need to check mid again
            }
        }
    }
}
