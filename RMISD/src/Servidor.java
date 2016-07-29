import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor implements Analisadora {

    @Override
    public boolean maiorMenorZero(int a) throws RemoteException {
        return a > 0;
    }

    @Override
    public int verficaDigito(String cadeia) throws RemoteException {
        return cadeia.length();
    }

    public static void main(String[] args) {
        Servidor s = new Servidor();
        try {
            
            Analisadora canal = (Analisadora) UnicastRemoteObject.exportObject(s,0);
            
            //Registry registro = LocateRegistry.createRegistry(1099);
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);
            
            registro.bind("metodosAnalisadores", canal);
            
            System.out.println("Servidor pronto!");
            
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

}
