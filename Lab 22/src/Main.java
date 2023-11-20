import CalculatorApp.CalculatorApp;
import CalculatorApp.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.run();

        /*String rpnStr = "( 5 + 4 ) / ( 6 - 3 ) * 100";
        CalculatorApp.CalculatorRPN rpn = new CalculatorApp.CalculatorRPN();
        try {
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(5);
            System.out.println(df.format(rpn.calculateRPN(rpn.infixToRPN(rpnStr))));
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported operation (" + e.getMessage() + ")");
        } catch (Exceptions.IncorrectExpressionException e) {
            System.out.println("Incorrect expression (" + e.getMessage() + ")");
        } catch (Exception e) {
            System.out.println("Unknown exception (" + e.getMessage() + ")");
        }*/
    }
}