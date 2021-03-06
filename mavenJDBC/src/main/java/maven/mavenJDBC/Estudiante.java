package maven.mavenJDBC;

import java.sql.SQLException;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String padron;
	private int id_estudiante;
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
	public String getPadron() {
		return padron;
	}
	public void setPadron(String padron) {
		this.padron = padron;
	}
	public int getId_estudiante() {
		return id_estudiante;
	}
	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}
	@Override
	public String toString() {
		
		return  "\nEstudiante [nombre=" + nombre + ", apellido=" + apellido + ", padron=" + padron + ", id_estudiante="
				+ id_estudiante + "]";
		
	}
	public Estudiante() {
		
	}
	public Estudiante(String nombre, String apellido, String padron) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.padron = padron;
	}
	/* CONSTRUCTOR CON GRABACÍON AUTOMATICA EN BD
	public Estudiante(String nombre, String apellido, String padron, int id) {
		
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(nombre);
		estudiante.setApellido(apellido);
		estudiante.setPadron(padron);
		EstudianteDao2 estudianteDao2 = new EstudianteDao2();
		try {
			
			estudianteDao2.grabar(estudiante);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	*/
	

	
}
