package calculator;

import historyOfAllOperation.OperationHistoryEntry;
import operator.Operator;
import printer.Printer;
import historyOfAllOperation.HistoryOfAllOperations;

public class MathCalculator implements Calculator {

    private final Printer printer;
    private final HistoryOfAllOperations history;

    public MathCalculator(Printer printer, HistoryOfAllOperations history) {
        this.printer = printer;
        this.history = history;
    }

    @Override
    public void calculate(double first, double second, Operator operator) {
        double result = 0.0;

        switch (operator) {
            case SUM -> result = first + second;
            case SUBTRACTION -> result = first - second;
            case DIVIDE -> result = first / second;
            case MULTIPLY -> result = first * second;
        }

        OperationHistoryEntry entry = new OperationHistoryEntry(operator, first, second, result);
        history.addOperation(entry);

        System.out.println("Операция добавлена в историю: " + entry);

        printer.print(result);
    }

    public void printHistory() {
        if (history.getTransactions().isEmpty()) {
            System.out.println("История операций пуста.");
        } else {
            System.out.println("История операций:");
            for (OperationHistoryEntry entry : history.getTransactions()) {
                System.out.println("Операция: " + entry.getOperator() +
                        "\nПервый операнд: " + entry.getOperand1() +
                        "\nВторой операнд: " + entry.getOperand2() +
                        "\nРезультат: " + entry.getResult() +
                        "\nВремя операции: " + entry.getTimestamp() + "\n");
            }
        }
    }}



