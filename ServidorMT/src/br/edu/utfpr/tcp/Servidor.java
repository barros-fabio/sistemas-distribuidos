package br.edu.utfpr.tcp;

import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Servidor extends Thread {

    private Socket socket;
    private Random randomico;

    public Servidor(Socket conexao) {
        this.socket = conexao;
    }

    public void run() {
        randomico=new Random();
        try {
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
            String resultado = entrada.readUTF();
            while (!resultado.equals("fim")) {                
                System.out.println("Enviando na porta " + socket.getPort()+" do cliente "+resultado);
                saida.writeUTF(resultado.toUpperCase());  
                Thread.sleep(100+randomico.nextInt(500));
                resultado = entrada.readUTF();
                System.out.println("Resultado "+resultado);
            }
            System.out.println("Clience se desconectou...");
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("Aguardando conexões...");
            while (true) {
                Socket conexao = servidor.accept();
                Servidor sThread = new Servidor(conexao);
                System.out.println("Clience se conectou...");
                sThread.start();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
