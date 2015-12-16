package Parametros;
public class Parametos_db {
 private String servidor;
 private String usuarioDB;
 private String passwordDB;
 private String classNameDb;
 

public Parametos_db(){ //El constructor debe ser public al igual que la clase.
classNameDb="com.mysql.jdbc.Driver";
servidor="jdbc:mysql://10.94.143.194:3306/infinitum_unica";
usuarioDB="infinitum";
passwordDB="infinitum2008";
}
public void setClassNameDB(String classNam){
   classNameDb=classNam;
   }

public String getClassNameDB(){
     return classNameDb;
}
        

public void setServidor(String servi){
  servidor=servi;
}

public String getServidor(){
 return servidor;
}

public void setUsuarioDB(String user){
  usuarioDB =user;
}

public String getusuarioDB(){
return usuarioDB;
}

public void setPasswordDB(String passw){
 passwordDB=passw;
}

public String getPasswordDB(){
return passwordDB; 
}



}
