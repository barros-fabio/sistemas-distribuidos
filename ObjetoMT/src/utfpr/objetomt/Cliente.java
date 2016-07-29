/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.objetomt;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class Cliente {
    
    private static Socket socket;
    
    private static ObjectOutputStream saida;
    private static ObjectInputStream entrada;
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        boolean continuar = true;
        try {
            
            socket = new Socket("127.0.0.1", 50000);
            
            saida = new ObjectOutputStream(socket.getOutputStream());
            saida.flush();
            
            System.out.println("Estou no cliente");
            
            do{
                String nome = JOptionPane.showInputDialog("Digite o nome da pessoa - Digite fim para finalizar");
                if(nome.equals("fim")){
                    break;
                }
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa"));
                //pessoa.setNome(nome);
                //pessoa.setIdade(idade);
                saida.writeObject(new Pessoa(nome,idade));
                
            }while(true);
            
            System.out.println("Terminei a execução do cliente");
                     
            socket.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
