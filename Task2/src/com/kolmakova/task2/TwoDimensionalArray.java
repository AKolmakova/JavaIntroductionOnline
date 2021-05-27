package com.kolmakova.task2;

import com.kolmakova.utility.Utility;

public class TwoDimensionalArray {
    private static final int ROW = 4;
    private static final int COLUMN = 4;

    public void displayMatrixAndOddColumnsWhereFirstElemLargerThanLast() {
        int[][] matrix = Utility.getIntMatrixElements();
        Utility.printMatrix(matrix);
        System.out.println();
        printOddColumnsWhereFirstElemLargerThanLast(matrix);

    }

    public void printOddColumnsWhereFirstElemLargerThanLast(int[][] m) {
        System.out.println("Odd columns whose first element is larger than the last.:");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j += 2) {
                if (m[0][j] > m[ROW - 1][j]) {
                    System.out.print(m[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void displayMatrixAndElementsStandingOnTheDiagonal() {
        int[][] matrix = Utility.getIntMatrixElements();
        Utility.printMatrix(matrix);
        System.out.println();
        printElementsStandingOnTheDiagonal(matrix);
    }

    public void printElementsStandingOnTheDiagonal(int[][] m) {
        int x = 0;
        System.out.println("Elements standing on the main diagonal: ");
        for (int j = 0; j < COLUMN; j++) {
            System.out.print(m[j][j] + " ");
        }
        System.out.println();
        System.out.println("Elements standing on a side diagonal: ");
        for (int i = COLUMN - 1; i > -1; i--) {
            System.out.print(m[i][x] + " ");
            x++;

        }
        System.out.println();
    }

    public void displayMatrixRowColumn() {
        int[][] matrix = Utility.getIntMatrixElements();
        Utility.printMatrix(matrix);
        System.out.println();
        System.out.println("Column is:");
        printColumn(matrix, 2);
        System.out.println();
        System.out.println("Row is:");
        printRow(matrix, 1);
        System.out.println();
    }

    public void makeFirstMatrixBySample() {
        int n = 4;
        int[][] matrix = Utility.getIntMatrixElements();
        System.out.println("n = " + n);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) matrix[i][j] = j + 1;
                else matrix[i][j] = n - j;
            }
        Utility.printMatrix(matrix);
        System.out.println();
    }

    public void makeSecondMatrixBySample() {
        int n = 6;
        int[][] matrix = new int[n][n];
        System.out.println("n = " + n);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + 1;
            }
            n--;
        }
        Utility.printMatrix(matrix);
        System.out.println();
    }

    public void makeThirdMatrixBySample() {
        int n = 8;
        int[][] matrix = new int[n][n];
        System.out.println("n = " + n);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i <= matrix.length / 2)) {
                    if ((j >= i) && (j <= matrix.length - 1 - i)) {
                        matrix[i][j] = 1;
                    }
                } else {
                    if ((j >= matrix.length - 1 - i) && (j <= i)) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }
        Utility.printMatrix(matrix);
        System.out.println();
    }

    public void printColumn(int[][] m, int column) {
        for (int row = 0; row < ROW; row++) {
            System.out.println(m[row][column] + " ");
        }

    }

    public void printRow(int[][] array, int row) {
        for (int column = 0; column < COLUMN; column++) {
            System.out.print(array[row][column] + " ");
        }
    }

    public void displayTheOriginalMatrixAndMatrixOfOrderN(int n) {
        double[][] matrix = new double[n][n];
        int countPositive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (double) Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    countPositive++;
                }
            }

        }
        Utility.printDoubleMatrix(matrix);
        System.out.println("\nThere are " + countPositive + " positive numbers in matrix");
    }

    public void displayMatrixAndColumnsInSomePlaces() {
        int[][] matrix = Utility.getIntMatrixElements();
        Utility.printMatrix(matrix);
        System.out.println();
        System.out.println("Enter the first and second columns to be swapped");
        Utility.printMatrix(getColumnsInSomePlaces(matrix));
        System.out.println();

    }

    public int[][] getColumnsInSomePlaces(int[][] m) {
        int buff;
        int i;
        int firstColumn = Utility.readIntNumber("Enter first column:");
        int secondColumn = Utility.readIntNumber("Enter second column: ");
        for (i = 0; i < ROW; i++) {
            buff = m[i][firstColumn];
            m[i][firstColumn] = m[i][secondColumn];
            m[i][secondColumn] = buff;
        }
        return m;

    }

    public void displayMatrixAndColumnThatContainsTheMaxAmount() {
        int[][] matrix = Utility.getIntMatrixElements();
        Utility.printMatrix(getColumnThatContainsTheMaxAmount(matrix));
        System.out.println();

    }

    public int[][] getColumnThatContainsTheMaxAmount(int[][] m) {
        int sumMax = -1;
        int colMax = 0;
        for (int j = 0; j < COLUMN; j++) {
            int sum = 0;
            for (int i = 0; i < ROW; i++) {
                sum = sum + m[i][j];
                if (sum > sumMax) {
                    sumMax = sum;
                    colMax = j;
                }
            }
        }
        System.out.println("Column: " + colMax + " " + "Sum: " + sumMax);
        return m;
    }

    public void displayMatrixAndPositiveElementsOfTheMainDiagonal() {
        int[][] matrix = Utility.getIntMatrixElements();
        System.out.println("Positive elements of the main diagonal are: ");
        Utility.printMatrix(getPositiveElementsOfTheMainDiagonal(matrix));
        System.out.println();

    }

    public int[][] getPositiveElementsOfTheMainDiagonal(int[][] m) {
        for (int i = 0; i < ROW; i++) {
            if (m[i][i] > 0) {
                System.out.print(m[i][i] + " ");
            }
        }
        System.out.println();
        return m;
    }

    public void getInfoAboutMatrix() {
        int[][] matrix = new int[10][20];
        String s = "More or three times 5 is repeated in rows:";
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.print(matrix[i][j] + "\t");
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            System.out.println();
            if (count >= 3) {
                s = s + i + "\t";
            }
        }
        System.out.println(s);
        System.out.println();
    }

    public void printInfoAboutMatrixWithSortedRowsInAscAndDescOrder() {
        int[][] matrix = Utility.getIntMatrixElements();
        System.out.println("Before sorting:");
        Utility.printMatrix(matrix);
        System.out.println("\nAfter sort(in ascending order):");
        Utility.printMatrix(getMatrixAscSortedByRows(matrix));
        System.out.println("\nAfter sort(in descending order):");
        Utility.printMatrix(getMatrixDescSortedByRows(matrix));
        System.out.println();
    }

    public int[][] getMatrixAscSortedByRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public int[][] getMatrixDescSortedByRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public void printRandomMatrix() {
        int[][] matrix;
        matrix = new int[ROW][COLUMN];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                if (i <= j - 1) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void getInfoAboutTheLargestElementOfMatrixAndReplaceOddElementsWithIt() {
        int[][] arr = Utility.getIntMatrixElements();
        Utility.printMatrix(arr);
        System.out.println("\nMax element is:"+findMaxElement(arr));
        System.out.println("New matrix: ");
        replaceOddElementsWithTheMaximum(arr,findMaxElement(arr));
    }

    public int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }

    public void replaceOddElementsWithTheMaximum(int[][] matrix,int n){
        int i=0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (ints[j] %2 != 0) {
                    ints[j] = n;
                }
            }
        }
        Utility.printMatrix(matrix);
        System.out.println();
    }
    public void createMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        if (n % 2 != 0) {
            int x = n / 2;
            int y = matrix.length - 1;
            int count = 1;

            while (true) {
                matrix[(matrix.length - 1) - y][x] = count;
                count++;

                if (x == matrix.length - 1) x = -1;
                if (y >= matrix.length - 1) y = -1;
                y++;
                x++;
                if (matrix[matrix.length - 1 - y][x] != 0) y--;

                int countDiagonal = 0;
                for (int[] array : matrix) {
                    for (int z : array) {
                        if (z == 0) countDiagonal++;
                    }
                }
                if (countDiagonal == 0) break;
            }
        } else if (n % 4 == 0) {
            int count = 0;
            for (int i = 0; i < matrix.length / 2; i++) {
                int operation;
                if (i < matrix.length / 2) {
                    operation = matrix[i][i];
                    matrix[i][i] = matrix[matrix.length - 1 - count][matrix.length - 1 - count];
                    matrix[matrix.length - 1 - count][matrix.length - 1 - count] = operation;
                    count++;
                }
            }
            count = 0;
            for (int i = 0; i < matrix.length / 2; i++) {
                int operation;
                if (i < matrix.length / 2) {
                    operation = matrix[matrix.length - 1 - count][i];
                    matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length - 1 - count];
                    matrix[i][matrix.length - 1 - count] = operation;
                    count++;
                }
            }
        } else
            System.out.println(" Magic square size can't be 2x2!");
        Utility.printMatrix( matrix);
        System.out.println();
    }


}





