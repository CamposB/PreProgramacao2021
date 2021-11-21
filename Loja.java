import java.util.Random;
import javax.swing.*;
public class Loja{

   public static void main(String [] args){
      
      //Recebendo Valores da classe carro
      Random random = new Random();
      String nome = "Uno De Firma";
      int idCarro = random.nextInt(20);//Classe Random
      int ano = 1959;
      double valor = 20000.00;
      String cor = "Prata";
      boolean isNovo = true;
      String desconto = "";
      String desconto2 = "";
      
      //Recebendo valores da classe vendedor
      
      String nomeVendedor = "Carlos Jr.";
      String email = JOptionPane.showInputDialog("Digite seu email");
      String senha = JOptionPane.showInputDialog("Digite sua senha");
      int re = 176338;
      Boolean isAtivo = true;
      
      
      // Recebendo a venda
      int idVenda = random.nextInt(20);//Classe Random
      int idVendedor = re;
      int idCarroVenda = idCarro; 
      int valorVenda = 20000;
      String data = "21/11/2021";
      
      
      //Instancia do objeto
      Carro carro = new Carro();
      Carro carro2 = new Carro();
      Vendedor vendedor = new Vendedor();
      Venda venda = new Venda();
      
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
      
      vendedor.setNome(nomeVendedor);
      vendedor.setRe(re);
      vendedor.setEmail(email);
      vendedor.setSenha(senha);
      vendedor.setIsAtivo(isAtivo);
      
      venda.setIdVenda(idVenda);
      venda.setIdVendedor(idVendedor);
      venda.setIdCarro(idCarroVenda);
      venda.setValor(valorVenda);
      venda.setData(data);
    
      if(!carro.getNovo()){
         desconto = " Pois recebeu 3 mil de desconto";
      }else if(valor >= 50000){
         desconto = " Pois recebeu 2 mil de desconto";
      
      }
      
      System.out.println(vendedor.getEmail() + vendedor.getSenha());
      
      if((vendedor.getEmail().equals("carlosjr@gmail.com")) && (vendedor.getSenha().equals("12345"))){
         System.out.println("O preço do " + carro.getNome() + " é " +carro.getValor() + desconto + " Foi vendido pelo vendedor: " + vendedor.getNome());
         System.out.print("O Carro " + carro2.getNome() + " foi vendido por " +venda.getValor() + " pelo vendedor: " + vendedor.getNome() + "No dia: " + venda.getData() + " ID de compra: " + venda.getIdVenda());
      
      }else{
         System.out.println("Esse vendedor não existe");
      
      }
      
      

   
   }

}