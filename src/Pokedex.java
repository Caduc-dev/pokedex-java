import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex { 
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        ArrayList<Pokemon> Pokedex = new ArrayList<>();

        Pokemon pikachu = new Pokemon("Pikachu", 6.0, 40, 25, "Eletrico");
           Pokedex.add(pikachu);

        Pokemon Bulbasaur = new Pokemon("Bulbasaur", 6.9, 70, 01, "Planta, Toxico");
           Pokedex.add(Bulbasaur);
        
        Pokemon Charmander = new Pokemon("Charmander", 8.5, 60, 04, "Fogo");
           Pokedex.add(Charmander);
        
        Pokemon Squirtle = new Pokemon("Squirtle", 9.0, 50, 07, "Agua");
           Pokedex.add(Squirtle);
           System.out.println("----Pokedex----");

           boolean continuar = true;

           while(continuar){
           System.out.print("Digite o nome: ");
              String nome = scanner.next();

              boolean encontrado = false;

              for (Pokemon p : Pokedex) {
                if (p.getNome().equalsIgnoreCase(nome)){
                   System.out.println("Nome: " + p.getNome().toUpperCase());
                   System.out.println("Numero: #" + p.getNumero());
                   System.out.println("Tipo: " + p.getTipo().toUpperCase());
                   System.out.println("Altura: " + p.getAltura() + "cm");
                   System.out.println("peso: " + p.getPeso() + "Kg");
                   encontrado = true;
                break;
                }
              }
                if (!encontrado) { 
                   System.out.println("Pokemon não encontrado");
                }
                
            System.out.print("Deseja encontrar outro pokemon (s/n): ");
               String resposta = scanner.next().toLowerCase();      

               if (resposta.equals("n")) {
                System.out.println("Encerrando Pokedex...");
                break;
               }
            }

            scanner.close();
            
    }
}

