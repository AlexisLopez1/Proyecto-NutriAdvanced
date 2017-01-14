package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion 
{
         Connection con = null;
	 Statement stmt = null;
	 ResultSet rs = null;
	 String password = null;
	 String usuario = null;
	 String driver = null;
	 String baseDatos = null;
	
	public Conexion(String password, String usuario, String driver, String baseDatos) 
	{
		super();
		this.password = password;
		this.usuario = usuario;
		this.driver = driver;
		this.baseDatos = baseDatos;
	}
	public Connection getCon()
	{
		return con;
	}
	public void setCon(Connection con) 
	{
		this.con = con;
	}
	public Statement getStmt()
	{
		return stmt;
	}
	public void setStmt(Statement stmt)
	{
		this.stmt = stmt;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	 public boolean conecta(){

		    boolean conectado = false;

		     

		    try {

		      Class.forName(this.driver);

		    } catch (Exception e) {}      

		     

		    try {

		      this.con =  DriverManager.getConnection(

		                                "jdbc:mysql://localhost/" + this.baseDatos,

		                                this.usuario,

		                                this.password);

		          System.out.println("Si conecte. Conneccion: " + con);

		          conectado = true; 

		      }catch (java.sql.SQLException e) {  

		   	      System.out.println("No conecte, Excepcion ::" + e);

		      }

		      return conectado;

		    }

////////////////////////////////////////////////////////////////////////			 

		  public void insertaRegistro(String sql)
		  {		
		     try 
		     {
		         stmt = con.createStatement();
		         stmt.executeUpdate(sql);
             } 
		     catch(Exception e) { System.out.println(e);}
		  }

		  public ResultSet Consultar(String sql)
		  {
			  try 
			     {
			         stmt = con.createStatement();
			         rs = stmt.executeQuery(sql);
	             } 
			     catch(Exception e) { System.out.println(e+"insertar");}
			return rs;  
		  }
    
    
}
