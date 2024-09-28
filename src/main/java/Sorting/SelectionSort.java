package Sorting;

/*

https://www.youtube.com/watch?v=HGk_ypEuS24

-->  Selection sort is about finding/selecting minimum element and swapping it with first element and so on

Time complexity: O(n2)
Space complexity: O(1)
 */
public class SelectionSort {

    public static void main(String[] args) {
            int[] arr = {5,8,2,9,4};
            selectionSort(arr, arr.length);

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }

    public static void selectionSort(int[] arr, int n){
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]) {
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }

    }
}
