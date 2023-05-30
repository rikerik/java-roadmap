package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
/*
To connect to another machine we need a socket connection.
A socket connection means the two machines have information about
each other’s network location (IP Address) and TCP port.
The java.net.Socket class represents a Socket.

To communicate over a socket connection, streams are used to both input and output the data.

The socket connection is closed explicitly once the message to the server is sent.
In the program, the Client keeps reading input from a user and sends it to the server until “Over” is typed.
 */

class Client {
    //initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    //constructor to put ip address an port
    public Client(String address, int port) {
        //establish a connection
        try {
            socket = new Socket(address, port);
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
    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
