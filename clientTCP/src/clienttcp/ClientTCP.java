package clienttcp;

import java.net.*;
import java.util.Date;
import java.io.*;

public class ClientTCP {

    public static void main(String[] args) {

        Socket con;
        String ipServer = "127.0.0.1";
        int portaServer = 2222;

        DataInputStream in;

        try {
            con = new Socket(ipServer, portaServer);
            System.out.println("Connessione con il server stabilita");
        } catch(IOException e){
        System.out.println("Errore: " + e.getMessage());
        }

    }
}