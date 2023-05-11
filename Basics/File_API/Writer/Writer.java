package File_API.Writer;

import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {

        String data = "This is the data for the output file";

        try {
            //creates a writer using FileWriter
            java.io.Writer output = new FileWriter("output.txt");


            //writes string to the file
            output.write(data);
            System.out.println("The file has been created!");

            //closes the writer
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
