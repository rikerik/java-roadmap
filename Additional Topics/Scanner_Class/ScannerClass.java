package Scanner_Class;

import java.util.Scanner;

//The Scanner class of the java.util package is used to read input data from
//different sources like input streams, users, files, etc.

//WORKING OF JAVA SCANNER:
/*
The Scanner class reads an entire line and divides the line into tokens.
Tokens are small elements that have some meaning to the Java compiler. For example,
Suppose there is an input string:
"He is 22"
In this case, the scanner object will read the entire line and divides the string
into tokens: "He", "is" and "22". The object then iterates over each token and
reads each token using its different methods.
Note: By default, whitespace is used to divide tokens.
 */

public class ScannerClass {
    public static void main(String[] args) {
        //Read a Line of Text Using Scanner

        //creates an object of Scanner
        // in = standard input stream, this stream corresponds with keyboard for example
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        //takes input from the keyboard
        String name = sc.nextLine();

        //printing name
        //Unlike next(), the nextLine() method reads the entire line of input including spaces.
        //The method is terminated when it encounters a next line character, \n.
        System.out.println("My name is: " + name);

        //we can create objects of the Scanner class which will be able
        //to read input, for example from input stream, files or a string

        //Scanner sc1 = new Scanner(InputStream input);
        //Scanner sc2 = new Scanner(File file);
        //Scanner sc3 = new Scanner(String str);

        //Reading int value:
        System.out.println("Enter an integer: ");

        //reads an int value
        int data1 = sc.nextInt();
        System.out.println("Using nextInt(): " + data1);

        //using next()
        //I will provide my full name
        System.out.println("Enter your name");

        //reads the entire word
        String value = sc.next();

        //Here, we have provided the full name. However, the next() method only reads the first name.
        //This is because the next() method reads input up to the whitespace character.
        //Once the whitespace is encountered, it returns the string (excluding the whitespace).
        System.out.println("Using next(): " + value);

        //closes the scanner
        //If we do not close the Scanner then Java will not garbage collect the
        //Scanner object, and we will have a memory leak in the program
        sc.close();
    }
}
