package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeerXmlTest {

LeerFormatoXml xml = new LeerFormatoXml();
	
	@Test
	public void test() {
		
		String archivoEntrada = "C:\\WORKSPACE\\Reto1_Windows3\\src\\main\\java\\Reto1_Windows3\\prueba.xml";
		
		
		assertEquals(xml.leerXml(archivoEntrada),"Raiz :alumnos\nSubraiz :alumno\nnombre : Miguel\napellido : lopez\nedad : 19\nSalario : 10000\n---------------------Raiz :alumnos\nSubraiz :alumno\nnombre : aa\napellido : bb\nedad : 19\nSalario : 10000\n---------------------\n");
		
		
	}
}
  