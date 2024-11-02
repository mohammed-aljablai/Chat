package Server;

/*
 * serveur.java
 *
 * Created on April 15, 2010, 2:39 AM
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

public class serveur {

    /**
     * Creates a new instance of 
   * @param args
   * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
                System.out.println("Server is Running ");

        ServerSocket s1 = new ServerSocket(1000);
        ServerSocket s2 = new ServerSocket(6594);
        Socket client1 =s1.accept();
        Socket client2 =s2.accept();
        C2toC1 c221 = new C2toC1(client2, client1);
        C1toC2 c122 = new C1toC2(client2, client1);
        c221.start();
        c122.start();
        
    }

}
