package Logic;

import java.util.ArrayList;

public class Profesor extends Usuario {
	private int matricula;
	ArrayList<Materia> materia = new ArrayList<Materia>();
	
	public Profesor(int ci, String nombre, String apellido, int matricula) {
		super(ci, nombre, apellido);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
		
	}
	

}
