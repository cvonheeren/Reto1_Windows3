package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeerFormatoCsvTest {

	TratarCsv leerC = new TratarCsv();
	
	@Test
	public void test() {
		String archivoEntraStrg1 = "C:\\workspace\\Reto1_Windows3\\archivoEntrada.csv";
		String archivoEntraStrg2 = "C:\\Users\\in1DM3b_01\\Downloads\\datoscsv.csv";
		
		System.out.println(leerC.leerCsv(archivoEntraStrg2));
//		assertEquals(leerC.leerCsv(archivoEntraStrg1), "el vino\nde asuncion");
//		assertEquals(leerC.leerCsv(archivoEntraStrg2), "");
	}

}
