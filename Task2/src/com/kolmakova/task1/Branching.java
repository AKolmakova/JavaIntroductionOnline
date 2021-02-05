package com.kolmakova.task1;

public class Branching {

    public void printDefinitionOfTriangle(float firstAngle, float secondAngel) {
        System.out.println("First Angel=" + firstAngle);
        System.out.println("Second Angel=" + secondAngel);
        boolean TriangleRectangular = (firstAngle != 0) & (secondAngel != 0) & (firstAngle == 90) || (secondAngel == 90);
        boolean TriangleExists = firstAngle + secondAngel <= 180;
        if (TriangleRectangular) {
            System.out.println("Triangle exists and it is rectangular");
        } else if (TriangleExists) {
            System.out.println("Triangle exists  and it is not rectangular");
        } else {
            System.out.println("Triangle doesn't exists");
        }
    }

    public void getMaxNumberOfTwoMinNumbers(float a, float b, float c, float d) {
        System.out.printf("min(%f , %f)=%f\n",a,b, Math.min(a, b));
        System.out.printf("min(%f , %f)=%f\n",c,d, Math.min(c, d));
        System.out.printf("Max(%f ,%f)=%f\n", Math.min(a, b) , Math.min(c, d) , Math.max(Math.min(a, b), Math.min(c, d)));
    }

    public void determineCollinearOfLines(float x1, float x2, float x3, float y1, float y2, float y3) {
        System.out.printf("X Values: x1=%f x2=%f x3=%f \n", x1, x2, x3);
        System.out.printf("Y Values: y1=%f y2=%f y3=%f \n", y1, y2, y3);
        boolean linesCollinear = ((x1 - x2) * (y3 - y2)) == ((x3 - x2) * (y1 - y2));
        if (linesCollinear) {
            System.out.println("Lines are collinear");
        } else {
            System.out.println("Lines don't lie on one straight line");
        }
    }

    public void determineBrickPassing(float a, float b, float x, float y, float z) {
        System.out.printf("Brick parameters: A=%f B=%f \n", a, b);
        System.out.printf("Hole parameters: x=%f y=%f z=%f \n", x, y, z);
        boolean acceptableParametersForPassing = (a < x) && (b < y) || (a < x) && (b < z) || (a < z) && (b < y);
        if (acceptableParametersForPassing) {
            System.out.println("Pass through the hole");
        } else {
            System.out.println("Don't pass through the hole");
        }
    }

    public void getFunctionValue(float x) {
        System.out.printf("x=%f", x);
        System.out.println();
        float function;
        if (x <= 3) {
            function = (float) (Math.pow(x, 2) - 3 * x + 9);
        } else {
            function = (float) (1 / (Math.pow(x, 3) + 6));
        }

        System.out.println("F(x)=" + function);
    }
}

