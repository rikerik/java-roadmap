package File_API.Reader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class InputSR {
    public static void main(String[] args) {

        //Creates an array of characters
        //we will store the data in this array
        char[] array = new char[100];

        try {
            //Creates a FileInputStream
            //this will read streams of raw bytes
            FileInputStream file = new FileInputStream("inputSR.txt");

            //Creates an InputStreamReader
            //this reads the bytes and decodes them into characters
            //we can specify the charset
            InputStreamReader input = new InputStreamReader(file, StandardCharsets.UTF_16);

            //Reads characters from the file into the array
            input.read(array);
            System.out.println("Data in the stream");
            System.out.println(array);

            //close the reader
            input.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //get the type of encoding that
        //is used to store data in the input stream.
        try {
            FileInputStream file = new FileInputStream("inputSR.txt");

            //creates an InputStreamReader with default encoding
            InputStreamReader input1 = new InputStreamReader(file);

            //creates an InputStreamReader specifying the encoding
            InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));

            //returns the charater encoding of the input stream
            System.out.println("Charater encoding of input1: " + input1.getEncoding());
            System.out.println("Charater encoding of input2: " + input2.getEncoding());

            //close the readers
            input1.close();
            input2.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
