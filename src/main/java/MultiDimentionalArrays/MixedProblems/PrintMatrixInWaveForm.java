package MultiDimentionalArrays.MixedProblems;

import java.util.ArrayList;
/*
You are given a 2D array with dimensions ‘N*M’. You need to read the array elements row-wise and return a linear array
that stores the elements like a wave i.e the 1st-row elements are stored from left to right, 2nd-row elements
are stored from right to left, and so on.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381907?leftPanelTab=0
 */

public class PrintMatrixInWaveForm {

    public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<mat.size();i++){
            int start =0;
            int end = mat.get(0).size();

            if(i%2==0){
                for(int j=start;j<end;j++){
                    answer.add(mat.get(i).get(j));
                }
            }else{
                for(int j=end-1;j>=0;j--){
                    answer.add(mat.get(i).get(j));
                }
            }
        }

        return answer;
    }
}

/*
Time complexity: O(n*m)
Space complexity: O(1) //extra arraylist is to store answer only
 */