package ar.edu.unahur.empresaDeTransporteParcial;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehiculo {
    protected Set<Ciudad> ciudadesDisponibles = new HashSet<>();
    protected Set<Paquete> paquetes = new HashSet<>();
    protected double volumenMaximo;
    protected double pesoMaximo;

    protected abstract Boolean puedeAgregarPaquete(Paquete paquete); 

    protected int cantPaquetes() {
        return paquetes.size();
    }

    protected void recibir(Paquete paquete) {
        if (this.puedeAgregarPaquete(paquete)) {
            paquetes.add(paquete);
        }
    }
}
