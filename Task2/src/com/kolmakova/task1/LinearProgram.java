package com.kolmakova.task1;


public class LinearProgram {
     private static final int NUMBER_DIVIDER=1000;
     private static final int SECONDS_DIVIDER=3600;
     private static final int MINUTES_DIVIDER=60;

    public void findFunctionValue(double a,double b,double c) {
        System.out.println("z = ( (a – 3 ) * b / 2) + c");
        System.out.printf("a=%f",a);
        System.out.printf(" b=%f",b);
        System.out.printf(" c=%f",c);
        double z = ((a - 3) * b / 2) + c;
        System.out.println();
        System.out.printf("z=%f \n", z);
    }

    public void evaluateExpressionValue(float a, float b, float c) {
        System.out.printf("a=%f",a);
        System.out.printf('\t'+"b=%f",b);
        System.out.printf('\t'+"c=%f",c);
        float expression = (float) ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println();
        System.out.println("Expression=" + expression);
    }

    public void calculateValueOfTrigonometricExpression(float sinX, float cosX, float sinY, float cosY) {
        float function = (float) ((Math.sin(sinX) + Math.cos(cosY)) / (Math.cos(cosX) - Math.sin(sinY)) * Math.sin(sinX) / Math.cos(cosY));
        System.out.printf("sin(x)=%f",sinX);
        System.out.printf(" cos(x)=%f",cosX);
        System.out.printf(" sin(y)=%f",sinY);
        System.out.printf(" cos(y)=%f", cosY);
        System.out.println();
        System.out.printf("F(x)=%f \n",function);

    }

    public void swapPartsOfNumber(double num) {
        double n = (int) num;
        double result = n / NUMBER_DIVIDER + (num - n) * NUMBER_DIVIDER;
        System.out.printf("Number(R) of nnn.ddd format is: %f \n " ,num);
        System.out.printf("R=%f" ,result);
        System.out.println();
    }

    public void convertTimeFromSeconds(long sec) {
        int h = (int) (sec / SECONDS_DIVIDER);
        int m = (int) (sec % SECONDS_DIVIDER / MINUTES_DIVIDER);
        int s = (int) (sec % SECONDS_DIVIDER % MINUTES_DIVIDER);
        System.out.printf("%d.h %d.m %d.s \n",h,m,s);
    }

    public void showPointsBelonging(float x,float y) {
        System.out.printf("x=%f",x);
        System.out.printf(" y=%f \n",y);
        System.out.println("Range of x values: [-4;4]");
        System.out.println("Range of y values: [-3;4]");
        boolean coordinatesInRange=(y <= 4) && (y >= -3) && (x <= 4) && (x >= -4);
        if (coordinatesInRange) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

