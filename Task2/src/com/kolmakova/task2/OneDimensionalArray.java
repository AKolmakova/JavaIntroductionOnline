package com.kolmakova.task2;
import com.kolmakova.utility.Utility;

import java.util.Arrays;

public class OneDimensionalArray {
    private static final int COLUMN = 4;

    public void determineSumOfMultiplesOfElements(int k) {
        int[] array = Utility.getIntArrayElements();
        int sum = 0;
        for (int j : array) {
            if (j % k == 0) {
                sum = sum + j;
                System.out.print(j + " ");
            }

        }
        System.out.println();
        Utility.printOneDimensionalIntArray(array);
        System.out.printf("\nK=%d\n", k);
        System.out.printf("Sum=%d\n", sum);

    }

    public void replacingWithSpecifiedNumberAndCountReplacements(float z) {
        float[] arr = Utility.getFloatArrayElements();
        Utility.printOneDimensionalFloatArray(arr);
        int k = 0;
        for (int i = 0; i < COLUMN; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                k++;
            }
        }
        System.out.println();
        Utility.printOneDimensionalFloatArray(arr);
        System.out.println();
        System.out.printf("Replacements : %d\n", k);
    }

    public void countNegativePositiveZeroElements() {
        float[] arr = Utility.getFloatArrayElements();
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (float j : arr) {
            if (j < 0) {
                negative++;
            }
            if (j > 0) {
                positive++;
            }
            if (j == 0) {
                zero++;
            }
        }
        Utility.printOneDimensionalFloatArray(arr);
        System.out.printf("\nPositive elements: %d, Negative elements: %d , Zero: %d\n", positive, negative, zero);
    }

    public float[] swapMaxAndMinElement() {
        float[] array = Utility.getFloatArrayElements();
        Utility.printOneDimensionalFloatArray(array);
        System.out.println();
        float max = 1;
        float min = 1;
        for (int i = 0; i < COLUMN; i++) {
            if (array[i] > array[(int) max]) {
                max = i;
            }
            if (array[i] < array[(int) min]) {
                min = i;
            }

        }
        float ar = array[(int) max];
        array[(int) max] = array[(int) min];
        array[(int) min] = ar;
        return array;
    }

    public void printSwappedArray() {
        Utility.printOneDimensionalFloatArray(swapMaxAndMinElement());
        System.out.println();
    }

    public int[] getNumbersWhereElementGreaterThanIndex() {
        int[] ar = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(ar);
        System.out.println();
        int element = 0;
        for (int i = 0; i < COLUMN; i++) {
            if (ar[i] > i) {
                element++;
            }
        }
        int[] newArray = new int[element];
        int newArrayElements = 0;

        for (int i = 0; i < COLUMN; i++) {
            if (ar[i] > i) {
                newArray[newArrayElements] = ar[i];
                newArrayElements++;
            }
        }
        return newArray;
    }

    public void printArrayWhereElementGreaterThanIndex() {
        Utility.printOneDimensionalIntArray(getNumbersWhereElementGreaterThanIndex());
        System.out.println();
    }

    public boolean checkIfNumberIsPrime(int n) {
        if (n < 2) return false;
        int temp;
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public void defineSumOfNumbersWhoseOrdinalNumbersArePrime() {
        float[] array = Utility.getFloatArrayElements();
        Utility.printOneDimensionalFloatArray(array);
        System.out.println();
        float sum = 0;
        for (int i = 0; i < COLUMN; i++) {
            if (checkIfNumberIsPrime(i)) {
                sum += array[i];
            }
        }
        System.out.printf("Sum=%f ", sum);
        System.out.println();
    }

    public void printMax() {
        float[] array = Utility.getFloatArrayElements();
        Utility.printOneDimensionalFloatArray(array);
        System.out.printf("\nMax=%f\n", getMax(array));

    }

    public float getMax(float[] arr) {
        float max = arr[0] + arr[COLUMN - 1];
        for (int i = 1; i < COLUMN / 2; i++) {
            if ((arr[i] + arr[COLUMN - i - 1]) > max) {
                max = arr[i] + arr[COLUMN - i - 1];
            }

        }
        return max;
    }

    public void printSequences() {
        int[] arr = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(arr);
        System.out.println();
        Utility.printOneDimensionalIntArray(getNewSequence(arr));
        System.out.println();
    }

    public int[] getNewSequence(int[] ar) {
        int minVal = Integer.MAX_VALUE;
        for (int tmpEl : ar) minVal = Math.min(minVal, tmpEl);
        int countMinElem = 0;
        for (int tmpEl : ar)
            if (tmpEl == minVal) countMinElem++;

        int[] newArray = new int[COLUMN - countMinElem];
        int indexNewArray = 0;
        for (int tmpEl : ar)
            if (tmpEl != minVal) {
                newArray[indexNewArray++] = tmpEl;
            }
        return newArray;
    }

    public void printTheMostFrequentlyOccurringNumbers() {
        int[] array = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(array);
        System.out.println();
        Utility.printOneDimensionalIntArray(getTheMostFrequentlyOccurringNumbers(array));
        System.out.println();

    }

    public int[] getTheMostFrequentlyOccurringNumbers(int[] ar) {
        int res = 0;
        int[] counts = new int[COLUMN];
        for (int i = 0; i < COLUMN; i++) {
            int count = 1;
            for (int j = i + 1; j < COLUMN; j++) {
                if (ar[i] == ar[j])
                    count++;
            }
            counts[i] = count;
            if (counts[i] == counts[res])
                res = ar[res] > ar[i] ? i : res;
            else
                res = count > counts[res] ? i : res;
        }
        return new int[]{ar[res]};
    }

    public void printCompressedArray() {
        int[] array = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(array);
        System.out.println();
        Utility.printOneDimensionalIntArray(getCompressedArray(array));
        System.out.println();

    }

    public int[] getCompressedArray(int[] ar) {
        if (COLUMN < 2)
            return ar;
        int count = 1;
        if (COLUMN > 2) {


            for (int i = 2; i < COLUMN; i += 2) {
                ar[count] = ar[i];
                count++;
            }
            ar = Arrays.copyOf(ar, COLUMN / 2);
        } else {
            ar = Arrays.copyOf(ar, COLUMN / 2);
        }
        return ar;
    }


}




