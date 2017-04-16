package com.pe.jazb.pattern.factory;

import com.pe.jazb.pattern.clases.Bus;
import com.pe.jazb.pattern.interfaces.Vehiculo;
import com.pe.jazb.pattern.interfaces.VehiculoTransporte;

public class FactoryBus extends VehiculoTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		return new Bus();
	}

}
