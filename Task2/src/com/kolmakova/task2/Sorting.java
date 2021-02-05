package com.kolmakova.task2;
import com.kolmakova.utility.Utility;
import java.util.Arrays;

public class Sorting {

    private static final int COLUMN = 4;


    public void displayTwoOneDimensionalArraysAndCombinedArray() {
        int[] firstArray = Utility.getIntArrayElements();
        int[] secondArray = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(firstArray);
        System.out.println();
        Utility.printOneDimensionalIntArray(secondArray);
        System.out.println();
        Utility.printOneDimensionalIntArray(getCombinedArrays(firstArray, secondArray, 2));
        System.out.println();
    }

    public int[] getCombinedArrays(int[] a, int[] b, int k) {
        System.arraycopy(b, 0, a, k, COLUMN - 2);
        for (int i = 0; i < COLUMN; i++) {
            System.out.print(a[i] + " ");
        }

        return a;
    }

    public void displayOriginalAndSortBySelectionArrays() {
        int[] array = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(array);
        System.out.println();
        Utility.printOneDimensionalIntArray(getSortBySelectionArray(array));
        System.out.println();

    }

    public int[] getSortBySelectionArray(int[] a) {
        for (int i = 0; i < COLUMN; i++) {
            int pos = i;
            int min = a[i];
            for (int j = i + 1; j < COLUMN; j++) {
                if (a[j] < min) {
                    pos = j;
                    min = a[j];
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
        return a;
    }

    public void displayOriginalAndSortByExchangeArrays() {
        int[] array = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(array);
        System.out.println();
        Utility.printOneDimensionalIntArray(getSortByExchangeArray(array));
        System.out.println();
    }

    public int[] getSortByExchangeArray(int[] arr) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < COLUMN - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        return arr;
    }



    public int getBinarySearch(int[] ar, int first, int num) {
        System.out.println("Number is :" + num);
        System.out.println();
        int last = num - 2;
        int position;
        position = (first + last) / 2;
        while ((ar[position] != num) && (first <= last)) {
            if (ar[position] > num) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        return position;
    }

    public void defineSortByInsertArray() {
        int[] array= Utility.getIntArrayElements();
        Arrays.sort(array);
        Utility.printOneDimensionalIntArray(array);
        int number=5;
        int pos=getBinarySearch(array,0,number);
        for (int left = 0; left < COLUMN-1; left++) {
            array[pos] = number;
        }
    }
}




