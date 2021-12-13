package Logic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejadorMateria manM = new ManejadorMateria();
	    ManejadorUsuario manU = new ManejadorUsuario();
		
		//Materias//
	    Materia mat = new Materia(7, "Quimica");
		manM.createMateria(mat);
		
		Materia mat1 = new Materia(7, "Fisica");
		manM.updateMateria(mat1);
		
		Materia mat2 = new Materia(6, "Fisica");
		manM.deleteMateria(6);
		
		
		
		
		//Usuarios//
		Usuario usu = new Usuario( 123321, "Magno", "Carlos");
		manU.createUsuario(usu);
		
		Usuario usu1 = new Usuario( 123321, "Magno", "Pepe");
	    manU.updateUsuario(usu1);
	    
	    Usuario usu2 = new Usuario(54471580, "Veronica", "Morgades");
	    manU.deleteUsuario(usu2);
	
		
	
	}


}
