package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class Client {
    //initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    //constructor to put ip address an port
    public Client(String addres, int port) {
        //establish a connection
        try {
            socket = new Socket(addres, port);
            System.out.println("Connected");

            //takes input from terminal
            input = new DataInputStream(System.in);

            //sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException uhe) {
            System.out.println(uhe);
            return;
        } catch (IOException ioe) {
            System.out.println(ioe);
            return;
        }

        //string to read message from input
        String line = "";

        //keep reading until "Over" is input
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException ioe) {
                System.out.println(ioe);
                return;
            }
        }
    }
}

public class ClientProgram {
    Client client = new Client("127.0.0.1", 5000);
}
