package ar.edu.unahur.empresaDeTransporteParcial;

import java.util.HashSet;
import java.util.Set;

public class Automovil extends Vehiculo {
    private Set<Ciudad> ciudadesYaRepartidas = new HashSet<>();
    private Double volumenMaximo = 2.0;
    private Double pesoMaximo = 500.0;

    public Automovil(Ciudad ciudad) {
        this.ciudadesDisponibles.add(ciudad);
    }

    protected boolean puedeAgregarCiudad(Ciudad ciudad) {
        return this.ciudadesDisponibles.size() < 3 && !this.ciudadesDisponibles.contains(ciudad);
    }

    protected void agregarCiudad(Ciudad ciudad) {
        if (this.puedeAgregarCiudad(ciudad))
            this.ciudadesDisponibles.add(ciudad);
    }

    protected boolean yaRepartioEnLaCiudadDelPaquete(Paquete paquete) {
        return ciudadesYaRepartidas.contains(paquete.ciudadDestino());
    }
    @Override
    protected Boolean puedeAgregarPaquete(Paquete paquete) {
        double volumenTotal = paquetes.stream().mapToDouble(Paquete::diametro).sum() + paquete.diametro();
        double pesoTotal = paquetes.stream().mapToDouble(Paquete::peso).sum() + paquete.peso();
        return !this.yaRepartioEnLaCiudadDelPaquete(paquete) && ciudadesYaRepartidas.size() < 3 && volumenTotal <= volumenMaximo && pesoTotal <= pesoMaximo;
    }

}