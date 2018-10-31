package clase4;


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
		
	//LOS METODOS ABTRACTOS SE USAN EN CLASES ABSTRACTAS Y SE INSTANCIAS EN LAS SUB CLASES
	public abstract void ascelerar();
	
	//SOBRE CARGA DE METODOS
	public abstract void ascelerar(int cuanto);
	
	
	public abstract void frenar() ;
	
	public void cargarPasajero() {
		
	}
	
	public void descargarPasajeros() {
		
	}

}
