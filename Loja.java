import java.util.Random;
public class Loja{

   public static void main(String [] args){
      
      Random random = new Random();
      String nome = "Uno De Firma";
      int IdCarro = random.nextInt(20);
      int ano = 1959;
      double valor = 20000.00;
      String cor = "Prata";
      boolean isNovo = true;
      Carro carro = new Carro();
      
      carro.setNome(nome);
      carro.setAno(ano);
      System.out.print(carro.getAno());
   
   }

}