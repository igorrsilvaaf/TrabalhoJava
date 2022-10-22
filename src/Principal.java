import java.util.ArrayList;

import Banco.Cofrinho;
import Banco.Moeda;
public class Principal{
    public static void main(String[] args){
        // TODO Auto-generated method stub

        ArrayList<Moeda> pilhaMoedas = new ArrayList<Moeda>();
        Cofrinho cofre = new Cofrinho();
        Moeda moeda1 = new Moeda("euro", 5.00f);
        Moeda moeda2 = new Moeda("dolar", 3.00f);
    
        pilhaMoedas.add(moeda1);
        pilhaMoedas.add(moeda2);
    
        cofre.recebeMoedas(pilhaMoedas);
    }

}
