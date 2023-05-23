package Lambda_Expressions;

//write a Java program that returns the value of Pi using the lambda expression.
public class LambdaExample {

    //this is a functional interface
    @FunctionalInterface
    interface MyInterface {
        //abstract method
        double getPiValue();
    }
    //We have created a functional interface named MyInterface.
    //It contains a single abstract method named getPiValue()

    public static void main(String[] args) {
        //declare reference to MyInterface
        MyInterface ref;

        //lambda expression
        ref = () -> 3.1415;
        //We then assigned a lambda expression to the reference.

        System.out.println("Value of Pi = " + ref.getPiValue());

        //We have declared a reference to MyInterface.
        //Note that we can declare a reference of an interface, but we cannot
        //instantiate an interface.
    }
}
