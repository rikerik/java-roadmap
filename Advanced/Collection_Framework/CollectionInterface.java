package Collection_Framework;

//The Collection interface is the root interface of the Java collections framework.
//There is no direct implementation of this interface. However,
//it is implemented through its subinterfaces like List, Set, and Queue.

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionInterface {
    public static void main(String[] args) {

        //IMPLEMENTING LINKEDLIST

        //creating a list using hte LinkedList class
        List<Integer> numbers = new LinkedList<>();

        //adding elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        //acces element from the list
        int number = numbers.get(2);
        System.out.println("Accesed Element: " + number);

        //using the indexOf() method-
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is: " + index);

        //remove element from the list
        int removedElement = numbers.remove(1);
        System.out.println("The removed element: " + removedElement);

        //IMPLEMENTATION OF VECTOR
        //The Vector class synchronizes each individual operation.
        //This means whenever we want to perform some operation on vectors,
        //the Vector class automatically applies a lock to that operation.

        Vector<String> mammals = new Vector<>();

        mammals.add("Dog");
        mammals.add("Horse");

        //using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        //using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New vector: " + animals);

        //access the elements
        Iterator<String> iterate = animals.iterator();
        System.out.println("Vector: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        //remove elements
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        //using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);

        // It is recommended to use ArrayList in place of Vector because vectors less efficient.
    }

}
