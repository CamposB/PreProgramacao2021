public class Venda{

private int idVenda;
private int idVendedor;
private int IdCarro;
private String data;
private int valor; 

//Setters

   public void setIdVenda(int idVenda){
      this.idVenda = idVenda;
   }
   
   public void setIdVendedor(int idVendedor){
   
      this.idVendedor = idVendedor;
   
   }
   
   public void setIdCarro(int IdCarro){
   
      this.IdCarro = IdCarro;
   
   }
   
   public void setData(String data){
   
      this.data = data;
   }
   
   public void setValor(int valor){
   
      this.valor = valor;
   
   }

 

//getters

   public int getIdVenda(){
      return idVenda;
   }
   
   public int getIdVendedor(){
      return idVendedor;
   }
   
   public int getIdCarro(){
    return IdCarro;
   }
   
   public String getData(){
    return data;
   }
   
   public int getValor(){
     return valor;
   }


}