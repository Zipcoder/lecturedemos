package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 3:50 PM
 */
public class StaticConsole {
    private static Console console = new Console(AnsiColor.RED);

    public static void print(String output, Object... args) {
        console.print(output, args);
    }

    public static void println(String output, Object... args) {
        console.print(output, args);
    }

    public static String getStringInput(String prompt) {
        return console.getStringInput(prompt);
    }

    public static Integer getIntegerInput(String prompt) {
        return console.getIntegerInput(prompt);
    }

    public static Double getDoubleInput(String prompt) {
        return console.getDoubleInput(prompt);
    }
}
