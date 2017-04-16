package com.pe.jazb.pattern.clases;

import com.pe.jazb.pattern.interfaces.Vehiculo;

public class Taxi implements Vehiculo{
	
	private int codigo; 
	
	@Override
	public int generarCodigo() {
		int codigoTaxi = (int)(Math.random()*9999);
		return codigoTaxi;
	}
	
	@Override
	public void codigoDeVehiculo() {
		System.out.println( "el codigo de Taxi es : " +  getCodigo()); 
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
