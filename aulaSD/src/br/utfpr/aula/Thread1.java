package br.utfpr.aula;

public class Thread1 extends Thread{   
    
    
    public void run(){
        for(int i=0;i<=10;i++)
            System.out.println(this.getId()+" i = "+i);
    }
    
    public static void main(String[] args) {
          new Thread1().start();
          new Thread1().start();
          new Thread1().start();
          new Thread1().start();
          new Thread1().start();
          new Thread1().start();
          new Thread1().start();
          
    }
    
}
