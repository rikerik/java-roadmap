package Lambda_Expressions;

@FunctionalInterface
interface myInterface {
    //abstract method
    String reverse(String string);
}

public class ExpressionWithParameters {
    public static void main(String[] args) {
        //declare reference to myInterface
        //Assign lambda expression to the interface
        myInterface ref = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        //call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Reverse test"));
    }
}
