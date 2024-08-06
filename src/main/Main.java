package main;
import calculator.MathCalculator;
import historyOfAllOperation.HistoryOfAllOperations;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



    HistoryOfAllOperations history = new HistoryOfAllOperations();

    ConsolePrinter consolePrinter = new ConsolePrinter();
    FilePrinter filePrinter = new FilePrinter();
    MathCalculator mathCalculator = new MathCalculator(filePrinter,history);
    Scanner scanner = new Scanner(System.in);
    StringParser stringParser = new StringParser(mathCalculator, scanner);

        System.out.println("введите ваши числа, например(2 + 2)  ");
        stringParser.parse();

        System.out.println("история всех операций ");
        mathCalculator.printHistory();
        scanner.close();
    }
}
