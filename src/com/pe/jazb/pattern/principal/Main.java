package com.pe.jazb.pattern.principal;

import com.pe.jazb.pattern.factory.FactoryTaxi;
import com.pe.jazb.pattern.interfaces.Vehiculo;
import com.pe.jazb.pattern.interfaces.VehiculoTransporte;

public class Main {
	
	public static void main(String[] args){
		
		VehiculoTransporte transporte = new FactoryTaxi();
		Vehiculo vehiculo = transporte.crearVehiculo();
		vehiculo.generarCodigo();		
	}
	
}
