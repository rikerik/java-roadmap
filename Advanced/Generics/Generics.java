package Generics;

import java.util.ArrayList;

/*
Java Generics allows us to create a single class,
interface, and method that can be used with different
types of data (objects).

Generic does not work with primitive types (int, float, char, etc).
 */
public class Generics {
    public static void main(String[] args) {

        //initialize generics class
        // with String data
        GenericsClass<String> stringObject = new GenericsClass<>("Java programming");
        System.out.println("Generic Class returns: " + stringObject.getData());

        // with Integer data
        GenericsClass<Integer> intObject = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObject.getData());


        //GENERICS METHOD


        //init the class with Integer data
        AnotherGenericClass AGC = new AnotherGenericClass();

        //generics method working with string
        AGC.<String>genericsMethod("Java programming");
        AGC.genericsMethod("Calling the method without including the type parameter");

        //generics method working with String
        AGC.<Integer>genericsMethod(25);


        //BOUNDED TYPES

        //create an object of BoundedTypes
        //BoundedTypes<String> obj = new BoundedTypes<String>();
        //here we will get an error, because
        //we can only give numbers for parameter

        // creating a string type ArrayList
        ArrayList<String> list1 = new ArrayList<>();

// creating a integer type ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();

    }
}
//ADVANTAGES OF GENERICS

//Code Reusability
//Compile-time Type Checking
//Used with Collections


