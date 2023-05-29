package File_Class;

import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        //checking the working directory
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        char[] array = new char[100];
        try {
            //create a reader using the FileReader
            FileReader input = new FileReader("input.txt");
            //reads characters
            input.read(array);
            System.out.println("Data in the file");
            System.out.println(array);

            input.close();
        } catch (Exception e) {
       throw new RuntimeException(e);
        }
    }
}
