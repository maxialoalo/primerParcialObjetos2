package ar.edu.unahur.empresaDeTransporteParcial;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {
	Ciudad hurlingham=new Ciudad();
	Ciudad moron=new Ciudad();
	Ciudad castelar=new Ciudad();
	Automovil miAuto = new Automovil(hurlingham);
	Paquete paquete1=new Paquete(hurlingham,0.5,0.5,1.2,0.1);
	Paquete paquete2=new Paquete(moron,1.0,2.0,30.0,40.0);
	Paquete paquete3=new Paquete(moron,0.9,0.8,10.0,0.1);
	Paquete paquete4=new Paquete(castelar,0.9,1.0,2.0,0.1);
	@Test
	public void elAutoNoPuedeRecibirMasDe3PaquetesConDestinosDistintos() {
		miAuto.recibir(paquete1);
		miAuto.recibir(paquete2);
		miAuto.recibir(paquete3);
		miAuto.recibir(paquete4);
		Integer valorEsperado=3;
		Integer valorObtenido=miAuto.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}/*
	public void elAutoNoPuedeRecibirMasPaquetesConElDiametroYPesoCubierto() {
		Paquete paquete5 = new Paquete(hurlingham, 0.5, 0.5, 1.2, 0.1);
		Paquete paquete6 = new Paquete(moron, 1.0, 2.0, 30.0, 40.0);
		Paquete paquete7 = new Paquete(moron, 0.9, 0.8, 20.0, 0.1);
		Paquete paquete8 = new Paquete(castelar, 1.5, 1.5, 20.0, 200.0);
		miAuto.recibir(paquete5);
		miAuto.recibir(paquete6);
		miAuto.recibir(paquete7);
		miAuto.recibir(paquete8);
		Integer valorEsperado=2;
		Integer valorObtenido=miAuto.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	public void elAutoNoRecibePaquetesConElMismoDestino() {
		miAuto.recibir(paquete2);
		miAuto.recibir(paquete3);
		Integer valorEsperado=1;
		Integer valorObtenido=miAuto.cantPaquetes();
		assertEquals(valorEsperado,valorObtenido);
	}*/
}
