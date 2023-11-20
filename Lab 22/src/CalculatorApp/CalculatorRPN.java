package CalculatorApp;

import Exceptions.IncorrectExpressionException;

import java.util.ArrayDeque;
import java.util.Stack;

public class CalculatorRPN {
    public static String infixToRPN(String infix) throws RuntimeException {
        String[] tokens = infix.split(" ");
        Stack<String> operatorsStack = new Stack<>();
        ArrayDeque<String> rpnDeque = new ArrayDeque<>();
        for (String token : tokens) {
            try {
                Double d = Double.parseDouble(token);
                rpnDeque.addFirst(token);
            } catch (NumberFormatException e) {
                switch (token) {
                    case "(" -> operatorsStack.push(token);
                    case "*", "/" -> {
                        while (!operatorsStack.isEmpty() && !operatorsStack.peek().equals("(")) {
                            rpnDeque.addFirst(operatorsStack.pop());
                        }
                        operatorsStack.push(token);
                    }
                    case "+", "-" -> {
                        while (!operatorsStack.isEmpty() && (operatorsStack.peek().equals("+") || operatorsStack.peek().equals("-"))) {
                            rpnDeque.addFirst(operatorsStack.pop());
                        }
                        operatorsStack.push(token);
                    }
                    case ")" -> {
                        while (!operatorsStack.isEmpty() && !operatorsStack.peek().equals("(")) {
                            rpnDeque.addFirst(operatorsStack.pop());
                        }
                        if (operatorsStack.isEmpty())
                            throw new IncorrectExpressionException(infix + " [missed bracket]");
                        operatorsStack.pop();
                    }
                    default -> throw new UnsupportedOperationException();
                }
            }
        }
        while (!operatorsStack.isEmpty()) {
            if (operatorsStack.peek().equals("(") || operatorsStack.peek().equals(")"))
                throw new IncorrectExpressionException(infix + " [missed bracket]");
            rpnDeque.addFirst(operatorsStack.pop());
        }
        StringBuilder rpnExpressionBuilder = new StringBuilder();
        while (!rpnDeque.isEmpty()) {
            rpnExpressionBuilder.append(rpnDeque.pollLast());
            if (!rpnDeque.isEmpty()) {
                rpnExpressionBuilder.append(' ');
            }
        }
        return rpnExpressionBuilder.toString();
    }

    public static Double calculateRPN(String rpn) throws RuntimeException {
        String[] tokens = rpn.split(" ");
        Stack<Double> stack = new Stack<>();
        for (String token : tokens) {
            try {
                stack.push(Double.parseDouble(token));
            } catch (NumberFormatException e) {
                Double d1 = stack.pop();
                Double d2 = stack.pop();
                stack.add(calculate(d2, d1, token));
            }
        }
        if (stack.size() != 1)
            throw new IncorrectExpressionException(rpn);
        return stack.pop();
    }

    private static Double calculate(Double d1, Double d2, String operation) {
        return switch (operation) {
            case "+" -> d1 + d2;
            case "-" -> d1 - d2;
            case "*" -> d1 * d2;
            case "/" -> d1 / d2;
            default -> throw new UnsupportedOperationException(operation);
        };
    }
}
