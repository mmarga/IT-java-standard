package clase3;

public abstract class Transporte {
	
	protected int cantidadPasajeros;
	protected float velocidadMaxima;
	protected float velocidadMinima;
	protected float valor;	
	
	
	
	public Transporte(int cantidadPasajeros, float velocidadMaxima, float velocidadMinima, float valor) {
		//super();
		this.cantidadPasajeros = cantidadPasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadMinima = velocidadMinima;
		this.valor = valor;
	}
		
	
	public void ascelerar() {
		
	}
	
	public void frenar() {
		
	}
	
	public void cargarPasajero() {
		
	}
	
	public void descargarPasajeros() {
		
	}

}
