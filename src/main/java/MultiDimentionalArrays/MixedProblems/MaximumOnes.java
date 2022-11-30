package MultiDimentionalArrays.MixedProblems;

import java.util.ArrayList;
/*

You are given a matrix ‘ARR’ with dimensions ‘N’ * ‘M’ and containing only 0s and 1s where each row is sorted.
Your task is to find the index of the row with a maximum number of 1s in it. Rows and columns are 0-indexed based.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381908?leftPanelTab=0
 */

public class MaximumOnes {
    public static int maxOne(ArrayList<ArrayList<Integer>> arr) {

        int rows = arr.size();
        int columns = arr.get(0).size();
        int answer=-1;
        int max=0;

        for(int i=0;i<rows;i++){
            int zeros = columns-1;
            int start=0,end=columns-1;

            // Here we are using binary search operation to find number of zeroes and find no of ones
            // If max 1's are found, we are assigning the result row index to answer
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr.get(i).get(mid)==1){
                    zeros = mid-1;
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            int oneCount = columns - zeros;
            if(oneCount>max){
                answer = i;
                max = oneCount;
            }
        }

        return answer;
    }
}

/*
Time complexity: O(n*log(m))
Space complexity: O(1)
 */