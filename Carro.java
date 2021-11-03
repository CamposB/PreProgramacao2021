public class Carro{


   //Atributos//
   private String nome;
   private int IdCarro;
   private int ano;
   private double valor;
   private String cor;
   private boolean isNovo;
   

   //Construtor   
   public Carro(String nome, int ano){
      this.nome = nome;
      this.ano = ano;
   }


   //Set's
   public void setNome(String nome){
      this.nome = nome;
   
   }
   
   public void setIdCarro(int IdCarro){
   
      this.IdCarro = IdCarro;
   }
   
   public void setAno(int ano){
      this.ano = ano;
   
   }
   
   public void setValor(double valor){
      this.valor = valor;
   }
   
   public void setCor(String cor){
   
      this.cor = cor; 

   }
   
   public void setNovo(boolean isNovo){
   
      this.isNovo = isNovo;
   
   }
   
   //Get's
   
   public String getNome(){
      return nome;
   }
   public int getIdCarro(){
      return IdCarro;
   }
   public int getAno(){
   
      return ano;
   }
   
   
   public double getValor(){
   
      return valor;
   }
   
   public String getCor(){
   
      return cor;
   }
   
   public boolean isNovo(){
   
      return isNovo;
   
   }
}

