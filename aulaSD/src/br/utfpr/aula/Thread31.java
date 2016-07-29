package br.utfpr.aula;

import javax.swing.JTextArea;

public class Thread31 implements Runnable {

    JTextArea jText;

    public Thread31() {

    }
    
    public Thread31(JTextArea textArea) {
            this.jText=textArea;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            this.jText.append("i = "+i+"\n");
        }
    }

}
