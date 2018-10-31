package clase4;


import java.util.jar.Attributes.Name;

public class MainTransporte {

	public static void main(String[] args) {
		Auto a = new Auto("Toyota", "corola", "1999", 32, 320, 50, 5);
		
		
		System.out.println("La marca es " + a.getMarca() );
		System.out.println("Y lleva a :" + a.cantidadPasajeros);
		
		
		// NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
		//Transporte abs = new Transporte(); 
		
	
		
		a.ascelerar();
		
		Transporte mo = new Moto(10, 30, 1, 2000);
		
		mo.ascelerar();
		
		Transporte m = new Auto("vw", "scarabajo", "1994", 3, 2, 10, 1222);
		m.ascelerar();
		
		Embarcaciones barco = new Embarcaciones(23, 22, 14, 3111);
		barco.ascelerar();
		barco.ascelerar(30000);
		
		
		
		
		
		
	}
	
	
	

}
