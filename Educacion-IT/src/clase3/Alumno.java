package clase3;

import java.util.Date;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaNacimiento;
	
	
	//constructor --> no tiene tipo de retorno, ni void ni nada
	//si creo uno que pasa parametros tengo que hacer uno default
	
	public Alumno() {
		
	}
	
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
	
	
		
	//Getter // Setters --> metodos de lectura y escritura sobre una clase
	
	//el Getter retorna algo, por eso no es void
	public String getNombre() {
		return nombre;
	}
	
	//Setter no devuelve nada porque pone el atributo
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	

	public void estudiar(String materia, int cantidadDeHoras) {
		Integer notaDeParcial = 10;
		System.out.println("Estudiando " + materia + " por " + cantidadDeHoras + " horas");
	}
	
	//sobre carga de métodos es cuando tengo formas de invocar un método
	public void estudiar(String materia) {
		Integer notaDeParcial = 10;
		System.out.println("Estudiando " + materia + " por 10 horas");
	}
	
	
	public void descansar(Integer horasDeDescanso) {
		System.out.println("Desncansado por " + horasDeDescanso + " horas");
	}
	
	
	
}