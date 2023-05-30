package Serialization;
//Serialization is a mechanism of converting the state of an object into a byte stream.
//Deserialization is the reverse process where the byte stream is used to recreate the
//actual Java object in memory. This mechanism is used to persist the object.

import java.io.*;

//Here we have created a class which we will serialize
//so we have to implement the Serializable class
class Serializing implements java.io.Serializable {
    public int a;
    public String b;

    //default constructor
    public Serializing(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class Serialization {
    public static void main(String[] args) {
        //we create the object what we will serialize
        Serializing object = new Serializing(1, "Erik");
        String fileName = "file.ser";

        //Serialization
        try {
            //saving object in a file
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            //Method for serialization of object
            objOut.writeObject(object);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized");

        } catch (IOException ioe) {
            System.out.println("IOException is caught");
        }

        //Deserialization
        Serializing object1 = null;

        try {
            //Reading the object from a file
            FileInputStream fileInput = new FileInputStream(fileName);
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            //Method for deserialization of object
            object1 = (Serializing) objInput.readObject();


            objInput.close();
            fileInput.close();
            System.out.println("Object has been deserialized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);

        } catch (IOException ioe) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
