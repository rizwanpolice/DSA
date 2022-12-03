package MultiDimentionalArrays.MixedProblems;

import java.util.*;

/*
You have been given a matrix of ‘N’ rows and ‘M’ columns filled up with integers where every row is sorted in
non-decreasing order. Your task is to find the overall median of the matrix i.e if all elements of the matrix
are written in a single line, then you need to return the median of that linear array.

The median of a finite list of numbers is the "middle" number when those numbers are listed in order from smallest to
greatest. If there is an odd number of observations, the middle one is picked. For example,
consider the list of numbers [1, 3, 3, 6, 7, 8, 9]. This list contains seven numbers.
The median is the fourth of them, which is 6.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381905?leftPanelTab=0
 */

public class GetMedian {
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
    {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int[] temp = new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[k]=matrix.get(i).get(j);
                k++;
            }
        }

        Arrays.sort(temp);
        return temp[(n*m)/2];
    }
}

/*
Time complexity: O(n*m)
Space complexity: O(n*m)
 */