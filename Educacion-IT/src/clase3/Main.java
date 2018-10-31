package clase3;

import java.beans.FeatureDescriptor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Juan");
		alumno1.setApellido("Perez"); 
		alumno1.setDni("223321");
		//alumno1.getFechaNacimiento() = new Date(System.currentTimeMillis());
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Carlos");
		alumno2.setApellido("Gonzalez");
		alumno2.setDni("223322");
		alumno2.setDni("1976/10/09"); 
		
		//alumno2 = alumno1;
		
		Alumno alumno3 = new Alumno("Bob", "Charles", "223355", new Date(System.currentTimeMillis()));
		Alumno alumno4 = new Alumno("Diego", "Ramirez");
		
		System.out.println(alumno1.getDni());

		System.out.println(alumno2.getDni());
		
		alumno2.setDni("55555555");
		
		System.out.println(alumno2.getDni());
		/*
		System.out.println(alumno2.dni);*/
		
		alumno1.estudiar("geografía", 300);
		alumno2.estudiar("física", 20);
		alumno2.estudiar("geografía");
		alumno1.descansar(30);
		
		System.out.println(alumno3.getApellido() + "nacido el " + alumno3.getFechaNacimiento());
		System.out.println(alumno3);
		
	}

}