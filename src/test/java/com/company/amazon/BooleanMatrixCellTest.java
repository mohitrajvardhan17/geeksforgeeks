package com.company.amazon;

import org.junit.Test;

public class BooleanMatrixCellTest {

    @Test
    public void setRowAndColumnForMainDiagonal() {
        boolean matrix[][] = {{false, false, false}, {false, false, true}};
        BooleanMatrixCell booleanMatrixCell = new BooleanMatrixCell(matrix);
        booleanMatrixCell.setRowAndColumnForMainDiagonal();
        booleanMatrixCell.displayMatrix();
    }
}
