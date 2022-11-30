package MultiDimentionalArrays.RotationBased;
/*
You have been given a matrix ‘MAT’ of size 'N' * 'M' (where 'N' and 'M' denote the number of rows and columns respectively) and a positive integer ‘K’.
Your task is to rotate the matrix to the right 'K' times.

Right rotation on a matrix is shifting each column to the right side (the last column moves to the first column)
and 'K' times means performing this rotation 'K' times.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381903
 */

public class RotateMatrixToRight {
    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        k = k%m;

        while(k!=0){
            //for each row
            for(int i=0;i<n;i++){
                int temp = mat[i][m-1];
                //rotate only column by one and repeat the process for k number of times
                for(int j=m-1;j>0;j--){
                    mat[i][j] = mat[i][j-1];
                }
                mat[i][0] = temp;
            }

            k--;
        }

        return mat;
    }
}
/*
Time complexity: O(k*n*m)
Space complexity: O(1)
 */