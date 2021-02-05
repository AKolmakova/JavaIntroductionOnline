package com.kolmakova.task1;
import com.kolmakova.utility.Utility;

public class Cycle {

     private static final int START_OF_ASCII_TABLE_NUMBERS = 32;
     private static final int END_OF_ASCII_TABLE_NUMBERS = 127;

    public void sumsNumbers() {
        int num = Utility.readIntNumber("Enter a positive number: ");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "  ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum=" + sum);
    }

    public void getFunctionValue(float a, float b, float h) {
        float buff = 0;
        while (a != b) {
            a += h;
            if (a > 2) {
                System.out.printf("Y in %f= %f \n",a,buff);
            } else if (a <= 2) {
                System.out.printf("Y in %f= %f \n",a,buff);
            }
            buff += h;
        }
    }

    public void getSumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum=" + sum);
    }

    public void getMultiplicationSquares() {
        int mul = 1;
        for (int i = 1; i <= 200; i++) {
            mul *= Math.pow(i, 2);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("multiplication=" + mul);
    }

    public void getNumberOfMembers(float e, int n) {
        System.out.printf("e=%f", e);
        System.out.printf('\t' + "Degree(n)=%x", n);
        System.out.println();
        int k = 1;
        float sum = 0;
        while (k <= n) {
            float a = (float) (1 / Math.pow(2, k) + 1 / Math.pow(3, k));
            k++;
            System.out.print(a + " ");
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println();
        System.out.println("sum=" + sum);
    }

    public void getASCIITable() {
        for (int i = START_OF_ASCII_TABLE_NUMBERS; i <= END_OF_ASCII_TABLE_NUMBERS; i++) {
            System.out.print(" " + i + " - " + (char) (i) + " " + ";");
            if ((i - 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public void getDivider(int m, int n) {
        int divisors = 0;
        for (int i = m; (m <= i) && (i <= n); i++) {
            System.out.print("divisors of " + i + " is" + ":");
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    System.out.print(" " + j + " ");
                    divisors = 1;
                }
            }
            if (divisors == 0) {
                System.out.print(" There is no divisors");
            }
            System.out.println();
            divisors = 0;
        }
    }

    public void identifyCommonDigits(int firstNumber, int secondNumber) {
        while (firstNumber > 0) {
            int requiredDigit = firstNumber % 10;
            firstNumber = firstNumber / 10;
            int buff = secondNumber;
            while (buff > 0) {
                if (buff % 10 == requiredDigit) {
                    System.out.print(requiredDigit + " ");
                    System.out.println();
                }
                buff = buff / 10;
            }
        }
    }
}
