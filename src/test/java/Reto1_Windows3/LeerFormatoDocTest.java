package Reto1_Windows3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeerFormatoDocTest {

	LeerFormatoDoc leerDocu = new LeerFormatoDoc();
	
	@Test
	public void test() {
		String archivoEntraStrg1 = "C:\\workspace\\Reto1_Windows3\\archivoEntrada.docx";
		
		//assertEquals(leerDocu.Leerdoc(archivoEntraStrg1), "El vino\nque vende Asunción\nno es blanco ni tinto\nni tiene color.\n");
		System.out.println(leerDocu.Leerdoc(archivoEntraStrg1));
	}

}
