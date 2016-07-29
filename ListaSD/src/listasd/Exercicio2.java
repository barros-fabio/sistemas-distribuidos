/*2 - Altere o programa passado para que a thread tenha um construtor com parâmetros de 
 * identificação e prioridade da thread. Execute o mesmo programa alterando randomicamente a 
 * propriedade de prioridade das threads. Execute várias vezes e descreva uma conclusão em relação 
 * as execuções desse programa.
 */


package listasd;

import java.util.Random;

public class Exercicio2 implements Runnable {
	private int tempo;
	private String nomeThread;
	private int prioridade;
	private Random generator = new Random();
	
	public Exercicio2(String nomeThread, int prioridade){
		this.nomeThread = nomeThread;
		this.prioridade = prioridade;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10;i++){
			try{
				do{
					tempo = generator.nextInt(2000);
				}while(tempo<1000 || tempo>2000);
			
				System.out.println("Thread: "+nomeThread+" pausando por "+tempo+ " milisegundos, a sua prioridade é: "+prioridade);
				Thread.sleep(tempo);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("Thread: "+nomeThread+" parou de dormir");
	
		}
	}
	
	
}
