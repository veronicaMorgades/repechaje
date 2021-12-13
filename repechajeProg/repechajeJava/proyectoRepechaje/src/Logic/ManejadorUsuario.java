package Logic;

import Persistencia.ManejadorBD;

public class ManejadorUsuario{
	private static ManejadorBD man = new ManejadorBD();
	 
	 public  void createUsuario(Usuario Usuario) {
		 man.createUsuario(Usuario);
	 }
	 
	 public  void deleteUsuario(Usuario Usuario) {
		 man.deleteUsuario(Usuario);
	 }
	 
	 public  void obtenerUsuario(Usuario Usuario) {
		 man.obtenerUsuario(Usuario);
	 }
	 public void updateUsuario(Usuario Usuario) {
		 man.updateUsuario(Usuario);
	 }
	
	 
 }