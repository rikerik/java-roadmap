package Hash;

import java.util.HashMap;
import java.util.Map;

//stores the data in (Key, Value) pairs
public class HashM {
    public static void main(String[] args) {

        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap();

        //Adding elements to the map using put() method
        map.put("Erik", 11);
        map.put("Random Key", 55);
        map.put("Test", 100);

        //print the size and the content of the map
        System.out.println("The size of the map is: " + map.size());

        //printing the elements in object of map
        System.out.println(map);

        //checking if a key is present and if present, print value by
        //passing random element

        if (map.containsKey("Erik")) {

            //Mapping
            Integer a = map.get("Erik");

            //Printing value for corresponding key
            System.out.println("Value for key" + "\"Erik\" is " + a);


            //Accessing an element by key
            System.out.println(map.get("Erik"));

            //Iterate the map using foreach
            for (Map.Entry<String, Integer> e : map.entrySet())
                System.out.println("Key: " + e.getKey()
                        + " Value: " + e.getValue());

            //Removing an element
            map.remove("Erik");

            //Check if an element is present
            System.out.println(map.containsKey("Someone")); //false

            System.out.println(map.size());

        }
    }
}
