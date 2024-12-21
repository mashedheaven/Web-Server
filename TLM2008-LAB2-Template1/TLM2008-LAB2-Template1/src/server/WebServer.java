/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.logging.*;

/**
 *
 * @author cristalngo
 */
public class WebServer {

    public static void main(String args[]) {
        try {
            WebServer server = new WebServer();
            server.runServer();
        } catch (IOException ex) {
            Logger.getLogger(WebServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void runServer() throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true) {
            final Socket client = server.accept();
            // 1. Read HTTP request from the client socket           
            // 2. Prepare an HTTP response 
            // 3. Send HTTP response to the client 
            // 4. Close the socket
        }

    }
    
    private void readHttpRequest(Socket clientSocket) throws IOException{
        InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream()); 
        BufferedReader reader = new BufferedReader(isr); 
        String line = reader.readLine(); 
        while (!line.isEmpty()) { 
            //TODO: Enter your code here.
        }
    }
    
    private void prepareAndSendResponse(Socket socket) throws IOException{
       //TODO: Enter your code here.
    }

}
