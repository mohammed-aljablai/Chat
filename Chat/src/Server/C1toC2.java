package Server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLServerSocket;

/*
 * This projects Has done By Mohammed Aljablai
 * FileName: is a
*/
public class C1toC2 extends Thread{
  Socket s2;
  Socket s1;
  String msg;
  
  public C1toC2(Socket s2, Socket s1) {
    this.s2 = s2;
    this.s1 = s1;
  }

  @Override
  public void run() {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
      DataOutputStream out = new DataOutputStream(s2.getOutputStream());
      while (true) {
        msg = in.readLine();
        out.writeBytes(msg+'\n');
      }
    } catch (IOException ex) {
    }
  }
   
  
}
