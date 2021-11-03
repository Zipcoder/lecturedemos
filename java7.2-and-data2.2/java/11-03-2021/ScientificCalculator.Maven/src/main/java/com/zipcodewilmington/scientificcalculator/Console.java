package com.zipcodewilmington.scientificcalculator;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    private final Scanner input;
    private final PrintStream output;
    private final AnsiColor ansiColor;

    public Console() {
        this(AnsiColor.AUTO);
    }

    public Console(AnsiColor ansiColor) {
        this(ansiColor, System.in, System.out);
    }

    public Console(AnsiColor ansiColor, InputStream in, PrintStream out) {
        this.ansiColor = ansiColor;
        this.input = new Scanner(in);
        this.output = out;
    }

    public void print(String val, Object... args) {
        output.format(ansiColor.getColor() + val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Double getDoubleInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Double doubleInput = Double.parseDouble(stringInput);
            return doubleInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting a numeric value!");
            return getDoubleInput(prompt, args);
        }
    }

    public Long getLongInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Long longInput = Long.parseLong(stringInput);
            return longInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
            return getLongInput(prompt, args);
        }
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        return getLongInput(prompt, args).intValue();
    }
}
