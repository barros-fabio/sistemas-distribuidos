package mc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Bpapo extends Thread {
    
    //private static String usuario;
    private static InetAddress endereco;
    private static int porta;
    
    
    public Bpapo(InetAddress endereco, int porta){
        this.endereco = endereco;
        this.porta = porta;
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
                
//                if(!mensagem.contains(usuario)) {
//                    System.out.println("\n" + mensagem + "\n");
//                    System.out.print("Digite a mensagem: ");
//                }
                
                msg = new byte[128];
                
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
}
