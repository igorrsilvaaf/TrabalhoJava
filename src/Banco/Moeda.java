package Banco;

public class Moeda implements Interface {
  private String nome;
  private float valor;

  //constructor
  public Moeda(String nome, float valor) {
    this.nome = nome;
    this.valor = valor;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public float getValor(){
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  @Override
  public void getnome(){
    // TODO Auto-generated method stub 
  }

  @Override
  public void getvalor(){
    // TODO Auto-generated method stub
  }

}
