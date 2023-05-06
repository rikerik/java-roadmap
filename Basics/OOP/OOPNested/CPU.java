package OOPNested;

public class CPU {
    double price;

    //Nested class
    class Processor {


        //nested class members
        double cores;
        String manufacturers;

        double getCache() {
            return 4.3;
        }
    }

    //Nested & protected class
    protected class RAM {

        //protected nest class members
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}
