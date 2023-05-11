package File_API.Reader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
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
    }
}
