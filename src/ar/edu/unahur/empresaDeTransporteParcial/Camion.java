package ar.edu.unahur.empresaDeTransporteParcial;

public class Camion extends Vehiculo {
    protected double volumenMaximo = 20.0;
    protected double pesoMaximo = 16000.0;

    public Camion(Ciudad ciudad) {
        this.ciudadesDisponibles.add(ciudad);
    }
    @Override
    protected Boolean puedeAgregarPaquete(Paquete paquete) {
        double volumenTotal = paquetes.stream().mapToDouble(Paquete::diametro).sum() + paquete.diametro();
        double pesoTotal = paquetes.stream().mapToDouble(Paquete::peso).sum() + paquete.peso();
        return volumenTotal <= volumenMaximo && pesoTotal <= pesoMaximo;
    }

   
}
