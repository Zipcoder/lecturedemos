/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 9:34 AM
 */
public class Calculator {
    private CalculatorEngine engine;
    private CalculatorDisplay display;

    public void run() {
        double firstValue;
        double secondValue;
        switch (display.getMainMenu()) {
            case "multiply":
                firstValue = display.getConsole().getDoubleInput("Enter the first operand");
                secondValue = display.getConsole().getDoubleInput("Enter the first operand");
                display.getConsole().println(engine.multiply(firstValue, secondValue));
                break;

            case "divide":
                firstValue = display.getConsole().getDoubleInput("Enter the first operand");
                secondValue = display.getConsole().getDoubleInput("Enter the first operand");
                display.getConsole().println(engine.divide(firstValue, secondValue));
                break;

            case "add":
                firstValue = display.getConsole().getDoubleInput("Enter the first operand");
                secondValue = display.getConsole().getDoubleInput("Enter the first operand");
                display.getConsole().println(engine.add(firstValue, secondValue));
                break;
        }
    }

}
