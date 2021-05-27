package com.kolmakova.task2;

import com.kolmakova.utility.Utility;

import java.util.Random;

public class Decomposition {

    public void defineNOKAnDNOD() {
        int a = 18;
        int b = 100;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("NOD of two numbers=" + getNOD(a, b));
        System.out.println();
        System.out.println("NOK of numbers=" + a * b / getNOD(a, b));
        System.out.println();

    }

    public int getNOD(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }

    public void defineNODOfFourNumbers() {
        int firstNumber = 18;
        int secondNumber = 200;
        int thirdNumber = 1000;
        int fourthNumber = 12;
        System.out.println("First number=" + firstNumber);
        System.out.println("Second number=" + secondNumber);
        System.out.println("Third number=" + thirdNumber);
        System.out.println("Fourth number=" + fourthNumber);
        System.out.println("NOD of numbers=" + getNOD(getNOD(firstNumber, secondNumber), getNOD(thirdNumber, fourthNumber)));
        System.out.println();
    }

    public void defineAreaOfHexagon() {
        int a = 4;
        System.out.println("a=4");
        System.out.println("Area of a regular hexagon=" + getArea(a));
        System.out.println();
    }

    public double getArea(int a) {
        return Math.sqrt(Math.pow(a, 2) - Math.pow(a, 2) / 2) * a / 2;
    }

    public void defineInfoAboutSecondLargestNumber() {
        int[] A = Utility.getIntArrayElements();
        Utility.printOneDimensionalIntArray(A);
        System.out.println();
        System.out.println("Second largest element is: " + getSecondLargestNumber(A));
    }

    public int getSecondLargestNumber(int[] a) {
        int max1 = a[0];
        int max2 = a[1];
        for (int i = 2; i < a.length; i++) {
            if (a[i] > max2) {
                max2 = a[i];
            }

            if (max2 > max1) {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }
        return max2;

    }

    public void getSumOfFactorials() {
        int factorial = 1, until = 9;
        int sum = 0;
        for (int i = 1; i <= until; i += 2) {
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            sum += factorial;
            factorial = 1;
        }
        System.out.println("Sum of factorials of all odd numbers from 1 to 9: " + sum);
    }

    public void checkIfNumbersAreCoprime() {
        int firstNumber = 3;
        int secondNumber = 4;
        int thirdNumber = 8;
        if (getNOD(firstNumber, secondNumber) == 1 & getNOD(firstNumber, thirdNumber) == 1
                & getNOD(secondNumber, thirdNumber) == 1) {
            System.out.println("Numbers are coprime");
        } else {
            System.out.println("Numbers are not coprime");
        }
    }

    public void defineInfoAboutConsecutiveElements() {
        int randomNumber;
        int n = 10;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            randomNumber = rand.nextInt(n);
            arr[i] = randomNumber;
        }
        Utility.printOneDimensionalIntArray(arr);
        System.out.println("\nSum= " + gettheSumOfThreeConsecutiveElements(arr, 0, 3));
    }


    public int gettheSumOfThreeConsecutiveElements(int[] a, int k, int m) {
        int sum = 0;
        for (int i = k; i < m; i++) {
            sum += a[i];
        }
        return sum;
    }

    public void defineInfoAboutQuadrangle() {
        int x = 4;
        int y = 5;
        int z = 6;
        int t = 7;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("t=" + t);
        System.out.println("Quadrangle area is: " + getAreaOfQuadrangle(x, y, z, t));

    }

    public double getAreaOfQuadrangle(int a, int b, int c, int d) {
        double diagonal = Math.sqrt(a * a + b * b);
        double s1 = a * b * 0.5;
        double s2 = 0.25 * Math.sqrt((diagonal + c + d) * (diagonal + c - d) * (diagonal + d - c) * (c + d - diagonal));
        return s1 + s2;
    }

    public void defineNumberWithMoreDigits() {
        int firstNumber = 1234;
        int secondNumber = 12345;
        System.out.println("First number is: " + firstNumber);
        System.out.println("Second number is: " + secondNumber);
        boolean isFirstNumberHaveMoreDigit = String.valueOf(firstNumber).toCharArray().length > String
                .valueOf(secondNumber).toCharArray().length;
        System.out.println(isFirstNumberHaveMoreDigit ? "The first number has more digits"
                : "The second number has more digits");
    }

    public void defineArrayOfNumbers() {
        int[] array = new int[10];
        int n=100;
        int k=7;
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int number = (int) (Math.random() * 100) + 10;
                if ((getSumOfDigits(number) == k) && (number < n)) {
                    array[i] = number;
                    break;
                }
            }
        }

        System.out.printf("The array with number, the sum of the digits of which = %d and less than %d:", k, n);
        Utility.printOneDimensionalIntArray(array);
        System.out.println();
    }

    private int getSumOfDigits(int number) {
        int i = 0;
        int sum = 0;
        String s = Integer.toString(number);

        while (i != s.length()) {
            sum = sum + (number % 10);
            number = number / 10;
            i++;
        }
        return sum;
    }

    public void getTwinsNumbers() {
        int n = 3;
        int last = n * 2;
        System.out.println("Twins: ");
        System.out.println();
        while (n < last - 1) {
            System.out.println(n + " and " + (n + 2) + ",");
            n++;
        }
    }

    public void getArmstrongNumbers() {
        int k = 20;
        System.out.print("Armstrong numbers from 1 to " + k + " : ");
        int number = 1;
        do {
            if (checkNumbersForBeArmstrong(number)) System.out.print(number + " ");
            number++;
        } while (number <= k);
        System.out.println();
    }

    private boolean checkNumbersForBeArmstrong(int number) {
        double sqr = Math.pow(getSumOfDigits(number), Integer.toString(number).length());
        return sqr == number;
    }

    public void getNumbersFormingStrictlyAscendingSequence() {
        int n=3;
        int a = 0, b = 0, k = 1;
        for (int i = 0; i < n; i++)
        {
            a += (n - i) * k;
            b += (9 - i) * k;
            k *= 10;
        }
        for (int i = a; i <= b; i++)
        {
            k = i;
            int d = k % 10, j;
            for (j = 1; j < n; j++)
            {
                k /= 10;
                if (k % 10 >= d) break;
                d = k % 10;
            }
            if (j == n) System.out.print(i+",");

        }
        System.out.println();
    }

    public void getSumOfOddNumbers() {
        int n=4;
        int sum = 0;
        double start = Math.pow(10, n - 1);

        for (double i = start; i < Math.pow(10, n); i++) {
            if (checkNumberForOddDigits (126) == 0) {
                sum = sum + (int) i;
            }
        }
        System.out.println("Sum of the all numbers with odd digits: " + sum);
        System.out.print("Even digits int the sum: ");
        int count = 0;

        while (sum > 0){
            int number1 = sum % 10;
            sum = sum / 10;
            if (number1 % 2 == 0) {
                System.out.print(number1 + ", ");
                count++;
            }
        }
        if (count == 0) System.out.println("there is no even digits in the sum");
    }

    private int checkNumberForOddDigits(int number) {
        int check = 0;

        while (number > 0){
            int number1 = number % 10;
            number = number / 10;

            if (number1 % 2 == 0) {
                check = 1;
                break;
            }
        }

        return check;
    }

    public void getDeductedSumOfDigitsFromNumber() {
        int number=123;
        System.out.println("The number: " + number);
        System.out.println();

        int count = 0;
        while (number != 0) {
            int sum = getSumOfDigits(number);
            int buf = number;
            number = number - sum;
            System.out.printf("num = %d - %d = %d", buf, sum, number);
            System.out.println();
            count++;
        }
        System.out.println();
        System.out.println("Count of operations: " + count);
    }

}






