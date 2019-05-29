package org.protor.sandbox.riccio.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.protor.filesio.utils.XMLUtils;
import org.protor.sandbox.riccio.Car;
import org.protor.sandbox.riccio.EnumEngineType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test03 {

	public static void main(String[] args) {

		// "C:\Users\PC6\RICCIO\github\java_examples_demarco\input"
		// String fileName ="cars.xml";
		//File carsFile = new File("input" + File.separator +fileName);



		//String fileName = "cars.xml";
		if (args.length !=0) {
			// get the file name
			String filePath = args[0];
			File carsFile = new File(filePath);
			if (!carsFile.exists()) {
				System.err.println(
						"File " + carsFile.getAbsolutePath() + "not found.\n");
				System.exit(1);
			}
			System.out.println("Found file: " +carsFile.getAbsolutePath());
			System.out.println("-- Now reading XML content --");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			try {
				dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(carsFile);


				System.out.println("File XML parsed. ");

				doc.getDocumentElement().normalize();
				System.out.println
				("Root element: " 
						+doc.getDocumentElement().getNodeName());

				NodeList nodeList = doc.getElementsByTagName("car");
				System.out.println("N. cars: " + nodeList.getLength());

				List<Car> cars = new ArrayList<>();

				for (int iNode =0; iNode < nodeList.getLength(); iNode++) {
					Node node = nodeList.item(iNode);
					System.out.println("!\nCurrent Element :" + node.getNodeName());
					if(node.getNodeType()== Node.ELEMENT_NODE) {
						Element elem = (Element) node;  // QUESTO E' UN CASTING

						NamedNodeMap attributesMap = elem.getAttributes(); //devo fare il casting perch� get attributes � un metodo della classe element

						System.out.println(
								"N. attributes: "+attributesMap.getLength());
						System.out.println("Car id: "+ elem.getAttribute("id"));
						String carName = XMLUtils.getXMLPropertyByPath(node, "//name/text()");
						System.out.println("Car name: " +carName);


						String passString = XMLUtils.getXMLAttributesByPath(
								node, "//passengers", "value").get(0);

						System.out.println("Passengers: " + passString);
						int pass = Integer.parseInt(passString);

						
						double range = Double.parseDouble(
								XMLUtils.getXMLAttributesByPath(node, "//range_km", "value").get(0)
								);
						System.out.println("Range (km): " +range);
						EnumEngineType engineType;
						String engineTypeString = XMLUtils.getXMLAttributesByPath(
								node, "//engine_type", "value")
								.get(0)
								.toUpperCase();
						
						switch (engineTypeString) {
						case "THERMICAL":
						engineType = EnumEngineType.THERMICAL;
						break;
						
						case "HYBRID":
							engineType = EnumEngineType.HYBRID;
							break;
							
						case "ELECTRIC":
							engineType = EnumEngineType.ELECTRIC;
							break;
							
					
							
							
						
						
							
						}
					}
				}

				// TASK: CREATE AN OBJECT OF CLASS CAR...

				//Car car = new Car (???? che ci va qua d

			} catch (ParserConfigurationException e) {

				e.printStackTrace();
			} catch (SAXException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}



		} else {
			System.err.println("This program must be used with arguments!\n" +"Terminating");
			System.exit(1);

		}
	}
}