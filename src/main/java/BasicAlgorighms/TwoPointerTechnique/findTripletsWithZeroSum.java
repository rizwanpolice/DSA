package BasicAlgorighms.TwoPointerTechnique;

import java.util.*;

/*

An array is said to have a triplet {arr[i], arr[j], arr[k]} with 0 sum if there exists three indices i, j and k
such that i!=j, j!=k and i!=k and arr[i] + arr[j] + arr[k] = 0.

1. You can return the list of values in any order. For example, if a valid triplet is {1, 2, -3}, then (2, -3, 1), (-3, 2, 1) etc is also valid triplet. Also, the ordering of different triplets can be random i.e if there are more than one valid triplets, you can return them in any order.
2. The elements in the array need not be distinct.
3. If no such triplet is present in the array, then return an empty list, and the output printed for such a test case will be "-1".

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376555?leftPanelTab=3
Solution link:  https://www.youtube.com/watch?v=kUJvbYsYwQk
https://www.youtube.com/watch?v=EqHVjoqrGEo
 */
public class findTripletsWithZeroSum {
    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] arr1 = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr1[i]=arr.get(i);
        }

        //We are sorting this to apply the two pointer technique to find remaining two numbers
        Arrays.sort(arr1);

        for(int i=0;i<n;i++){
            //Since the elements in the array need not be distinct, No need to traverse the array
            // if we know the same element we are looking at if arr[i] and arr[i-1] are same
            if(i==0 || (i>0 && arr1[i]!=arr1[i-1])){
                int j=i+1,k=n-1;
                int toFind = 0-arr1[i];

                while(j<k){
                    if(arr1[j]+arr1[k]==toFind){
                        ArrayList<Integer> eachTriplet = new ArrayList<>();
                        eachTriplet.add(arr1[i]);
                        eachTriplet.add(arr1[j]);
                        eachTriplet.add(arr1[k]);
                        ans.add(eachTriplet);

                        int x = arr1[j];
                        int y = arr1[k];

                        //here we are incrementing or decrementing so as not to take the same number in the triplet
                        //because it will not be distinct triplet
                        while(j<k && arr1[j]==x)
                            j++;
                        while(j<k && arr1[k]==y)
                            k--;

                    }else if(arr1[j]+arr1[k]>toFind){
                        k--;
                    }else if(arr1[j]+arr1[k]<toFind){
                        j++;
                    }
                }
            }
        }

        return ans;
    }
}
