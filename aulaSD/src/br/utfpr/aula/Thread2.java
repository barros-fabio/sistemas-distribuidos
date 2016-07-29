package br.utfpr.aula;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println("i = "+i);
    }
    
}
