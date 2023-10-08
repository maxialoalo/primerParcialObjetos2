package ar.edu.unahur.empresaDeTransporteParcial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {
	Ciudad hurlingham=new Ciudad();
	Ciudad moron=new Ciudad();
	Ciudad castelar=new Ciudad();
	Camion miCamion = new Camion(hurlingham);
	Paquete paquete1 = new Paquete(hurlingham, 5.0, 2.0, 1.0, 4000.0);
	Paquete paquete2 = new Paquete(moron, 5.0, 2.0, 1.0, 4000.0);
	Paquete paquete3=new Paquete(moron,0.9,0.8,10.0,0.1);
	Paquete paquete4=new Paquete(castelar,0.9,1.0,2.0,0.1);
	Paquete paquete5=new Paquete(moron,0.9,0.8,10.0,0.1);
	Paquete paquete6=new Paquete(moron,0.9,0.8,10.0,0.1);
	@Test
	
	public void elCamionNoPuedeExcederseDePesoOVolumen() {
		miCamion.recibir(paquete1);
		miCamion.recibir(paquete2);
		miCamion.recibir(paquete3);
		miCamion.recibir(paquete4);
		Integer valorEsperado=2;
		Integer valorObtenido=miCamion.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}/*
	public void elCamionPuedeRecibirVariosPaquetesDeLaMismaCiudad() {
		miCamion.recibir(paquete6);
		miCamion.recibir(paquete3);
		miCamion.recibir(paquete5);
		Integer valorEsperado=3;
		Integer valorObtenido=miCamion.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}*/
}
