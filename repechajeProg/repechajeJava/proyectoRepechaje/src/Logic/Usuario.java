package Logic;

public class Usuario {
	private int ci;
	private String nombre;
	private String apellido;
	
	public Usuario(int ci, String nombre, String apellido) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci= ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	} 
	
	

}
