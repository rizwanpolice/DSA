package MultiDimentionalArrays;

/*
You are given an N * N matrix of integers where each row and each column is sorted in increasing order.
You are given a target integer 'X'. Find the position of 'X' in the matrix, if it exists then return the pair {i, j}
where 'i' represents the row and 'j' represents the column of the array, otherwise return {-1,-1}

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381898?leftPanelTab=0

 */
public class FindElementInSortedMatrix {
    public static Pair search(int [][] matrix, int x) {

        /*
        This is a brute force solution for finding element in a matrix
        */
        int n= matrix.length;

        for(int row =0;row<n;row++){
            for(int col=0;col<n;col++){
                if(matrix[row][col]==x)
                    return new Pair(row,col);
            }
        }

        return new Pair(-1,-1);
    }

    static class Pair{
        int x; int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}

/*
Time complexity: O(n2)
Space complexity: O(1)
 */
