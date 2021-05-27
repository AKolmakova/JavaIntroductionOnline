package com.kolmakova.task2;
import com.kolmakova.utility.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

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
        System.arraycopy(b, 0, a, k, a.length-2);
        for (int j : a) {
            System.out.print(j + " ");
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
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            int min = a[i];
            for (int j = i + 1; j < a.length; j++) {
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
            for (int i = 0; i < arr.length-1 ;i++) {
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
        System.out.println("\nNumber is :" + num);
        System.out.println();
        int last = ar.length-1;
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
        int array[]=Utility.getIntArrayElements();
        System.out.println("Unsorted array: ");
        Utility.printOneDimensionalIntArray( array);
            for (int i = 1; i < array.length; ++i) {
                int j = i - 1;
                int buff = array[i];
                int index = binarySearch(array, buff, 0, j);

                while (j >= index) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = buff;
            }
        System.out.println("\nSorted array:");
            Utility.printOneDimensionalIntArray(array);
        System.out.println();
        }

        private int binarySearch(int[] array, int item, int low, int high) {
            if (high <= low)
                return (item > array[low]) ?
                        (low + 1) : low;

            int mid = (low + high) / 2;

            if (item == array[mid])
                return mid + 1;

            if (item > array[mid])
                return binarySearch(array, item, mid + 1, high);
            return binarySearch(array, item, low, mid - 1);
        }

    public void shellSort()
    {
        int[] a=Utility.getIntArrayElements();
        System.out.println("Original array:");
        Utility.printOneDimensionalIntArray(a);
        System.out.println();
        int step = a.length / 2;
        while (step > 0)
        {
            int i, j;
            for (i = step; i < a.length; i++)
            {
                int value = a[i];
                for (j = i - step; (j >= 0) && (a[j] > value); j -= step)
                    a[j + step] = a[j];
                a[j + step] = value;
            }
            step /= 2;
        }
        System.out.println("Sorted array:");
        Utility.printOneDimensionalIntArray(a);
        System.out.println();
    }

    public void insertSequence(List<Integer> in, List<Integer> from) {
        System.out.println("First sequence:");
        Utility.printArrayList(in);
        System.out.println("Second sequence:");
        Utility.printArrayList(from);

        List<Integer> indexes = getIndex(in, from);

        for (int i = 0; i < indexes.size(); i++) in.add(indexes.get(i), from.get(i));
        System.out.println("Coupled sequence " + in);
    }

    private List<Integer> getIndex(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) result.add(-(dex + 1) + i);
            else result.add(dex + i);
        }
        return result;
    }

    public void defineCommonDenominators() {
        int n=4;
        int[] p =Utility.getIntArrayElements();
        int[] q = Utility.getIntArrayElements();
        System.out.print("Fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + q[i] + ", ");
        }
        System.out.println();

        int lcm = (q[0] * q[1]) / gcd(q[0], q[1]);
        int buf;
        for (int i = 2; i < n; i++) {
            if (i == n - 1) {
                buf = q[i];
            } else
                buf = (q[i] * q[i + 1]) / gcd(q[i], q[i + 1]);
            lcm = (lcm * buf) / gcd(lcm, buf);
        }
        System.out.println("Common denominator: " + lcm);

        for (int i = 0; i < n; i++) {
            int mul = lcm / q[i];
            p[i] = p[i] * mul;
        }
        System.out.print("Fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + lcm + ", ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int buff = p[i];
            int j;
            for (j = i - 1; j >= 0 && p[j] > buff; --j)
                p[j + 1] = p[j];
            p[j + 1] = buff;
        }
        System.out.print("Sorted fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + lcm + ", ");
        }
        System.out.println();
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }


}




