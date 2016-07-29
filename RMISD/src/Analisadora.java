
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Analisadora extends Remote {
    boolean maiorMenorZero(int a) throws RemoteException;
    int verficaDigito(String cadeia) throws RemoteException;
}
