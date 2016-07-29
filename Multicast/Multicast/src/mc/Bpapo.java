package mc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import javax.swing.JTextArea;

public class Bpapo extends Thread {
    
    private String usuario;
    private InetAddress endereco;
    private int porta;
    private JTextArea TaTexto;
    
    public Bpapo(InetAddress endereco, int porta, JTextArea TaTexto, String usuario){
        this.endereco = endereco;
        this.porta = porta;
        this.TaTexto = TaTexto;
        this.usuario = usuario;
    }
    
    public Bpapo(){
        
    }
    
    @Override
    public void run() {
        
        try {
            
            byte[] msg = new byte[128];
            
            MulticastSocket socket = new MulticastSocket(porta);
            
            socket.joinGroup(endereco);
            
            while(true) {
                
                DatagramPacket dgPacket = new DatagramPacket(msg, msg.length);
                
                socket.receive(dgPacket);
                String mensagem = new String(dgPacket.getData());
                
                TaTexto.append(mensagem +"\n");
                TaTexto.append("Digite a mensagem: \n");
                    
                
                msg = new byte[128];
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
}
