package File_API.Reader;

import java.io.FileReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
    //Creates an array of character
        char[] array = new char[100];

        try {
            //creates a reader using the FileReader
            Reader input = new FileReader("input.txt");

            //checks if reader is ready
            System.out.println("Is there data in the stream? " + input.ready());

            //reads characters
            input.read(array);
            System.out.println("Data in the stream");
            System.out.println(array);

            //closes the reader
            input.close();

        }
        catch (Exception e) { e.getStackTrace();}

    }
}
