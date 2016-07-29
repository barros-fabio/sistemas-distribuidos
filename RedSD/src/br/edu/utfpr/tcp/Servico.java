/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.tcp;

import static br.edu.utfpr.tcp.Servidor.conexao;
import static br.edu.utfpr.tcp.Servidor.entrada;
import static br.edu.utfpr.tcp.Servidor.saida;
import static br.edu.utfpr.tcp.Servidor.servidor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author fabio
 */
public class Servico extends Thread{
    public static ServerSocket servidor;
    public static Socket conexao;
    public static DataInputStream entrada;
    public static DataOutputStream saida;
    
    public Servico(Socket conexao){
        this.conexao = conexao;
    }
    
    @Override 
    public void run(){
        try{
            // esperar requisicoes
            entrada = new DataInputStream(conexao.getInputStream());
            saida = new DataOutputStream(conexao.getOutputStream());

            int numero = entrada.readInt();


            String resultado;
            if (numero > 0) {
                resultado = "Maior que zero";
            } else {
                resultado = "Menor ou igual a zero";
            }

            // responder requisicoes
            saida.writeUTF(resultado);

            // fechar conexao
            conexao.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }   
    
}
