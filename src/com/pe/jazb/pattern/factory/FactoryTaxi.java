package com.pe.jazb.pattern.factory;

import com.pe.jazb.pattern.clases.Taxi;
import com.pe.jazb.pattern.interfaces.Vehiculo;
import com.pe.jazb.pattern.interfaces.VehiculoTransporte;

public class FactoryTaxi extends VehiculoTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		return new Taxi();
	}

}
