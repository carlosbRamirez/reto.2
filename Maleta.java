public class Maleta {

	private String nombre;
	private String capacidad,numeroBolsillos;
	
	public Maleta(String nombre, String capacidad, String numeroBolsillos) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.numeroBolsillos = numeroBolsillos;
	}
	
	public Maleta(){}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getNumeroBolsillos() {
		return numeroBolsillos;
	}

	public void setNumeroBolsillos(String numeroBolsillos) {
		this.numeroBolsillos = numeroBolsillos;
	}

}