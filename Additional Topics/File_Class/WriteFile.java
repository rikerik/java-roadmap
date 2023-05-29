package File_Class;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        String data = "This text is going to be written into the output file";
        try {
            //creates a writer using FileWriter
            FileWriter output = new FileWriter("Output.txt");

            //Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file");

            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
