package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String [] args){

        //create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        //Map method
        //we gave the instructions in a function(x->x*x)
        //finally it collects the returned elements
        //and put them in a list
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        //create a list of strings
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        //Filter method
        //in the function we specify that if a string
        //starts with an 'S' then that string will be returned
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        //The sorted() function sorts the data
        // in abc order
        List<String> sort = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        //create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        //collect method returns a set
        //the collection won't duplicate elements
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        //forEach method
        //we use the forEach method on the returned
        // square elements, and we write them separately
        //into new lines
        number.stream().map(x->x*x).forEach(y-> System.out.println(y));

        //reduce method
        //we filtered the even numbers then added them together
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);

    }
}
