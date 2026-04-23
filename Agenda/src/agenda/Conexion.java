/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class Conexion {
     //Declaraciones     
    private static Connection cx;
    public Statement stm;     
    //public ResultSet rs;
    
     //Constantes     
    //private static final String driver = "com.mysql.jdbc.Driver";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    //private static final String url = "jdbc:mysql://192.168.3.12:3306/agenda";
    private static final String url = "jdbc:mysql://localhost:3306/agenda";
    private static final String user = "root";     
    //private static final String pass = "mislata";    
    private static final String pass = ""; 

    //**CONSTRUCTORES***********************************************************
    public Conexion() {         
        this.cx=null;
             
        try {             
            //Carga y permite el uso de los driver             
            Class.forName(this.driver);                            
            //Establecemso la conexión con los datos de las variables             
            this.cx=(Connection) DriverManager.getConnection(url, user, pass);                          
            //Si conecta con la base de datos que se especifica lo indica.             
            if (this.cx!=null){                 
                System.out.println("Conexion estableciada");
            }                 
            //stm = cx.createStatement();
            this.stm=(Statement)this.cx.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
        } catch (ClassNotFoundException | SQLException e) { 
            System.out.println(e);         
        }     
    }//conexion 
   
    public Conexion(String url,String user,String pass) {         
        this.cx=null;
             
        try {             
            //Carga y permite el uso de los driver             
            Class.forName(driver);                            
            //Establecemso la conexión con los datos de las variables             
            cx=(Connection) DriverManager.getConnection(url, user, pass);                          
            //Si conecta con la base de datos que se especifica lo indica.             
            if (cx!=null){                 
                System.out.println("Conexion estableciada");
            }                 
            //stm = cx.createStatement();
            this.stm=(Statement)this.cx.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            
        } catch (ClassNotFoundException | SQLException e) { 
            System.out.println(e);         
        }     
    }//conexion 
    
//**SET GET IS *****************************************************************        
    //Devuelve una conexión estableciad     
    public Connection getConnection(){         
        return cx;     
    }//getConnection          
  
    
//**METODOS*********************************************************************     
    //Finaliza la conexión     
    public void desconectar(){         
        cx=null;         
        System.out.println("Fin Conexion");     
    }//desconectra() 
    
    
    //Devuele el resultado de una sentencia SQL sobre la conexión establecida     
    public ResultSet getRS(String sql){         
        try {
            System.out.println("OK - "+sql+" CORRECTA");
            return stm.executeQuery(sql); 
        }catch (SQLException e) {             
            System.out.println("ERROR - "+sql+" INCORRECTA");             
        return null;         
        }     
    }//getRS()
   
}//class
