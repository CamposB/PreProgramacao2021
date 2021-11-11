import java.util.Random;
public class Loja{

   public static void main(String [] args){
      
      //Recebdno Valores da classe carro
      Random random = new Random();
      String nome = "Uno De Firma";
      int idCarro = random.nextInt(20);//Classe Random
      int ano = 1959;
      double valor = 20000.00;
      String cor = "Prata";
      boolean isNovo = true;
      String desconto = "";
      String desconto2 = "";
      //Instancia do objeto
      Carro carro = new Carro();
      Carro carro2 = new Carro();
      
      //Atribuição com metodos modificadores
      carro.setNome(nome);
      carro.setAno(ano);
      carro.setIdCarro(idCarro);
      carro.setValor(valor);
      carro.setCor(cor); 
      carro.setNovo(false); 
      
      carro2.setNome("Mercedes AMG");
      carro2.setValor(200000.00);
      carro2.setNovo(true);
      
      if(!carro.getNovo()){
         desconto = " Pois recebeu 3 mil de desconto";
      }else if(valor >= 50000){
         desconto = " Pois recebeu 2 mil de desconto";
      
      }
      System.out.println("O preço do " + carro.getNome() + " é " +carro.getValor() + desconto);
      System.out.print("O preço do " + carro2.getNome() + " é " +carro2.getValor() + desconto2);
   
   }

}