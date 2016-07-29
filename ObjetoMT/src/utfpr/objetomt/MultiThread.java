/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.objetomt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author fabio
 */
public class MultiThread implements Runnable {
    Socket conexao;
    private static ObjectInputStream entrada;
    
    public MultiThread(Socket conexao){
        this.conexao = conexao;
    }
    
    @Override
    public void run() {
        while(true){
            try{

                entrada = new ObjectInputStream(conexao.getInputStream());
                
                Pessoa p = (Pessoa) entrada.readObject(); 
                if(p.getNome().equals("fim")){
                    conexao.close();
                }
                System.out.println("Nome: " + p.getNome() + " Idade: " + p.getIdade());

            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        
    }
    
}