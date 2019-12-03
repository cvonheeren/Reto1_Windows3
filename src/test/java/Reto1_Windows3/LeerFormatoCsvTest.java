package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeerFormatoCsvTest {

	TratarCsv leerC = new TratarCsv();
	
	@Test
	public void test() {
		String archivoEntraStrg1 = "C:\\workspace\\Reto1_Windows3\\archivoEntrada.csv";
		String archivoEntraStrg2 = "kappa";
		
		assertEquals(leerC.leerCsv(archivoEntraStrg1), "el;vinode;asuncion");
		assertEquals(leerC.leerCsv(archivoEntraStrg2), "");
	}

}
