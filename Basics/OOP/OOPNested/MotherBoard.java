package OOPNested;

public class MotherBoard {

    //static nested class
    static class USB {
        int usb2 = 2;
        int usb3 = 1;

        int getTotalUSbPorts() {
            return usb2 + usb3;
        }
    }
}
