
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    public static void main(String[] args) {
        try{
            Registry registro=LocateRegistry.getRegistry("Localhost", 1099);
            Analisadora canal=(Analisadora) registro.lookup("metodosAnalisadores");
            
            System.out.println("O numero -1 é maior que 0 : "+canal.maiorMenorZero(-1));
            System.out.println("O digito verificador é : "+canal.verficaDigito("123456789"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
