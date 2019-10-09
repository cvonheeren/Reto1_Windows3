package Reto1_Windows3;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class LeerFormatoXml {
	

	public  String leerXml(String archivoEntrada){
		
		String datos = "";
		
		try {

			File fXmlFile = new File(archivoEntrada);
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			doc.getDocumentElement().normalize();
					
			NodeList nList = doc.getElementsByTagName("alumno");
					

			for (int temp = 0; temp < nList.getLength(); temp++) {
 
				Node nNode = nList.item(temp);
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					
					datos = datos +
					"Raiz :" + doc.getDocumentElement().getNodeName() + "\n" +
					"Subraiz :" + nNode.getNodeName() + "\n" +
					"nombre : " + eElement.getElementsByTagName("nombre").item(0).getTextContent() + "\n" +
					"apellido : " + eElement.getElementsByTagName("apellido").item(0).getTextContent() + "\n" +
					"edad : " + eElement.getElementsByTagName("edad").item(0).getTextContent() + "\n" +
					"Salario : " + eElement.getElementsByTagName("salario").item(0).getTextContent()+ "\n" + "---------------------" + "\n";

				} 
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
			return datos;
			
		  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * try {

			File fXmlFile = new File("C:\\WORKSPACE\\Reto1_Windows3\\src\\main\\java\\Reto1_Windows3\\prueba.xml");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					
			NodeList nList = doc.getElementsByTagName("staff");
					
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("Staff id : " + eElement.getAttribute("id"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		  }
	 */
}
