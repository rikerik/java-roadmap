package OOPNested;


public class NestedOOP {
    public static void main(String[] args) {

        // Create object of outer class OOPNested.CPU
        CPU cpu = new CPU();

        //Create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        //Create an object of inner class RAM using outer class
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor cache: " + processor.getCache());
        System.out.println("RAM clockspeed: " + ram.getClockSpeed());


        //CAR - ACCESING MEMBERS

        //Create an object of the oter class Car
        Car car1 = new Car("Mazda", "8WD");

        //Create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine type for 8 WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2Engine = car2.new Engine();
        c2Engine.setEngine();
        System.out.println("Engine type for 3W= " + c2Engine.getEngineType());

        //STATIC INNER CLASS

        //Create an object of the static nested class
        //using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total ports = " + usb.getTotalUSbPorts());
    }
}
