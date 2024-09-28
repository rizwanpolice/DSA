package Sorting;

import java.util.ArrayList;

/*

Merge sort uses divide and conquer method.


https://www.youtube.com/watch?v=ogjf7ORKfd8

Time complexity : O(nlogn)
Space complexity: O(n) -> for temporary array

 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,4,13,45,23};
        mergeSort(arr, 0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <=high){

            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left
        while(left <=mid){
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left
        while(right<=high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high){
            //when the array has only one element
            if(low>=high)
                return;

            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr, low, mid, high);
    }
}
