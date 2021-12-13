package Logic;

import java.util.ArrayList;

public class Estudiante extends Usuario {
	private int nroEstudiante;
	ArrayList<Materia> materia = new ArrayList<Materia>();

	public Estudiante(int ci, String nombre, String apellido, int nroEstudiante) {
		super(ci, nombre, apellido);
		this.nroEstudiante = nroEstudiante;
	}

	public int getNroEstudiante() {
		return nroEstudiante;
	}

	public void setNroEstudiante(int nroEstudiante) {
		this.nroEstudiante = nroEstudiante;
	}
	

}
