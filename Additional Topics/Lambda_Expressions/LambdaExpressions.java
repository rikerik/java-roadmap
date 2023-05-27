package Lambda_Expressions;

import java.lang.FunctionalInterface;

//Its main objective to increase the expressive power of the language.
//If a Java interface contains one and only one abstract method then it
//is termed as functional interface.
//This only one method specifies the intended purpose of the interface.
//For example, the Runnable interface from package java.lang; is a functional
//interface because it constitutes only one method i.e. run().

public class LambdaExpressions {

    //Defining a Functional interface
    @FunctionalInterface
    public interface MyInterface {
        //the single abstract method
        double getValue();
    }
    //Here, we have used the annotation @FunctionalInterface.
    //The annotation forces the Java compiler to indicate that the interface
    //is a functional interface. Hence, does not allow to have more than one abstract method.
    //However, it is not compulsory though.


    public static void main(String[] args) {
        //In Java 7, functional interfaces were considered as Single Abstract Methods or SAM type.
        //SAMs were commonly implemented with Anonymous Classes in Java 7.

        //anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I just implemented the Runnable Functional Interface");
            }
        }).start();
        //Since we know that a functional interface has just one method,
        //there should be no need to define the name of that method when
        //passing it as an argument. Lambda expression allows us to do exactly that.

        //Lambda expression is, essentially, an anonymous or unnamed method.
        //The lambda expression does not execute on its own. Instead, it is used
        //to implement a method defined by a functional interface.


    }

    //Defining a lambda expression: (parameter list) -> lambda body
    //Suppose we have a method like this:
    double getPiValue() {
        return 3.1415;
    }

    //We can write this method using lambda expression as: () -> 3.1415

    // In Java, the lambda body is of two types.
    // A body with a single expression: () -> System.out.println("Lambdas are great");
    //This type of lambda body is known as the expression body.

    //A body that consists of a block of code.
   /* () -> {
        double pi = 3.1415;
        return pi;
    };
    */
    //This type of the lambda body is known as a block body.
    //The block body allows the lambda body to include multiple statements.
    //These statements are enclosed inside the braces and you have to add a
    //semicolon after the braces.


}
