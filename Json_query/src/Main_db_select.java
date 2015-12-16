import Conexion_DB.Conexion_db_imple;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
public class Main_db_select {
   
	public static String Referencia_SISA;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		   
	
		     String tabla="construccion_fo";
	        
	         
	                              
        try {
       	 
        	 Conexion_db_imple obj_conex=new Conexion_db_imple();
             Connection hola = obj_conex.conexion(); 
                  
     /*        Statement sta = hola.createStatement(); 
             ResultSet res = sta.executeQuery(st);
              ResultSetMetaData rmd = res.getMetaData();
           //  System.out.println("Result set columns:");
             for (int i=1; i<=rmd.getColumnCount(); i++) {
               String name = rmd.getColumnName(i);
               String type = rmd.getColumnTypeName(i);
               int size = rmd.getPrecision(i);
            //   System.out.println("   "+name+", "+type+", "+size);
             }
             StringBuilder cadena_jason = new StringBuilder("{");         
             Statement state = hola.createStatement();
             ResultSet resu = state.executeQuery(st_2);*/
            
             
      /*       int cont=0;
             while (resu.next())
             {
            	 String ref_si = resu.getString("ref_sisa");
              
            	 int id = resu.getInt("id");
               String lastName = resu.getString("supervisor_fo");
               String punta = resu.getString("punta");
               String nodo_sugerido = resu.getString("nodo_sugerido");
   cadena_jason.append("'fila_"+cont+"'"+":"+"{'id': '"+id+"',"+"'ref_si': '"+ref_si+"',"+"'supervisor_fo': '"+lastName+"',"
            		   +"'punta': '"+punta+"',"+"'nodo_sugerido': '"+nodo_sugerido+"'},");
            cont++;
             }*/
              
               
            
         
          
            
    /*         cadena_jason.append("}");
              resu.close();*/
             for(String argument : args){
	        	
	        	  
                 String st= "select * from "+tabla+" where ref_sisa='"+argument+"'";
                 //String st_2= "select * from "+tabla+"";
        
             Statement estate = hola.createStatement();
             ResultSet resultado = estate.executeQuery(st);
                  if(resultado!=null){        
                 if (resultado.next()) {
               	   	 String ref_sisa=resultado.getString("ref_sisa");
               	     String punta=resultado.getString("punta");
               	     Date fecha_solicitud=resultado.getDate("fecha_solicitud");
               	     String sol_usuario=resultado.getString("sol_usuario");
               
                System.out.println("{'ref_sisa': '"+ref_sisa+"','punta': '"+punta+"','fecha_solicitud': '"+fecha_solicitud+"','sol_usuario': '"+sol_usuario+"'}");	     
               	     
                 }
                     
             }
                  resultado.close();
             } 
                 
               
             
                        
        		/*stmt = hola.createStatement();
        	System.out.println(stmt);
             ResultSet rs = stmt.executeQuery(st);
             System.out.println(rs.getString("punta"));
           
             //while (rs.next()) {
                 String coffeeName = rs.getString("punta");
                 String supplierID = rs.getString("estatus_const_fo");
                 String price = rs.getString("anillo_rof");
                 String sales = rs.getString("dependencia_construccion");
                 String total = rs.getString("ref_sisa");
                 System.out.println(coffeeName + "\t" + supplierID +
                                    "\t" + price + "\t" + sales +
                                    "\t" + total);
                  
             //}/*
    	  Hashtable<String, String> capitales = new Hashtable<String, String>();
    	  
          capitales.put("España","Madrid");
          capitales.put("Argentina","Buenos Aires");
          capitales.put("Mexico","DF");
          capitales.put("Alemania","Berlin"); 
          
          
          
           String[] claves = (String[]) capitales.keySet().toArray(new String[0]);
     	 
         java.util.Arrays.sort(claves);
     	
         int size_hastable=capitales.size();
         System.out.println(size_hastable);
     	 StringBuilder cadena_json = new StringBuilder("{");
     	 
         	 for(String clave : claves) {
                  
         		 cadena_json.append('"'+clave+'"'+':'+'"'+capitales.get(clave));
	          }
         	cadena_json.append("}");
         	 String e = cadena_json.toString();
     	 
     	/*StringBuilder sb = new StringBuilder("{");
     	for (int i = 0; i < 100; i++) {
     	     sb.append(" mundo");
     	}
     	String e = sb.toString();*/
     	
     	//System.out.println(cadena_json);
     	
     	
     	Map<String, String> map = new HashMap<String, String>(); //se declara el hashmap
     	map.put("key1", "value1");
     	map.put("key2", "value2");

     	Object[][] twoDarray = new String[map.size()][2];

     	Object[] keys = map.keySet().toArray();
     	Object[] values = map.values().toArray();

     	for (int row = 0; row < twoDarray.length; row++) {
     	    twoDarray[row][0] = keys[row];
     	    twoDarray[row][1] = values[row];
     	}

     	for (int i = 0; i < twoDarray.length; i++) {
     	    for (int j = 0; j < twoDarray[i].length; j++) {
     	    //    System.out.println(twoDarray[i][j]);
     	    }
       
     	
             
         }
        }
        catch (SQLException error ) 
        {
        	 System.out.println(error);
        	 error.printStackTrace();
           
         } 
         
      }
	

	
	}
    

     
    

    
    
