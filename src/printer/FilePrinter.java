package printer;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

    @Override
    public void print(double result) {
        try (FileWriter writer = new FileWriter("result.txt", true)) {

            writer.write(result + " ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
