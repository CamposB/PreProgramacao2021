public class Carro{


   //Atributos//
   private String nome;
   private int IdCarro;
   private int ano;
   private double valor;
   private String cor;
   private boolean isNovo;
   

   //Construtor   
   
   public Carro(){}
  
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
      
      if(ano <= 1960){
         this.ano = 0;
      }else{
         this.ano = ano;
      
      }
      
      
   
   }
   
   public void setValor(double valor){
      if(valor >= 50000){
         valor = valor - 2000;
         this.valor = valor;
      }else{
        this.valor = valor;
      }
   }
   
   public void setCor(String cor){
   
      this.cor = cor; 

   }
   
   public void setNovo(boolean isNovo){
      if(isNovo){
         this.isNovo = isNovo;
      }else{
         this.isNovo = isNovo;
         valor = valor - 3000;
      }
      
   
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
   
   public boolean getNovo(){
   
      return isNovo;
   
   }
}

