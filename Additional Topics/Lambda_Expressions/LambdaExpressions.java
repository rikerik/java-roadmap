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

    public static void main(String[] args) {


    }

}
