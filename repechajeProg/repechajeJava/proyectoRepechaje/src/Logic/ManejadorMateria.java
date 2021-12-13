package Logic;

import Persistencia.ManejadorBD;

public class ManejadorMateria {
	private static ManejadorBD man = new ManejadorBD();
	 
	 public void createMateria(Materia Materia) {
		 man.createMateria(Materia);
	 }
	 
	 public void deleteMateria(int codigo) {
		 man.deleteMateria(codigo);
	 }
	 public  void obtenerMateria(Materia Materia) {
		 man.obtenerMateria(Materia);
	 }
	 public  void updateMateria(Materia Materia) {
		 man.updateMateria(Materia);
	 }




	
	
}
