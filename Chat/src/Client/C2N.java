package Client;

/*
 * C2N.java
 *
 * Created on April 14, 2010, 5:59 PM
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

public class C2N extends Thread{

    Socket s;

    /**
     * Creates a new instance of U2N
     */
    public C2N(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            BufferedReader InFromUser = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream OutToNetwork = new DataOutputStream(s.getOutputStream());
            String msg;
            while (true) {
                msg = InFromUser.readLine();
                OutToNetwork.writeBytes(msg + "\n");
            }
        } catch (Exception e) {
        }

    }
}
