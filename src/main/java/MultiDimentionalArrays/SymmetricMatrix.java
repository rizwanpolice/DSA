package MultiDimentionalArrays;

/*
A symmetric matrix is that matrix whose transpose is equal to the matrix itself.

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381899?leftPanelTab=0

 */
public class SymmetricMatrix {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        int n = matrix.length;

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(matrix[row][col]!=matrix[col][row]){
                    return false;
                }
            }
        }

        return true;
    }
}

/*
Time complexity: O(n2)
Space complexity: O(1)
 */
