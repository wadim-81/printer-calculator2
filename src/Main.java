import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Calculator calculator = new Calculator(printer);
        Scanner scanner = new Scanner(System.in);
        Parser parser = new Parser(calculator, scanner);

        parser.parse();
    }
}
