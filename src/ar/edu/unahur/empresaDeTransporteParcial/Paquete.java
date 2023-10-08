package ar.edu.unahur.empresaDeTransporteParcial;

public class Paquete {
	private Ciudad ciudadDestino;
	private Double largo;
	private Double ancho;
	private Double peso;
	private Double profundidad;
	
	
	public Paquete(Ciudad ciudad, Double largo, Double ancho, Double peso, Double profundidad) {
		this.ciudadDestino = ciudad;
	    this.largo = largo;
	    this.ancho = ancho;
	    this.peso = peso;
	    this.profundidad = profundidad;
	}

	public Ciudad ciudadDestino() {
		return this.ciudadDestino;
	}

	public Double largo() {
		return this.largo;
	}

	public Double ancho() {
		return this.ancho;
	}

	public Double peso() {
		return this.peso;
	}

	public Double profundidad() {
		return this.profundidad;
	}

	public Double diametro() {
		return this.ancho * this.largo * this.profundidad;
	}
	
}