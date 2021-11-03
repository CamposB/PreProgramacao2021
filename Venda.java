public class Venda{

private int IdVenda;
private int IdVendedor;
private int IdCarro;
private String data;
private int valor; 

//Setters

   public void setIdVenda(int idVenda){
      this.IdVenda = idVenda;
   }
   
   public void setIdVendedor(int re){
   
      idVendedor = re;
   
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

   public int getIdVanda(){
      return IdVenda;
   }
   
   public int getIdVendedor(){
      return IdVendedor;
   }
   
   public int getIdCarro(){
    return IdCarro:
   }
   
   public String getData(){
    return data;
   }
   
   public int getValor(){
     return valor;
   }


}