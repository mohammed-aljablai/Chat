package Client2;

/*
 * client.java
 *
 * Created on April 14, 2010, 5:38 PM
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

public class client {

    public static void main(String[] args) throws Exception {
                        System.out.println("Client is Running ");

        Socket s = new Socket("127.0.0.1", 6594);
        N2C n2s = new N2C(s);
        C2N c2n = new C2N(s);
       //while (true) {
        c2n.start(); // Send
        n2s.start(); // Recieve
       //}
       
    }
}
