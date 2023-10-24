package servertcp;

import java.net.*;
import java.util.Date;
import java.io.*;

public class ServerTCP {

    public static void main(String[] args) {
        
        ServerSocket sv;
        Socket con;
        int porta = 2222;

        DataOutputStream out;

        try {
            sv = new ServerSocket(porta);
            while (true) {
              System.out.println("In attesa di connessioni...");
              con = sv.accept();
              System.out.println("Connessione stabilita");
              
              Date oggi = new Date();
              out = new DataOutputStream(con.getOutputStream());
              String dataOggi = oggi.toString();
              out.writeBytes(dataOggi);
              con.close();
              System.out.println("Connessione chiusa");
            }
        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

}