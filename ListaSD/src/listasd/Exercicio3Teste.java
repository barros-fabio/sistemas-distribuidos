package listasd;

import java.util.Scanner;

public class Exercicio3Teste {
		
    public static void main(String[] args) throws InterruptedException{
        int opcao=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("------Menu Principal------");
        System.out.println("1- Iniciar Thread");
        System.out.println("2- Encerrar Programa");
        opcao = ler.nextInt();
        switch(opcao){
            case 1 :
                System.out.println("Iniciando a Thread. Para pausar a Thread pressione 1. Para finalizá-la pressione 2.");	
                Exercicio3 thread1 = new Exercicio3();
                thread1.start();

                opcao = ler.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Execução da Thread pausada");
                        thread1.suspend();
                        opcao = ler.nextInt();
                        break;
                    case 2:
                        System.out.println("Execução da Thread parada");
                        thread1.stop();
                        break;
                    default:
                        System.out.println("Programa encerrado");
                        break;
                }
                break;
            case 2:
                System.out.println("Sair do Programa");
                break;
            default:
                System.out.println("Programa encerrado");
                break;

        }
    }
}
