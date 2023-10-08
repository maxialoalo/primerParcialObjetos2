package ar.edu.unahur.empresaDeTransporteParcial;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class BicicletaTest {
	Ciudad hurlingham=new Ciudad();
	Ciudad moron=new Ciudad();
	Bicicleta miBicicleta = new Bicicleta(hurlingham);
	Paquete paquete1=new Paquete(hurlingham,0.5,0.5,1.2,0.1);
	Paquete paquete2=new Paquete(moron,10.0,20.0,30.0,40.0);
	Paquete paquete3=new Paquete(hurlingham,0.9,0.8,10.0,0.1);
	Paquete paquete4=new Paquete(hurlingham,10.0,20.0,30.0,40.0);
	
	@Test
	/*
	public void laBicicletaNoPuedeRecibirMasDeDosPaquetes() {
		miBicicleta.recibir(paquete1);
		miBicicleta.recibir(paquete2);
		miBicicleta.recibir(paquete3);
		miBicicleta.recibir(paquete4);
		Integer valorEsperado=2;
		Integer valorObtenido=miBicicleta.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}
	public void laBicicletaNoPuedeRecibirPaquetesMasGrandesDeLoDebido() {
		final Set<Paquete> esperado= new HashSet<Paquete>();
		esperado.add(paquete1);
		esperado.add(paquete3);
		
		miBicicleta.recibir(paquete1);
		miBicicleta.recibir(paquete2);
		miBicicleta.recibir(paquete3);
		miBicicleta.recibir(paquete4);
		Integer valorEsperado=esperado.size();
		Integer valorObtenido=miBicicleta.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}
	*/

	public void laBicicletaSoloPuedeRecibirYEntregarPaquetesEnSuCiudad() {
		miBicicleta.recibir(paquete1);
		miBicicleta.recibir(paquete2);
		final Set<Paquete> esperado= new HashSet<Paquete>();
		esperado.add(paquete1);
		Integer valorEsperado= esperado.size();
		Integer valorObtenido= miBicicleta.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}

}
