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

    }
}
