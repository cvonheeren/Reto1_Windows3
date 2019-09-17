package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;


public class leerTxtTest {

	LeerTxt leerTxt = new LeerTxt();
	
	@Test
	public void test() {
		String archivoEntraStrg1 = "C:\\workspace\\Reto1_Windows\\Reto1_Windows\\archivoEntrada.txt";
		String archivoTestStrg1 = "C:\\workspace\\Reto1_Windows\\Reto1_Windows\\archivoTest.txt";
		String archivoEntraStrg2 = "kappa";
		String archivoTestStrg2 = "C:\\workspace\\Reto1_Windows\\Reto1_Windows\\archivoTest2.txt";
		
		assertTrue(leerTxt.leerText(archivoEntraStrg1, archivoTestStrg1));
		assertFalse(leerTxt.leerText(archivoEntraStrg2, archivoTestStrg1));
		assertFalse(leerTxt.leerText(archivoEntraStrg1, archivoTestStrg2));
	}

}
