package File_API.Reader;

import java.io.StringReader;

//the specified string acts as a
// source from where characters are read individually.
public class StringR {
    public static void main(String[] args) {
        String data = "this is the text read from StringReader";
        System.out.println("Original data: " + data);

        //create a character of array
        char[] array = new char[100];

        try {
            //create a StringReader
            StringReader input = new StringReader(data);

            //skip method
            input.skip(5);

            //read
            input.read(array);
            System.out.println("Data after skipping 5 characters: ");
            System.out.println(array);

            input.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
