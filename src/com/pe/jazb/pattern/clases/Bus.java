package com.pe.jazb.pattern.clases;

import com.pe.jazb.pattern.interfaces.Vehiculo;

public class Bus implements Vehiculo{

	private int codigo;
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void codigoDeVehiculo() {
		System.out.println(" Codigo de Bus : " + getCodigo());
		
	}

	@Override
	public int generarCodigo() {
		int codigoBus = (int)(Math.random()*9999);
		return codigoBus;
	}

}
