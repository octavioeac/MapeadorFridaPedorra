package Mapeo_Columnas;
import Conexion_DB.Conexion_db_imple;
import Interfaces_db.InterfaceColumnas;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Columnas_Mapeadas_Imp implements InterfaceColumnas {
    
     
    public String[] Mapeo_columnas(String tabla) {
         Conexion_db_imple obj_conex=new Conexion_db_imple();
         Connection mapeo = obj_conex.conexion();
         DatabaseMetaData md;
         int contador=0;
         int rowCount=0;
        try {
            md = mapeo.getMetaData();
         //   String tableName="construccion_fo";
            ResultSet rs = md.getColumns(null, null, tabla, "%"); 
                if(rs.last())
                {  //Contador del RECORDSET rs
                 rowCount = rs.getRow(); 
                rs.beforeFirst();
                }
          String[] colum = new String[rowCount];
            while(rs.next()) 
            { 
            colum[contador]=rs.getString("COLUMN_NAME");  
           // String column = rs.getString("COLUMN_NAME"); 
           //  System.out.println(column);
             contador++;

            } 
         
          return colum;
          
          
        } catch (SQLException ex) 
        {
            Logger.getLogger(Columnas_Mapeadas_Imp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    
}
