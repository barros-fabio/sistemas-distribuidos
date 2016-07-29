/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabio
 */
public class Exercicio4 implements Runnable{
    public Exercicio4(){
        
    }
    
    @Override
    public void run(){
        File arquivo = new File("teste.txt");
        
        if(arquivo.isDirectory()){
            String[] arquivos = arquivo.list();
            for(int i=0; i<arquivos.length; i++)
                System.out.println(arquivos[i]);
        }else{
            FileReader leitor;
            try {
                leitor = new FileReader(arquivo);
                BufferedReader in = new BufferedReader(leitor);
                String line;
                while((line = in.readLine())!= null){
                    System.out.println(line);
                    Thread.sleep(2000);
                }
                    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
}
