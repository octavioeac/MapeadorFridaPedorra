package PHP_generator;
import Interfaces_db.codeGenerador;

import java.io.FileWriter;
import java.io.IOException;

public class generador_ClaseDao implements codeGenerador  {
    
     public void generadorDAO(String[] colum,String tabla,String ruta){
      
         int i;
         try{ 
         //Abro stream, crea el fichero si no existe
        	 FileWriter fw=new FileWriter(""+ruta+"\\Parametros_"+tabla+".php");
            //FileWriter fw=new FileWriter("C:\\Prueba_php\\Parametros_"+tabla+".php");
            //Escribimos en el fichero un String y un caracter 97 (a)
            fw.write("<?php\n" +
"class Parametros_"+tabla+"\n" +
"{\n" +
"    private $ref_sisa;\n" +
"	private $punta;\n" +
"	private $arrays=array();\n" +
"	\n" +
"	public function __construct(\n" +
"	    $array_columna=array\n" +
"		(\n");
            
            //Cierro el stream
             
         for (i = 0; i<=(colum.length-1) ; i++) 
         {
          //System.out.println("hola array"+colum[i]);
             if(i!= (colum.length-1)){       
             fw.write("\"columna_"+i+"\"=>"+"\""+colum[i]+"\", \n");
             }
             else{       
             fw.write("\"columna_"+i+"\"=>"+"\""+colum[i]+"\" \n");
             }
         }
      fw.write("   ),\n" +
"		$ref_sisa=\"ref_sisa\",\n" +
"		$punta=\"punta\"	\n" +
"	                             )\n" +
"		{\n" +
"		$this->arrays=$array_columna;\n" +
"		$this->ref_sisa=$ref_sisa;\n" +
"		$this->punta=$punta;\n" +
"     	}\n" +
" \n" +
" \n" +
"    public function __set($parametro,$valor)\n" +
"	{\n" +
" 	      if (property_exists($this, $parametro)) \n" +
"		  {\n" +
" 		$this->$parametro = $valor;\n" +
" 	      }\n" +
" 	else{\n" +
" 		echo \"Imposible encotrar parametro\";\n" +
" 		 }\n" +
"	}\n" +
" \n" +
"\n" +
"    public function __get($parametro)\n" +
"	{\n" +
" 	 	if (property_exists($this, $parametro)) \n" +
"		{\n" +
" 		return $this->$parametro;\n" +
" 		}\n" +
"	 	else\n" +
"		{\n" +
" 		echo \"no existe propiedad\";\n" +
" 		}\n" +
" 	}\n" +
" \n" +
" \n" +
" \n" +
"}\n" +
"\n" +
"?>" );  
      fw.close();
         
     }
            catch(IOException e)
            {
                   System.out.println("Error E/S: "+e);
            }
     
     }
         
         
     
     
}
