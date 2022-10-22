package Banco;
import java.util.ArrayList;
public class Array {
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    ArrayList<Moeda> a = new ArrayList<Moeda>();
    Cofrinho add = new Cofrinho ();
    Moeda moeda1 = new Moeda ("euro", 5.00f);
    Moeda moeda2 = new Moeda("dolar", 3.00f);

    a.add(moeda2);
    a.add(moeda1);

    for(int i = 0; i< a.size();i++){
      System.out.println("Moeda : "+a.get(i).getNome());
    }
  }
}
