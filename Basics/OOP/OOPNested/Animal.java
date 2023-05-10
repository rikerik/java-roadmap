package OOPNested;

//static classes cant be top-level classes
public class Animal {
    //inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile");
        }
    }

    //static class
    static class Mammal {
        //static and non-static members of mammal
        public void displayInfo() {
            System.out.println("I am a mammal");
        }
    }
    //members of Animal
}
