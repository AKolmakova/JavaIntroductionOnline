package com.kolmakova.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {

    private static final int ROW = 4;
    private static final int COLUMN = 4;


    public static void printSeparator() {
        System.out.println("**************************************************************");
    }

    public static int[] getIntArrayElements() {
        int randomNumber;
        int[] array = new int[COLUMN];
        Random rand = new Random();
        for (int i = 0; i < COLUMN; i++) {
            randomNumber = rand.nextInt(COLUMN);
            array[i] = randomNumber;
        }

        return array;
    }

    public static float[] getFloatArrayElements() {
        float[] arr = new float[COLUMN];
        Random randomGenerator = new Random();

        for (int i = 0; i < COLUMN; ++i) {
            arr[i] = randomGenerator.nextInt(ROW);
        }
        return arr;
    }

    public static void printOneDimensionalIntArray(int[] ar) {
        for (int j : ar) {
            System.out.print(j + " ");
        }
    }

    public static void printOneDimensionalFloatArray(float[] ar) {
        for (float j : ar) {
            System.out.print(j + " ");
        }
    }

    public static int[][] getIntMatrixElements() {
        int[][] arr = new int[ROW][COLUMN];
        Random rnd = new Random();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                arr[i][j] = rnd.nextInt(10);
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }

    public static void printDoubleMatrix(double[][] array) {
        for (double[] ints : array) {
            System.out.println();
            for (double anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }

    public static int readIntNumber(String message) {
        while (true) {
            System.out.println(message);
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception ex) {
                System.out.println("Enter positive integer!");
            }
        }
    }
}



