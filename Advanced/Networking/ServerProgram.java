package Networking;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    Server application makes a ServerSocket on a specific port which is 5000.
    This starts our Server listening for client requests coming in for port 5000.
    Then Server makes a new Socket to communicate with the client.

    The accept() method blocks(just sits there) until a client connects to the server.
    Then we take input from the socket using getInputStream() method.
    Our Server keeps receiving messages until the Client sends “Over”.
    After we’re done we close the connection by closing the socket and the input stream.
 */

class Server {
    //initialize socket az input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    //constructor with port
    public Server(int port) {
        //start server and waits for connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client...");

            socket = server.accept();
            System.out.println("Client accepted");

            //takes input from the client socket
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            String line = "";

            //reads message from client until "Over" is sent
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                } catch (IOException ioe) {
                    System.out.println(ioe);
                }
            }
            System.out.println("Closing connection");

            //close connection
            socket.close();
            in.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}

public class ServerProgram {
    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
