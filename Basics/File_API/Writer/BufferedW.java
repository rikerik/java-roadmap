package File_API.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

//During the write operation, the characters are written
//to the internal buffer instead of the disk. Once the
//buffer is filled or the writer is closed, the whole
//characters in the buffer are written to the disk.
public class BufferedW {
    public static void main(String[] args) {

        String data = "This line goes into the outputBuffered.txt file";
        String data2 = "This will be in a new line";

        try {
            // Creates a FileWriter
            FileWriter file = new FileWriter("outputBuffered.txt");
            // Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);
            // Writes the string to the file
            output.write(data);

            //Insert a new line to the writer
            output.newLine();

            output.write(data2);

            //Insert specified characters
            output.append(" appended text");

            //Flushes data to the destination
            //This method forces the writer to
            // write all data present in the buffer
            // to the destination file.
            output.flush();

            // Closes the writer
            output.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
