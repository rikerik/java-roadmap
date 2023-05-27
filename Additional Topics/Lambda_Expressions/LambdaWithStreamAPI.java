package Lambda_Expressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithStreamAPI {

    //Create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    //preparing our data
    public static List getPlaces() {

        //add places and country to the list
        places.add("Hungary, Pécs");
        places.add("Hungary, Budapest");
        places.add("France, Paris");
        places.add("USA, New York");
        places.add("Russia, Moscow");

        return places;
    }

    public static void main(String[] args) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Hungary:");

        //Filter places from Hungary
        myPlaces.stream()
                .filter((h) -> h.startsWith("Hungary"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //we could use this form but the one above is shorter .map((h) -> h.toUpperCase())

    }
}
