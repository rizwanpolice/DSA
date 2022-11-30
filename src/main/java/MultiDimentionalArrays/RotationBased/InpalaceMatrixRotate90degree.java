package MultiDimentionalArrays.RotationBased;

/*
You are given a square matrix of non-negative integers of size 'N x N'.
 Your task is to rotate that array by 90 degrees in an anti-clockwise direction without using any extra space.
 For given 2D array :

    [    [ 1,  2,  3 ],
         [ 4,  5,  6 ],
         [ 7,  8,  9 ]  ]

After 90 degree rotation in anti clockwise direction, it will become:

    [   [ 3,  6,  9 ],
        [ 2,  5,  8 ],
        [ 1,  4,  7 ]   ]

Problem link: https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118821/offering/1381904
Solution link: https://www.youtube.com/watch?v=Y72QeX0Efxw&t=22s
 */
public class InpalaceMatrixRotate90degree {
    public static void inplaceRotate(int[][] arr, int n) {
        // First do a transpose of a matrix
        // Transpose means convert rows into columns or columns to rows
        // below is the code to find transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Now reverse each column in a matrix
        // For this we use two pointer approach to reverse in place
        for(int j=0;j<n;j++){
            for(int i=0;i<n/2;i++){
                int temp = arr[i][j];
                arr[i][j] = arr[n-1-i][j];
                arr[n-1-i][j] = temp;
            }
        }
    }
}

/*
Time complexity: O(2*n*m)
Space complexity: O(1)
 */