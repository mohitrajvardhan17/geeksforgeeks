package com.company.amazon;

/*
Problem Statement:
Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then
make all the cells of ith row and jth column as 1.
Example 1
The matrix
1 0
0 0
should be changed to following
1 1
1 0

Example 2
The matrix
0 0 0
0 0 1
should be changed to following
0 0 1
1 1 1

Example 3
The matrix
1 0 0 1
0 0 1 0
0 0 0 0
should be changed to following
1 1 1 1
1 1 1 1
1 0 1 1
Time Complexity: O(M*N)
Auxiliary Space: O(1)
*/

public class BooleanMatrixCell {
    private final boolean[][] matrix;

    public BooleanMatrixCell(boolean[][] matrix) {
        this.matrix = matrix;
    }

    public void setRowAndColumnForMainDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]) {
                    for (int k = 0; k < matrix[i].length; k++) {
                        matrix[i][k] = true;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = true;
                    }
                }
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((matrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }

}
