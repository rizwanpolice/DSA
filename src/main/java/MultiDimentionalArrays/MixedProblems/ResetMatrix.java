package MultiDimentionalArrays.MixedProblems;

import java.util.ArrayList;

/*
You have given a 2-dimensional array ‘ARR’ with ‘N’ rows and ‘M’ columns in which each element contains only two values,i.e.,
 0 and 1. Your task is to convert the given matrix into the Good matrix in which if an element is 0,
 you need to set all elements values present in its entire row and column to 0.


Consider ARR = [[1 , 0 , 1] ,
                [1 , 1 , 1] ,
                [1 , 1 , 1]],
the Good matrix after updating the given matrix as described in the question is
                [[0 , 0 , 0] ,
                 [1 , 0 , 1] ,
                 [1 , 0 , 1]].
Since ARR[0][1] is 0, we need to set all element’s values present in 0-th row and 1-th column to 0.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381912
Solution link: https://www.youtube.com/watch?v=M65xBewcqcI
 */

public class ResetMatrix {
    public static ArrayList<ArrayList<Integer>> findGoodMatrix(ArrayList<ArrayList<Integer>> arr) {

        int n = arr.size();
        int m = arr.get(0).size();
        int[] rows = new int[n];
        int[] cols = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr.get(i).get(j)==0){
                    rows[i] = -1;
                    cols[j] = -1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows[i]==-1 || cols[j]==-1){
                    arr.get(i).set(j,0);
                }
            }
        }

        return arr;

    }
}

/*
Time complexity: O(2*n*m)
Space complexity: O(n+m)
 */