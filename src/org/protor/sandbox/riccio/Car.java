package org.protor.sandbox.riccio;

import java.io.File;

import org.protor.filesio.utils.XMLUtils;
import org.w3c.dom.Node;

public class Car extends AbstractTerrestrialVehicle {

	public Car(EnumEngineType engineType) {
		super(engineType);
	}

	public Car(File configFile) {
		super(configFile);
	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload, groundContactType);

	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
	}

	public Car(String name, EnumEngineType engineType) {
		super(name, engineType);
	}
	public Car(Node node) {
		super(node);
	}

	@Override
	protected void loadFromFile(File configFile) {
		
		// TODO agodemar: implement the logic here
		
		System.out.println("[Car] Reading data from file: "
				+ configFile.getAbsolutePath());
		
		System.out.println("... function not implemented yet.");
		
		
	}
	
	protected void loadFromNode(Node node) {
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			
			this.name = XMLUtils.getXMLPropertyByPath(node, "//name/text()");
		}
		
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("--- Car Object ---\n");
		sb.append("Name: " + this.name + "\n");
		sb.append("Ground contact: " + this.groundContactType + "\n");
		sb.append("Engine type: " + this.engineType + "\n");
		sb.append("------------------------\n");
		return sb.toString();
	}
	
}
