/*3 - Faça um programa para iniciar, pausar e finalizar uma thread (texto e gráfico).
 * 
 */
package listasd;

import javax.swing.JTextArea;

/**
 *
 * @author fabio
 */
public class Exercicio3Runnable implements Runnable{
        JTextArea textArea;
        
	public Exercicio3Runnable(JTextArea textArea){
            this.textArea = textArea;
	}
        
        
	@Override
	public void run() {
            for(int i = 0;i<300; i++){
                this.textArea.append(" i= "+i+"\n");
            }
		
	}
	
}