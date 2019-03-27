package by.bntu.fitr.povt.filippovich.model;

import by.bntu.fitr.povt.filippovich.model.entity.Matrix;
import by.bntu.fitr.povt.filippovich.model.logic.FinderLocalMin;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderLocalMinTest {

    @Test
    public void whenMatrix_findLocalMin_returnIndex() {
        Matrix matrix = new Matrix(new int[][]{
                {1, 3, 5},
                {2, 4, 6},
                {7, 8, 9}
        });
        int expected = 1;
        assertEquals(expected, FinderLocalMin.countLocalMin(matrix));

    }

    @Test
    public void emptyMatrix() {
        Matrix matrix = new Matrix(new int[5][5]);
        int expected = 0;
        assertEquals(expected, FinderLocalMin.countLocalMin(matrix));
    }

    @Test
    public void nullMatrix() {
        Matrix matrix = null;
        int excepted = 0;
        assertEquals(excepted, FinderLocalMin.countLocalMin(matrix));
    }
}