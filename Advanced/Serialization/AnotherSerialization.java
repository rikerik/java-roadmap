package Serialization;


import java.io.*;

class Emp implements Serializable {

    //Manually added Serial-version
    private static final long SerialversionUID = 129348938L;

    //The "transient" keyword marks this field as non-serializable
    //so the variable will be initialized with default value
    transient int a;
    static int b;
    String name;
    int age;

    //default constructor
    public Emp(String name, int age, int a, int b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

}

class SerialPrint {
    public static void printData(Emp object1) {
        System.out.println("Name = " + object1.name);
        System.out.println("Age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }
}

public class AnotherSerialization {
    public static void main(String[] args) {
        Emp object = new Emp("ab", 20, 2, 1000);
        String fileName = "Erik.txt";

        //Serialization
        try {
            //saving of object in file
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            //method for serialization of object
            objOut.writeObject(object);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized\n"
                    + "Data before serialization.");
            SerialPrint.printData(object);

            //value of static variable changed;
            object.b = 2000;


        } catch (IOException ioe) {
            System.out.println("IOException caught");
        }

        //Deserialization
        object = null;

        try {
            //Reading object from a file
            FileInputStream fileInput = new FileInputStream(fileName);
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            object = (Emp) objInput.readObject();

            objInput.close();
            fileInput.close();

            System.out.println("Object has been deserialized\n" +
                    "Data after deserialization");
            SerialPrint.printData(object);
        } catch (IOException ioe) {
            System.out.println("IOException caught");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ClassNotFoundException caught");
        }

        //the values of a and b has changed because a was transient
        //and b was static
        //A variable defined with static keyword is not serialized during serialization process.
        //This variable will be loaded with current value defined in the class during deserialization.
    }
}
