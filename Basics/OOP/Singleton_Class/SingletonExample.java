package Singleton_Class;

//Singleton is a design pattern that ensures
//that a class can only have one object.

public class SingletonExample {

    //private field that refers to the object
    private static SingletonExample singletonObject; // a reference to the object of the class.

    private SingletonExample() { // a private constructor that restricts creating objects outside of the class.
        //constructor of the SingletonExample class
    }


    //this method returns the reference
    // to the only object of the class.
    // Since the method static, it can
    // be accessed using the class name.
    public static SingletonExample getInstance() {
        //write code that allows us to create only one object
        //access the object as per our need
        return null;
    }
}
