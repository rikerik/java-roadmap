package How_JVM_Works;

/*
Classloader is a subsystem of JVM which is used to load class files.
Whenever we run the java program, it is loaded first by the classloader.
There are three built-in classloaders in Java.

Bootstrap ClassLoader: This is the first classloader which is the super class
of Extension classloader. It loads the rt.jar file which contains all class
files of Java Standard Edition like java.lang package classes, java.net package classes,
java.util package classes, java.io package classes, java.sql package classes etc.
 */

public class ClassLoaderExample {
    public static void main(String[] args) {
        //print the classloader name of current class
        // Application/System classloader will load this class
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());

        //if we print the classloader name of String,
        // it will print null because it is an inbuilt
        //class which is found in rt.jar, so its loaded
        //by Bootstrap classloader
        System.out.println(String.class.getClassLoader());
    }

}
