package clase3;

import java.util.jar.Attributes.Name;

public class MainTransporte {

	public static void main(String[] args) {
		Auto a = new Auto("Toyota", "corola", "1999", 32, 320, 50, 5);
		
		
		System.out.println("La marca es " + a.getMarca() );
		System.out.println("Y lleva a :" + a.cantidadPasajeros);
		
		Complete complete1 = new Complete();
		complete1.name = "juan";
		complete1.id = 20;
		
		// NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
		//Transporte abs = new Transporte(); 
		
		System.out.println("mi nombre es " + complete1.name + " y mi id es " + complete1.id);
		
		
		
		
		
	}
	
	
	

}
