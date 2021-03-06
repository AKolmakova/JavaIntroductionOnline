package com.kolmakova.config;
import com.kolmakova.utility.Utility;

import com.kolmakova.task1.RunnerTask1;
import com.kolmakova.task2.RunnerTask2;
import com.kolmakova.task3.RunnerTask3;

public class Runner {
    public static void launch() {
        Utility.printSeparator();
        System.out.println("TASK 1: ");
        Utility.printSeparator();
        RunnerTask1.launch();
        Utility.printSeparator();
        System.out.println("TASK 2: ");
        Utility.printSeparator();
        RunnerTask2.launch();
        System.out.println("TASK 3: ");
        Utility.printSeparator();
        RunnerTask3.launch();
    }
}
