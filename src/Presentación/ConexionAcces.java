package Presentación;
import java.sql.*; 

public class ConexionAcces {
    
    private String url = "jdbc:ucanaccess://C:\\Users\\Braqu\\OneDrive\\Escritorio\\Base de Datos - Proyecto Marsadi1.accdb"; 
    private String usr = "";
    private String pswd = ""; 
    private Connection con=null; 
 
    public ConexionAcces(){  /*Constructor, carga puente JDBC-ODBC*/ 
        loadDriver(); 
    } 
 
    private void loadDriver(){ // Carga el driver de la conexión a la base de datos 
       try{
            Class.forName( "net.ucanaccess.jdbc.UcanaccessDriver" ); 
        } 
        catch(ClassNotFoundException e) { 
            System.out.println("Error al crear el puente JDBC-Access");  
        } 
    } 
   
    public Connection ObtenerConexion(){ // Obtiene una conexión con el nombre del driver especificado 
        System.out.println("Estableciendo conexión con " + url); 
        try{ //Obtiene la conexión 
            con = DriverManager.getConnection( url,usr,pswd); 
        } 
        catch(SQLException sqle) {
            System.out.println("No se pudo establecer la conexión"); 
            return null; 
        } 
        System.out.println("Conexión establecida con:t " + url); 
        return con; //Regresa la conexión
    } 
   
    public boolean closeConecction() {// Cerrar la conexión.
       try{ 
           con.close(); 
        } 
        catch(SQLException sqle){ 
           System.out.println("No se cerro la conexión"); 
            return false; 
        } 
        System.out.println("Conexión cerrada con éxito "); 
        return true; 
    } 
}

