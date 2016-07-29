package br.edu.utfpr.tcp;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Cliente {
    
    public static Socket conexao;
    public static DataInputStream entrada;
    public static DataOutputStream saida;
    
    public static void main(String[] args) {
        int dados = 1;
        try {
            while(true && dados !=0){
                //  estabelecer conexao
                conexao=new Socket("localhost",4000);
                entrada = new DataInputStream(conexao.getInputStream());
                saida = new DataOutputStream(conexao.getOutputStream());            

                // enviar dados
                dados = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
                saida.writeInt(dados);

                // receber dados
                String resultado;
                resultado = entrada.readUTF();            

                // exibir dados
                System.out.println("Informação do servidor : "+resultado);

                // fechar conexao
                conexao.close();
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
