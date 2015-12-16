package Conexion_DB;
import Interfaces_db.IConexion_db;
import Parametros.Parametos_db;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion_db_imple implements IConexion_db {

   
    @Override
    public Connection conexion() {
        try {
            
            java.sql.Connection cn=null;
            Parametos_db ob_db=new Parametos_db();
            Class.forName(ob_db.getClassNameDB());
            cn=java.sql.DriverManager.getConnection(ob_db.getServidor(),ob_db.getusuarioDB(),ob_db.getPasswordDB());
            if(cn==null){
            System.out.print("No se logro la conexion");
            }
            else{
          //  System.out.print("Conexion es todo un exito");
           // System.out.print("HOla conexion"+cn);
            return cn;
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_db_imple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_db_imple.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
 
    
    
}
