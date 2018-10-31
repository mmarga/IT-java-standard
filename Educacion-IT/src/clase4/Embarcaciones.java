package clase4;

public class Embarcaciones extends Transporte{

	
	public Embarcaciones(int cantidadPasajeros, float velocidadMaxima, float velocidadMinima, float valor) {
		super(cantidadPasajeros, velocidadMaxima, velocidadMinima, valor);
	}

	@Override
	public void ascelerar() {
		System.out.println("Ascelero como una embarcación");
		
	}
	
	

	@Override
	public void frenar() {
		System.out.println("frenanddo como una embarcación");
		
	}

	@Override
	public void ascelerar(int cuanto) {
		System.out.println("Ascelero como una embarcacion a " + cuanto);
		
	}

	
	
}
