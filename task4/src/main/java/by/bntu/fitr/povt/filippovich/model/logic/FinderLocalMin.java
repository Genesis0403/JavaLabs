package by.bntu.fitr.povt.filippovich.model.logic;

import by.bntu.fitr.povt.filippovich.model.entity.Matrix;

public class FinderLocalMin {
    private static boolean find(Matrix array, int x, int y) {
        boolean min = false;
        if (x > 0 && x < array.getCountRows() - 1  && y > 0 && y < array.getCountColumns() - 1) {
            if (array.getElement(x, y) < array.getElement(x + 1, y)
                    && array.getElement(x, y) < array.getElement(x + 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x, y + 1)
                    && array.getElement(x, y) < array.getElement(x - 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x - 1, y)
                    && array.getElement(x, y) < array.getElement(x - 1, y - 1)
                    && array.getElement(x, y) < array.getElement(x, y - 1)
                    && array.getElement(x, y) < array.getElement(x + 1, y - 1)) {
                min = true;
            }
        }


        if (x == 0 && y == 0) {
            if (array.getElement(x, y) < array.getElement(x + 1, y)
                    && array.getElement(x, y) < array.getElement(x + 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x, y + 1)) {
                min = true;
            }
        }
        if (x == array.getCountRows() - 1 && y == 0) {
            if (array.getElement(x, y) < array.getElement(x - 1, y)
                    && array.getElement(x, y) < array.getElement(x - 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x, y + 1)) {
                min = true;
            }
        }
        if (x == array.getCountRows() - 1 && y == array.getCountColumns() - 1) {
            if (array.getElement(x, y) < array.getElement(x - 1, y)
                    && array.getElement(x, y) < array.getElement(x - 1, y - 1)
                    && array.getElement(x, y) < array.getElement(x, y - 1)) {
                min = true;
            }
        }
        if (x == 0 && y == array.getCountColumns() - 1) {
            if (array.getElement(x, y) < array.getElement(x + 1, y)
                    && array.getElement(x, y) < array.getElement(x + 1, y - 1)
                    && array.getElement(x, y) < array.getElement(x, y - 1)) {
                min = true;
            }
        }


        if (x == 0 && y > 0 && y < array.getCountColumns() - 1) {
            if (array.getElement(x, y) < array.getElement(x, y + 1)
                    && array.getElement(x, y) < array.getElement(x, y - 1)
                    && array.getElement(x, y) < array.getElement(x + 1, y)
                    && array.getElement(x, y) < array.getElement(x + 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x + 1, y - 1)) {
                min = true;
            }
        }
        if (y == 0 && x > 0 && x < array.getCountRows() - 1) {
            if (array.getElement(x, y) < array.getElement(x + 1, y)
                    && array.getElement(x, y) < array.getElement(x + 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x, y + 1)
                    && array.getElement(x, y) < array.getElement(x - 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x - 1, y)) {
                min = true;
            }
        }
        if (x == array.getCountRows() - 1 && y > 0 && y < array.getCountColumns()) {
            if (array.getElement(x, y) < array.getElement(x, y - 1)
                    && array.getElement(x, y) < array.getElement(x - 1, y - 1)
                    && array.getElement(x, y) < array.getElement(x - 1, y)
                    && array.getElement(x, y) < array.getElement(x - 1, y + 1)
                    && array.getElement(x, y) < array.getElement(x, y + 1)) {
                min = true;
            }
        }
        if(y == array.getCountColumns() - 1 && x > 0 && x < array.getCountRows() - 1){
            if(array.getElement(x, y) < array.getElement(x - 1, y)
                    && array.getElement(x, y) < array.getElement(x - 1, y - 1)
                    && array.getElement(x, y) < array.getElement(x , y - 1)
                    && array.getElement(x, y) < array.getElement(x + 1, y - 1)
                    && array.getElement(x, y) < array.getElement(x + 1, y)){
                min = true;
            }
        }

        return min;
    }

    public static int countLocalMin(Matrix array) {
        if (array == null)
            return 0;
        int count = 0;
        for (int i = 0; i < array.getCountRows(); i++) {
            for (int j = 0; j < array.getCountColumns(); j++) {
                if (find(array, i, j)) {
                    ++count;
                }
            }
        }
        return count;
    }
}

