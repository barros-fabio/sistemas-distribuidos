/*1 - Desenvolva uma thread que execute 100 vezes 
 * pausando randomicamente entre no intervalo de 1 e 2 segundos entre as execuções. 
 * Faça um programa que instancie 10 dessas threads.
 */

package listasd;

public class Exercicio1Teste {
	
	public static void main(String args[]){
		for(int i = 0; i<10; i++){
			new Exercicio1().start(); 
			System.out.println("Thread iniciada");
			System.out.println(" ");
		}
	}
}
