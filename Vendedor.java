public class Vendedor{
  //Atributos//
  private String nome;
  private int re;
  private String email;
  private String senha;
  private boolean isAtivo;

  //Set's
  
  public void setNome(String nome){
  
   this.nome = nome;
  
  }

   public void setRe(int re){
      
      this.re = re;
   
   }
   
   public void setEmail(String email){
      
      this.email = email;
   
   }
   
   public void setSenha(String senha){
      
      this.senha = senha;
      
   }
   
   public void setIsAtivo(boolean isAtivo){
   
      this.isAtivo = isAtivo;
      
   }
   
   //Get's
   
   public String getNome(){
      return nome;
   }
   
   public int getRe(){
      return re;   
   }
   
   public String getEmail(){
      return email;
   }
   
   public String getSenha(){
      return senha;    
   }
    
   public boolean isAtivo(){
      return isAtivo;              
   }
}