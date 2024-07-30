import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Calculator calculator = new Calculator(printer);

        Scanner scanner = new Scanner(System.in);
        String stringToCalculate = scanner.nextLine();
        String[] operands = stringToCalculate.split(" ");

        String firstOperand = operands[0]; //первое число
        String secondOperand = operands[2]; //второе число
        String operator = operands[1]; //знак


        calculator.


        //35 + 56


    }
}
