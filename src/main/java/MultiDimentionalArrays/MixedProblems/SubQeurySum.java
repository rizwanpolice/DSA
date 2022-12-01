package MultiDimentionalArrays.MixedProblems;

import java.util.ArrayList;
/*
You have given a 2-dimensional array ‘ARR’ with ‘N’ rows and ‘M’ columns. The queries are given in a 2-dimensional array
‘Queries’ of size ‘K’, in which Queries[i] contains four integers denoting the left top and right bottom indices
 of the submatrix whose sum we need to find. Your task is to find the sum of the submatrix for
 each query given in the array ‘Queries’.

Consider ARR = [[1 , 2 , 3] , [3 , 4 , 1] , [2 , 1 , 2]] and Queries = [[0 , 0 , 1 , 2]], the submatrix with the left top index (0 , 0) and right bottom index (1 , 2) is
                      [[1 , 2 , 3] ,
                       [3 , 4 , 1]].
The sum of the submatrix is 14. Hence, the answer is 14 in this case.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381913?leftPanelTab=0
 */

public class SubQeurySum {
    public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int k=0;k<queries.size();k++){
            int rowStart = queries.get(k).get(0);
            int colStart = queries.get(k).get(1);
            int rowEnd = queries.get(k).get(2);
            int colEnd = queries.get(k).get(3);

            int sum=0;
            for(int i=rowStart;i<=rowEnd;i++){
                for(int j=colStart;j<=colEnd;j++){
                    sum+=arr.get(i).get(j);
                }
            }
            answer.add(sum);
        }

        return answer;
    }
}

/*
Time complexity: O(k*n*m) // This is the worst case complexity if every query asks for entire matrix sum
Space complexity: O(1) //extra arraylist is to store answer only
 */