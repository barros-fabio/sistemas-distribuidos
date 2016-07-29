/*1 - Desenvolva uma thread que execute 100 vezes 
 * pausando randomicamente entre no intervalo de 1 e 2 segundos entre as execuções. 
 * Faça um programa que instancie 10 dessas threads.
 */

package listasd;
import java.util.Random;


public class Exercicio1 extends Thread {
	private int tempo;
	private static Random generator = new Random();

	@Override
	public void run() {
		for(int i = 0; i<100; i++){
			try{
				
				do{
					tempo = generator.nextInt(2000);
				}while(tempo<1000 || tempo >2000);
				System.out.println("Thread: "+this.getId()+" pausando por "+tempo+ " milisegundos ");
				Thread.sleep(tempo);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("Thread: "+this.getId()+" waking up");
		}
	}

}
