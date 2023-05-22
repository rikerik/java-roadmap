package Type_Casting;

//The process of converting the value of one data type (int, float, double, etc.)
//to another data type is known as typecasting.
//In Java, there are 13 types of type conversion
//But we will only focus on the major 2 types:
//1. Widening Type Casting
//2. Narrowing Type Casting

public class TypeCasting {
    public static void main(String[] args) {
        //In Widening Type Casting, Java automatically converts one data type to another data type.

        int num = 10;
        System.out.println("int value: " + num);

        //convert into double type
        //Here, the Java first converts the int type data into the double type.
        //And then assign it to the double variable.
        double data = num;
        System.out.println("double value: " + data);

        /*
        In the case of Widening Type Casting, the lower data type (having smaller size)
        is converted into the higher data type (having larger size).
        Hence there is no loss in data. This is why this type of conversion happens automatically.
        This is also known as Implicit Type Casting.
         */

        //In Narrowing Type Casting, we manually convert one data
        //type into another using the parenthesis.

        double doubleNum = 10.99;
        System.out.println("double value: " + doubleNum);

        //convert into int type
        int intData = (int) doubleNum;
        System.out.println("int value: " + intData);

        /*
        Here, the int keyword inside the parenthesis indicates that the num variable is
        converted into the int type.In the case of Narrowing Type Casting, the higher data types
        (having larger size) are converted into lower data types (having smaller size).
        Hence there is the loss of data. This is why this type of conversion does not happen automatically.
        This is also known as Explicit Type Casting.
         */

        //type conversion from int to String
        int intNum = 10;
        System.out.println("int value: "+intNum);

        //converts int to string
        //Here, we have used the valueOf() method of the Java String class
        //to convert the int type variable into a string.
        String stringData = String.valueOf(intNum);
        System.out.println("String value: "+stringData);

        //Type conversion from String to int
        String stringNum = "10";
        System.out.println("string value: "+stringNum);

        //convert string variable to int
        int number = Integer.parseInt(stringNum);
        System.out.println("int value: "+number);

        //Here, we have used the parseInt() method of the Java Integer class to convert
        //a string type variable into an int variable
        //If the string variable cannot be converted into the integer
        //variable then an exception named NumberFormatException occurs.
    }

}
