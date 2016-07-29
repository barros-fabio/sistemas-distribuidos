
/*3 - Faça um programa para iniciar, pausar e finalizar uma thread (texto e gráfico).
 * 
 */
package listasd;


public class Exercicio3 extends Thread{

	public Exercicio3(){
           
	}

	@Override
	public void run() {
            for(int i = 0;i<300; i++){
                try{;
                
                    Thread.sleep(2000);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("i= "+i);
            }
		
	}
	
}
