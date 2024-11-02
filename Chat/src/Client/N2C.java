package Client;

/*
 * N2C.java
 *
 * Created on April 14, 2010, 6:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
/**
 *
 * @author STUDENT
 */
import java.io.*;
import java.net.*;

public class N2C extends Thread{

    Socket s;

    /**
     * Creates a new instance of N2S
     */
    public N2C(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            BufferedReader InFromUser = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg;
            while (true) {
                msg = InFromUser.readLine();
                System.out.println("Client2: " + msg);
           }
        } catch (Exception e) {
        }

    }
}
