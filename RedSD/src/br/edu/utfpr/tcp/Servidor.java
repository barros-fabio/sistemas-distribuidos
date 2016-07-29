package br.edu.utfpr.tcp;

import java.io.*;
import java.net.*;

public class Servidor{

    public static ServerSocket servidor;
    public static Socket conexao;
    public static DataInputStream entrada;
    public static DataOutputStream saida;

    public static void main(String[] args) {

        try {

            // iniciar servico
            System.out.println("Servidor pronto!");
            servidor = new ServerSocket(4000);
            while (true) {
                conexao = servidor.accept();

                Servico srv = new Servico(conexao);
                srv.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
