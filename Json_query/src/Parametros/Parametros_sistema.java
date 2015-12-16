package Parametros;
public class Parametros_sistema {

   private String nom_dir;

  public  Parametros_sistema(){
   nom_dir="Parametros_table_db";
  }
   
   public void setNom_dir(String dir){
     nom_dir=dir;
   }
    
   public String getNom_dir(){
    return nom_dir;   
   }
    
}
