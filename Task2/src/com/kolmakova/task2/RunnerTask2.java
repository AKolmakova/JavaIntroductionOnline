package com.kolmakova.task2;

import java.util.ArrayList;
import java.util.List;

public class RunnerTask2 {
    public static void launch() {
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
        TwoDimensionalArray twoDimensionalArray= new TwoDimensionalArray();
        Sorting sorting=new Sorting();
        Decomposition decomposition=new Decomposition();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("ONE DIMENSIONAL ARRAY");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("Exercise 1:");
        oneDimensionalArray.determineSumOfMultiplesOfElements(3);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2:");
        oneDimensionalArray.replacingWithSpecifiedNumberAndCountReplacements(4);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 3:");
        oneDimensionalArray.countNegativePositiveZeroElements();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 4:");
        oneDimensionalArray.printSwappedArray();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 5:");
        oneDimensionalArray.printArrayWhereElementGreaterThanIndex();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 6:");
        oneDimensionalArray.defineSumOfNumbersWhoseOrdinalNumbersArePrime();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 7:");
        oneDimensionalArray.printMax();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 8:");
        oneDimensionalArray.printSequences();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 9:");
        oneDimensionalArray.printTheMostFrequentlyOccurringNumbers();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 10:");
        oneDimensionalArray.printCompressedArray();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("TWO DIMENSIONAL ARRAY");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("Exercise 1:");
        twoDimensionalArray.displayMatrixAndOddColumnsWhereFirstElemLargerThanLast();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2:");
        twoDimensionalArray.displayMatrixAndElementsStandingOnTheDiagonal();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 3:");
        twoDimensionalArray.displayMatrixRowColumn();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 4:");
        twoDimensionalArray.makeFirstMatrixBySample();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 5:");
        twoDimensionalArray.makeSecondMatrixBySample();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 6:");
        twoDimensionalArray.makeThirdMatrixBySample();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 7:");
        twoDimensionalArray.displayTheOriginalMatrixAndMatrixOfOrderN(6);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 8:");
        twoDimensionalArray.displayMatrixAndColumnsInSomePlaces();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 9:");
        twoDimensionalArray.displayMatrixAndColumnThatContainsTheMaxAmount();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 10:");
        twoDimensionalArray.displayMatrixAndPositiveElementsOfTheMainDiagonal();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 11:");
        twoDimensionalArray.getInfoAboutMatrix();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 12:");
        twoDimensionalArray.printInfoAboutMatrixWithSortedRowsInAscAndDescOrder();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 14:");
        twoDimensionalArray.printRandomMatrix();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 15:");
        twoDimensionalArray.getInfoAboutTheLargestElementOfMatrixAndReplaceOddElementsWithIt();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 16:");
        twoDimensionalArray.createMagicSquare(3);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("SORTING");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("Exercise 1:");
        sorting.displayTwoOneDimensionalArraysAndCombinedArray();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 3:");
        sorting.displayOriginalAndSortBySelectionArrays();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 4:");
        sorting.displayOriginalAndSortByExchangeArrays();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 5:");
        sorting.defineSortByInsertArray();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 6:");
        sorting.shellSort();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 7:");
        List<Integer> in = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(7);
                add(10);
                add(11);
            }
        };
        List<Integer> from = new ArrayList<>() {
            {
                add(8);
                add(32);
                add(64);
                add(89);
                add(99);
            }
        };
        sorting.insertSequence(in,from);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 8:");
        sorting.defineCommonDenominators();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("DECOMPOSITION");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");
        System.out.println("Exercise 1:");
        decomposition.defineNOKAnDNOD();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2:");
        decomposition.defineNODOfFourNumbers();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 3:");
        decomposition.defineAreaOfHexagon();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 5:");
        decomposition.defineInfoAboutSecondLargestNumber();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 6:");
        decomposition.checkIfNumbersAreCoprime();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 7:");
        decomposition.getSumOfFactorials();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 8:");
        decomposition.defineInfoAboutConsecutiveElements();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 9:");
        decomposition.defineInfoAboutQuadrangle();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 11:");
        decomposition.defineNumberWithMoreDigits();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 12:");
        decomposition.defineArrayOfNumbers();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 13:");
        decomposition.getTwinsNumbers();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 14:");
        decomposition.getArmstrongNumbers();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 15:");
        decomposition.getNumbersFormingStrictlyAscendingSequence();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 16:");
        decomposition.getSumOfOddNumbers();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 17:");
        decomposition.getDeductedSumOfDigitsFromNumber();
        System.out.println("----------------------------------------------------------------------------------");
    }
    }


