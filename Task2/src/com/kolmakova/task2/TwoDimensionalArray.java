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
        double [][] matrix = new double[n][n];
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
    public void displayMatrixAndColumnThatContainsTheMaxAmount(){
    int[][]matrix= Utility.getIntMatrixElements();
        Utility.printMatrix(getColumnThatContainsTheMaxAmount(matrix));
        System.out.println();

    }
    public int[][] getColumnThatContainsTheMaxAmount(int[][]m){
        int sumMax = -1;
        int colMax = 0;
        for (int j=0;j<COLUMN;j++ ) {
            int sum=0;
            for (int i = 0; i < ROW; i++) {
                sum=sum + m[i][ j];
                if (sum > sumMax ) {
                    sumMax=sum;
                    colMax=j;
                }
            }
        }
        System.out.println("Column: "+colMax+" "+"Sum: "+sumMax);
        return m;
    }
    public void displayMatrixAndPositiveElementsOfTheMainDiagonal(){
        int [][]matrix= Utility.getIntMatrixElements();
        System.out.println("Positive elements of the main diagonal are: ");
        Utility.printMatrix(getPositiveElementsOfTheMainDiagonal(matrix));
        System.out.println();

    }
    public int[][] getPositiveElementsOfTheMainDiagonal(int [][]m){
        for (int i=0;i<ROW; i++) {
            if (m[i][i] > 0) {
                System.out.print(m[i][i] + " ");
            }
        }
        System.out.println();
        return m;
    }
}


