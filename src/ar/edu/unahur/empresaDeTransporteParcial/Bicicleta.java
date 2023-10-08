package ar.edu.unahur.empresaDeTransporteParcial;


public class Bicicleta extends Vehiculo {
	private Double volumenMaximo = 2.0;
    private Double pesoMaximo = 500.0;
	private Ciudad ciudad; 
	public Bicicleta(Ciudad ciudad) {
		this.ciudad = ciudad;
		this.agregarCiudad();
	}
	@Override
	protected Boolean puedeAgregarPaquete(Paquete paquete) {
		return this.cantPaquetes()<2&&paquete.diametro()<=this.volumenMaximo&&paquete.peso()<=this.pesoMaximo && paquete.ciudadDestino()==this.ciudad;
	}

	private void agregarCiudad() {
		if(this.ciudadesDisponibles.size()<1)ciudadesDisponibles.add(ciudad);
	}

}
