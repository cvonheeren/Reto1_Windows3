package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;


public class LeerTxtTest {

	TratarTxt leerTxt = new TratarTxt();
	
	@Test
	public void test() {
		String archivoEntraStrg1 = "C:\\workspace\\Reto1_Windows3\\archivoEntrada.txt";
		String archivoEntraStrg2 = "kappa";
		
		assertEquals(leerTxt.leerText(archivoEntraStrg1), "El vino\nque vende Asunción\nno es blanco ni tinto\nni tiene color.\n");
		assertEquals(leerTxt.leerText(archivoEntraStrg2), "");
	}
}
