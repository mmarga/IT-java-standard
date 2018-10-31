package clase2;

import java.util.Date;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaNacimiento;


	public Alumno(String nombre, String apellido, String dni, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}


	// Getter / Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre	 = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void estudiar(String materia, Integer cantidadDeHoras) {
		System.out.println("Estudiando "+materia + " por "+cantidadDeHoras + " horas");
	}

	public void estudiar(String materia) {
		System.out.println("Estudiando "+materia + " por "+10 + " horas");
	}

	public void descansar(Integer horasDeDescanso) {
		System.out.println("Descansando por  "+ horasDeDescanso + " de descanso");
	}
	
	
}