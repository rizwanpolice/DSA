package BasicAlgorighms.TwoPointerTechnique;

import java.util.*;

/*
An array is said to have a triplet {ARR[i], ARR[j], ARR[k]} with sum = 'K' if there exists three indices i, j and k
such that i!=j, j!=k and i!=j and ARR[i] + ARR[j] + ARR[k] = 'K'.

1. You can return the list of values in any order. For example, if a valid triplet is {1, 2, -3}, then {2, -3, 1}, {-3, 2, 1} etc is also valid triplet. Also, the ordering of different triplets can be random i.e if there are more than one valid triplets, you can return them in any order.
2. The elements in the array need not be distinct.
3. If no such triplet is present in the array, then return an empty list, and the output printed for such a test case will be "-1".

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118509/offering/1376558?leftPanelTab=1

Solution link:  https://www.youtube.com/watch?v=kUJvbYsYwQk
https://www.youtube.com/watch?v=EqHVjoqrGEo
 */
public class findTripletsWithGivenSum {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        // Arrays sort will have O(nlog(n)) time complexity
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i==0 || (i>0 && arr[i]!=arr[i-1])){
                int start=i+1;
                int end=n-1;
                int toFind = K-arr[i];

                while(start<end){
                    if(arr[start]+arr[end]==toFind){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[start]);
                        temp.add(arr[end]);
                        answer.add(temp);

                        int x = arr[start];
                        int y = arr[end];

                        while(start<end && arr[start]==x)
                            start++;
                        while(start<end && arr[end]==y)
                            end--;
                    }else if(arr[start]+arr[end]<toFind){
                        start++;
                    }else{
                        end--;
                    }
                }
            }

        }
        return answer;

    }
}

/*
Time complexity: O(n2)
Space complexity: O(n)
 */