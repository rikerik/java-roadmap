package Lambda_Expressions;

//Generic interface
@FunctionalInterface
interface GenericInterface<T> {
    //generic method
    T function(T t);
}

public class GenericFunctionalInterface {
    public static void main(String[] args) {
        //declare a reference to GenericInterface
        //the GenericInterface operates on String data
        //assign a lambda expression to it
        GenericInterface<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Test reversed: " + reverse.function("Test reversed"));

        //declare another reference to GenericInterface
        //the GenericInterface operates on Integer data
        //assign a lambda expression to it
        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i < n; i++) {
                result = i * result;
            }

            return result;
        };
        System.out.println("Factorial of 5 is: " +factorial.function(5));
    }
}
