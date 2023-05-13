package File_API.Reader;

//buffer of 8192 characters by default
//During the read operation in BufferedReader,
// a chunk of characters is read from the disk
// and stored in the internal buffer.
// And from the internal buffer characters are read individually.

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedR {
    public static void main(String[] args) {

        //creates an array of characters
        char[] array = new char[100];


        try {
            //creates a filereader
            FileReader file = new FileReader("inputBuffered.txt");

            //creates a BufferedReader
            BufferedReader input = new BufferedReader(file);

            //check if the file reader is ready to read
            System.out.println(input.ready());

            //reads the characters
            input.read(array);
            System.out.println("Data in the file");
            System.out.println(array);

            //closes the reader
            input.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //SKIP METHOD TO SKIP A SPECIFIED NUMBER OF CHARACTERS
        try {
            FileReader file = new FileReader("inputBuffered.txt");

            BufferedReader input = new BufferedReader(file);

            //skip 5 characters
            input.skip(5);

            input.read(array);

            System.out.println("Data after skipping 5 chracters: ");
            System.out.println(array);

            input.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
