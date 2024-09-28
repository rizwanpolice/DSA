package Sorting;

/*
https://www.youtube.com/watch?v=HGk_ypEuS24

Push the maximum element to the last of array by adjacent swaps
Time complexity worst case: O(n2)
Space complexity: O(1)

best time complexity is -> O(n) -> when array is already sorted
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,8,2,9,4};
        bubbleSort(arr, arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr, int n){
            for(int i=n-1;i>=1;i--){
                for(int j=0;j<=i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
    }
}
