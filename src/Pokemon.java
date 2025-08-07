public class Pokemon {

    private String nome;
    private double peso;
    private double altura;
    private int numero;
    private String tipo;

public Pokemon (String nome, double peso, double altura, int numero, String tipo){ 

    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
    this.numero = numero;
    this.tipo = tipo;

   }    

   public String getNome() {
    return nome;
   }

   public double getPeso() {
    return peso;
   }

   public double getAltura() {
    return altura;
   }

   public int getNumero() {
    return numero;
   }

   public String getTipo() {
    return tipo;
   }
}