package clase3;

public class Auto extends Transporte {
	
	private String marca;
	private String modelo;
	private String anio;
	
/*	//se debe crear primero el constructor de la superclase como primer linea en el constructor
	public Auto(int cantidadPasajeros, float velocidadMaxima, float velocidadMinima, float valor) {
		super(cantidadPasajeros, velocidadMaxima, velocidadMinima, valor);
		
	}  
	*/
	//completado con los datos de esta clase particular
	
	public Auto(String marca, String modelo, String anio, int cantidadPasajeros, float velocidadMaxima, float velocidadMinima, float valor) {
		super(cantidadPasajeros, velocidadMaxima, velocidadMinima, valor);
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	

}
