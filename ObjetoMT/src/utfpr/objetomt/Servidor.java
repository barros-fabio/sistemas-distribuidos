/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.objetomt;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author fabio
 */
public class Servidor {
    private static Socket socket;
    private static ServerSocket server;
    
    private static ObjectInputStream entrada;
    
    public static void main(String[] args) {
        System.out.println("Iniciando servidor...");
        try {
            
            server = new ServerSocket(50000);
            
            socket = server.accept();
            System.out.println("Conexão aceita!");
            new Thread(new MultiThread(socket)).start();
         
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }

    
    
}
