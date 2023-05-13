package File_API.Writer;

import java.io.PrintWriter;

/*
Unlike other writers, PrintWriter converts the primitive data (int, float, char, etc.) into the text format.
It then writes that formatted data to the writer.

Also, the PrintWriter class does not throw any input/output exception.
Instead, we need to use the checkError() method to find any error in it.

Note: The PrintWriter class also has a feature of auto flushing.
This means it forces the writer to write all data to the destination if one of the println() or printf() methods is called.
 */
public class PrintW {
    public static void main(String[] args) {

        String data = "This line will be in the outputPrintW.txt file";

        try {
            PrintWriter output = new PrintWriter("outputPrintW.txt");

            output.print(data);

            int age = 20;

            //with printf we can print formatted string
            output.println();
            output.printf("I am %d years old", age);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
