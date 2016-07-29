/*2 - Altere o programa passado para que a thread tenha um construtor com parâmetros de 
 * identificação e prioridade da thread. Execute o mesmo programa alterando randomicamente a 
 * propriedade de prioridade das threads. Execute várias vezes e descreva uma conclusão em relação 
 * as execuções desse programa.
 */

package listasd;

import java.util.Random;

public class Exercicio2Teste {
	
	
	public static void main(String args[]){
		Random generator = new Random();
		System.out.println("Criando Threads");
		
		Thread thread1 = new Thread(new Exercicio2("tarefa 1", generator.nextInt(10)));
		Thread thread2 = new Thread(new Exercicio2("tarefa 2", generator.nextInt(10)));
		Thread thread3 = new Thread(new Exercicio2("tarefa 3", generator.nextInt(10)));
		Thread thread4 = new Thread(new Exercicio2("tarefa 4", generator.nextInt(10)));
		Thread thread5 = new Thread(new Exercicio2("tarefa 5", generator.nextInt(10)));
		Thread thread6 = new Thread(new Exercicio2("tarefa 6", generator.nextInt(10)));
		Thread thread7 = new Thread(new Exercicio2("tarefa 7", generator.nextInt(10)));
		Thread thread8 = new Thread(new Exercicio2("tarefa 8", generator.nextInt(10)));
		Thread thread9 = new Thread(new Exercicio2("tarefa 9", generator.nextInt(10)));
		Thread thread10 = new Thread(new Exercicio2("tarefa 10", generator.nextInt(10)));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();

	}
}
