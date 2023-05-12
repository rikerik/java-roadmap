package File_API.Writer;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

//The OutputStreamWriter converts its chracters into bytes
public class OutputSW {
    public static void main(String[] args) {

        String data = "This line will be inside the text file";

        try {
            //creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("SWOutput.txt");

            //creates an OutputStreamWriter
            OutputStreamWriter output = new OutputStreamWriter(file);

            //writes string to the file
            output.write(data);

            //closes the writer
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
