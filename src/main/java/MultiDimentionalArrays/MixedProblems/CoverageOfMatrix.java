package MultiDimentionalArrays.MixedProblems;

import java.util.ArrayList;

/*
Coverage for a particular 0 is defined as the total number of ‘1s’ around it
(i.e., immediate left, immediate right, immediate up, and immediate bottom positions).

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381914?leftPanelTab=0
 */
public class CoverageOfMatrix {
    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

        int answer = 0;
        int n = mat.size();
        int m = mat.get(0).size();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat.get(i).get(j)==0){
                    if(i-1>=0)
                        answer+=mat.get(i-1).get(j);

                    if(i+1<n)
                        answer+=mat.get(i+1).get(j);

                    if(j-1>=0)
                        answer+=mat.get(i).get(j-1);

                    if(j+1<m)
                        answer+=mat.get(i).get(j+1);
                }
            }
        }

        return answer;
    }
}

/*
Time complexity: O(n*m)
Space complexity: O(1)
 */