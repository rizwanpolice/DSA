package MultiDimentionalArrays;

import java.util.ArrayList;
import java.util.List;

/*
You are given a 2-D array 'MATRIX' of dimensions N x M, of integers. You need to return the spiral path of the matrix.
Clock wise direction spiral matrix

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381901?leftPanelTab=0

Solution link: https://www.youtube.com/watch?v=SVFXEqn3Ceo

 */
public class SpiralMatrix {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        List<Integer> answer = new ArrayList<>();

        int count = 0;
        int totalElements = n*m;
        while(count < totalElements){
            //top wall
            for(int i=minr, j=minc;j<=maxc && count < totalElements;j++){
                answer.add(matrix[i][j]);
                count++;
            }
            minr++;
            //right wall
            for(int i=minr, j=maxc;i<=maxr && count < totalElements;i++){
                answer.add(matrix[i][j]);
                count++;
            }
            maxc--;
            //bottom wall
            for(int i=maxr, j=maxc;j>=minc && count < totalElements;j--){
                answer.add(matrix[i][j]);
                count++;
            }
            maxr--;

            //left wall
            for(int i=maxr, j=minc;i>=minr && count < totalElements;i--){
                answer.add(matrix[i][j]);
                count++;
            }
            minc++;

        }

        return answer;
    }
}

/*
Time complexity: O(n*m)
Space complexity: O(1)
 */