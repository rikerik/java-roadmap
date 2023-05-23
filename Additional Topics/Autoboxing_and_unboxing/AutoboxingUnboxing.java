package Autoboxing_and_unboxing;

import java.util.ArrayList;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Java Autoboxing - Primitive Type to Wrapper Object.
        //In autoboxing, the Java compiler automatically converts primitive
        //types into their corresponding wrapper class objects.

        int a = 56;

        //autoboxing
        Integer aObj = a;

        //Autoboxing has a great advantage while working with Java collections.
        ArrayList<Integer> list = new ArrayList<>();

        //autoboxing
        list.add(5);
        list.add(6);

        System.out.println("ArrayList: " + list);
        //we have created an array list of Integer type.
        //Hence the array list can only hold objects of Integer type.
        //We are passing primitive type value. However, due to autoboxing,
        //the primitive value is automatically converted into an Integer object and stored in the array list.

        //In unboxing, the Java compiler automatically converts wrapper
        //class objects into their corresponding primitive types.

        //autoboxing
        Integer intObject = 56;

        //unboxing
        int intA = intObject;

        ArrayList<Integer> arrList = new ArrayList<>();

        //autoxing
        arrList.add(5);
        arrList.add(6);

        System.out.println("arrList: " + arrList);

        //unboxing
        int num = list.get(0);
        System.out.println("Value at index 0: " + a);

        //Here, the get() method returns the object at index 0.
        //However, due to unboxing, the object is automatically
        //converted into the primitive type int and assigned to the variable a
    }
}
