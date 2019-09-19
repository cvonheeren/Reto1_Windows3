package Reto1_Windows3;

import static org.junit.Assert.*;
import org.junit.Test;


public class leerFormatoEstandarTest {

	leerFormatoEstandar formatoestandar = new leerFormatoEstandar();
	
	@Test
	public void leerFormatoEstandarTest() {
		
		String prueba1 = "hola";
		String prueba2 = "hola";
		String prueba3 = "aaaa";
		
		assertTrue(formatoestandar.leerFormatoEstandar2());

		
	}

}
