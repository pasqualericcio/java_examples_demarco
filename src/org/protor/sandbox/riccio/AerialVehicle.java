package org.protor.sandbox.riccio;

public abstract class AerialVehicle extends AbstractVehicle {
	public AerialVehicle(EnumEngineType engineType) {
		super (engineType);

	}

	public AerialVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);
		
	}

}
