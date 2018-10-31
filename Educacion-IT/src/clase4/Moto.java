package clase4;

public class  Moto extends Transporte {

	public Moto(int cantidadPasajeros, float velocidadMaxima, float velocidadMinima, float valor) {
		super(cantidadPasajeros, velocidadMaxima, velocidadMinima, valor);
		
	}


	
	public void ascelerar() {
		System.out.println("Ascelero como una moto");
	}
	
	public void frenar() {
		System.out.println("frenando como una moto");
	}
	
	@Override
	public void ascelerar(int cuanto) {
		System.out.println("Ascelero como una embarcacion a " + cuanto);
		
	}


}
