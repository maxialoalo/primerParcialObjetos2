package ar.edu.unahur.empresaDeTransporteParcial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {
	Ciudad hurlingham = new Ciudad();
	Paquete miPaquete = new Paquete(hurlingham,10.0,20.0,30.0,40.0);
	@Test
/*	public void elPaqueteDevuelveUnaCiudadDestino() {
		Ciudad valorEsperado=hurlingham;
		Ciudad valorObtenido = miPaquete.ciudadDestino();
		assertEquals(valorEsperado,valorObtenido);
	}
	public void elPaqueteDevuelveSuLargo() {
		Double valorEsperado=10.0;
		Double valorObtenido= miPaquete.largo();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	public void elPaqueteDevuelveSuAncho() {
		Double valorEsperado=20.0;
		Double valorObtenido= miPaquete.ancho();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	public void elPaqueteDevuelveSuPeso() {
		Double valorEsperado=30.0;
		Double valorObtenido= miPaquete.peso();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	public void elPaqueteDevuelveSuProfundidad() {
		Double valorEsperado=40.0;
		Double valorObtenido= miPaquete.profundidad();
		
		assertEquals(valorEsperado,valorObtenido);
	}*/
	public void elPaqueteDevuelveSuDiametro() {
		Double valorEsperado=8000.0;
		Double valorObtenido= miPaquete.diametro();
		
		assertEquals(valorEsperado,valorObtenido);
	}
}
