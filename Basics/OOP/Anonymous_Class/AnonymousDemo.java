package Anonymous_Class;

//A nested class that doesn't have any name is known as an anonymous class.
//An anonymous class must be defined inside another class

//it could be an interface:
//interface Polygon { public void display(); }

class Polygon {
    public void display() {
        System.out.println("Inside the polygon class");
    }
}

public class AnonymousDemo {
    public void createClass() {

        //creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {

            //this method is overwritten
            public void display() {
                System.out.println("Inside an anonymous class");
            }
        };
        p1.display();
    }
}
