package File_API.Writer;

import java.io.StringWriter;


/*
In Java, string buffer is considered as a mutable string.
That is, we can modify the string buffer.
To convert from string buffer to string,
we can use the toString() method.
 */
public class StringW {
    public static void main(String[] args) {

        String data = "This is the text in the String";

        try {

            //create a Stringwriter
            StringWriter output = new StringWriter();

            //writes data to the string buffer
            output.write(data);

            //prints the string writer
            System.out.println("Data in the StringWriter: "+output);

            //Returns the string buffer
            StringBuffer stringBuffer = output.getBuffer();
            System.out.println("StringBuffer: " +stringBuffer);

            //Returns the string buffer in string form
            String string = output.toString();
            System.out.println("String: " +string);

            output.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
