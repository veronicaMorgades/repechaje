package Persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Logic.Materia;
import Logic.Usuario;



public class ManejadorBD {
	


	public void setUsuario(Usuario usuario) {
	}
	 public void createUsuario(Usuario Usuario) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
			try {
				Statement stmt = con.createStatement();
				String insert = "INSERT INTO Usuario VALUES('" + Usuario.getCi() + "','" + Usuario.getNombre() + "', '" + Usuario.getApellido()+"')";
				stmt.executeUpdate(insert);


			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void deleteUsuario(Usuario usuario) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
			try {
				Statement stmt = con.createStatement();
				String delete = "DELETE FROM Usuario WHERE Ci = " + usuario.getCi()+";";
				stmt.executeQuery(delete);
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public  Usuario obtenerUsuario(Usuario Usuario) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
			try {
				Statement stmt = con.createStatement();
				String obtener = "SELECT * FROM usuario WHERE ci ='" + Usuario.getCi()+"'";
				ResultSet rs = stmt.executeQuery(obtener);
				
				return new Usuario(rs.getInt("ci"), rs.getString("apellido"),rs.getString("nombre"));
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
			return Usuario;
			
			} 
		public  Usuario updateUsuario(Usuario Usuario) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
			try {
				Statement stmt = con.createStatement();
				String actualizar = "update Usuario SET Nombre = '" + Usuario.getNombre() +"', apellido"+ Usuario.getApellido() + " WHERE ci ='" + Usuario.getCi()+"'";
				ResultSet rs = stmt.executeQuery(actualizar);
				
				return new Usuario(rs.getInt("ci"), rs.getString("apellido"),rs.getString("nombre"));
		
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
			return Usuario;
			
			}
		


		public void setMateria(Materia Materia) {
	}
		
		public  void createMateria(Materia Materia) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
		try {
			Statement stmt = con.createStatement();
			String insert = "INSERT INTO Materia(codigo, nombre) "
					+ "VALUES('" + Materia.getCodigo() + "','" + Materia.getNombre() + "')";
			stmt.executeUpdate(insert);
		}
		
		catch (SQLException e) {
				e.printStackTrace();
			}
		}
 
	 public  void deleteMateria(int codigo) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
		try {
			Statement stmt = con.createStatement();
			String delete = "DELETE FROM Materia WHERE codigo =" + codigo; 
			stmt.executeUpdate(delete);
		}
		
		catch (SQLException e) {
				e.printStackTrace();
			}
		}
  public  Materia obtenerMateria(Materia Materia) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
		try {
			Statement stmt = con.createStatement();
			String obtener = "SELECT * FROM Materia WHERE codigo ='" + Materia.getCodigo()+"'";
			ResultSet rs = stmt.executeQuery(obtener);	
			return new Materia(rs.getInt("codigo"), rs.getString("nombre"));	
		}
		catch (SQLException e) {
				e.printStackTrace();
			}	
			 return Materia;
		} 
	 public  Materia updateMateria(Materia Materia) {
			DBConf dbconf = new DBConf();
			Connection con = dbconf.conectarMySQL();
		try {
			Statement stmt = con.createStatement();
			String update = "UPDATE Materia"
					+ " SET Nombre = '" + Materia.getNombre() + "',"
							+ " WHERE Codigo =" + Materia.getCodigo() +";"; 
			ResultSet rs = stmt.executeQuery(update);	
			return new Materia(rs.getInt("codigo"), rs.getString("nombre"));	
			} 
		catch (SQLException e) {
				e.printStackTrace();
			}
			
			return Materia;
			
			}

		} 




	
	




	
	


