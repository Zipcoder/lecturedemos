package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */ // static means occurring independent of the state of the instance of the class
public class MainApplication {
    public static void main(String[] args) {
        Console blueConsole = new Console(AnsiColor.BLUE);
        Console greenConsole = new Console(AnsiColor.GREEN);
        blueConsole.println("Welcome to my calculator!");

        String operation;
        do {
            greenConsole.println("From here you can enter any of the following operations");
            operation = blueConsole.getStringInput("quit, +, -, /, *");
            Double firstOperand = null;
            Double secondOperand = null;
            Double result = null;
            switch (operation) {
                case "+":
                    firstOperand = greenConsole.getDoubleInput("Enter the first operand");
                    secondOperand = blueConsole.getDoubleInput("Enter the second operand");
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    firstOperand = greenConsole.getDoubleInput("Enter the first operand");
                    secondOperand = blueConsole.getDoubleInput("Enter the second operand");
                    result = firstOperand - secondOperand;
                    break;
                case "/":
                    firstOperand = greenConsole.getDoubleInput("Enter the first operand");
                    secondOperand = blueConsole.getDoubleInput("Enter the second operand");
                    result = firstOperand / secondOperand;
                    break;
                case "*":
                    firstOperand = greenConsole.getDoubleInput("Enter the first operand");
                    secondOperand = blueConsole.getDoubleInput("Enter the second operand");
                    result = firstOperand * secondOperand;
                    break;
                default:
                    continue;
            }
            Console redConsole = new Console(AnsiColor.RED);
            redConsole.println("The result was %s", result);
        }while(!operation.equalsIgnoreCase("quit"));
    }

}
