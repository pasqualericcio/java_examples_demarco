package org.protor.sandbox.riccio;

import java.io.File;

import org.protor.sandbox.agodemar.AbstractVehicle;
import org.protor.sandbox.agodemar.EnumEngineType;

public abstract class AbstractMarineVehicle extends AbstractVehicle {

	public AbstractMarineVehicle(File configFile) {
		super(configFile);
	}

	public AbstractMarineVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
	}

	public AbstractMarineVehicle(EnumEngineType engineType) {
		super(engineType);
	}

	public AbstractMarineVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);
	}

}
