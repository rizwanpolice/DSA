package Sorting;

/*
https://www.youtube.com/watch?v=HGk_ypEuS24

Takes an element and places it in its correct position

takes every element in the outer for loop, and then
compares that element with all the elements before it and places it in correct order.


 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,4,1};

        insertionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int j=i;

            //check the previous all elements are greater than element and then swap them
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }

        }
    }
}
