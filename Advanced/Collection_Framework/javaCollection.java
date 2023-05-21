package Collection_Framework;

/*
The Collection in Java is a framework that provides an architecture
to store and manipulate the group of objects. Java Collections can
achieve all the operations that you perform on a data such as searching,
sorting, insertion, manipulation, and deletion.
 */

import java.util.ArrayList;
import java.util.Iterator;

//A Collection represents a single unit of objects, i.e., a group.
public class javaCollection {
    public static void main(String[] args) {

        /*
        The ArrayList class implements the List interface.
        It uses a dynamic array to store the duplicate element of different data types.
        The ArrayList class maintains the insertion order and is non-synchronized.
        The elements stored in the ArrayList class can be randomly accessed.
        Consider the following example.
         */
        ArrayList<String> aList = new ArrayList<String>(); //Creating an ArrayList
        aList.add("Erik"); //Adding object to ArrayList
        aList.add("Roland");
        aList.add("Dori");
        aList.add("Andi");
        //Traversing list through iterator
        for (String s : aList) {
            System.out.println(s);
        }
    }

}
