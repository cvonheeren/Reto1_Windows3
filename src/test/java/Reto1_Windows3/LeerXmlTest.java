package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeerXmlTest {

LeerFormatoXml xml = new LeerFormatoXml();
	
	@Test
	public void test() {
		
		String archivoEntrada = "C:\\WORKSPACE\\Reto1_Windows3\\src\\main\\java\\Reto1_Windows3\\prueba.xml";
		
		
		assertEquals(xml.leerXml(archivoEntrada),"Raiz :alumnos\n" +
								   "Subraiz :alumno\n" +
								   "nombre : Miguel\n" +
								   "apellido : lopez\n" +
								   "edad : 19\n" +
								   "Salario : 10000\n" + "---------------------" +
								   "Raiz :alumnos\n" +
								   "Subraiz :alumno\n" +
								   "nombre : aa\n" +
								   "apellido : bb\n" +
								   "edad : 19\n" +
								   "Salario : 10000\n" + "---------------------\n");
		
		
	}
}
 