package clase2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDosMain {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		
//		Alumno alumno1 = new Alumno();
//		alumno1.setNombre("Juan");
//		alumno1.setApellido("Pérez");
//		alumno1.setDni("11232332323");
//		alumno1.setFechaNacimiento(new Date(System.currentTimeMillis()));

		Alumno alumno1 = new Alumno("Juan", "Pérez", "2222222",
				new Date(System.currentTimeMillis()));

		Alumno alumno2 = new Alumno("Carlos", "Pérez", "2222222",
				sdf.parse("1976/10/09"));

		Alumno alumno3 = new Alumno("Pedro", "Gómez");

//		alumno2.setNombre("Carlos");
//		alumno2.setApellido("Pérez");
//		alumno2.setDni("3332223333");
//		alumno2.setFechaNacimiento(sdf.parse("1976/10/09"));
//
		//alumno2 = alumno1;

		System.out.println(alumno1.getDni());

		System.out.println(alumno2.getDni());
		
		alumno2.setDni("55555555");
		
		System.out.println(alumno1.getDni());

		System.out.println(alumno2.getDni());

		alumno1.estudiar("análisis matemático I", 100);
		alumno2.estudiar("Física", 2000);
		alumno2.estudiar("Química");

		alumno1.descansar(23);

		System.out.println(alumno1);

		System.out.println(alumno1.getDni()  + " " + alumno2.getApellido());

	}

}
