package Reto1_Windows3;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.Test;


public class LeerFormatoEstandarTest {

	  LeerFormatoEstandar formatoestandar = new LeerFormatoEstandar();
	
	@Test
	public void leerFormatoEstandarTest() {
	   
	   String input = "hola";
	   InputStream in = new ByteArrayInputStream (input.getBytes());
	   System.setIn(in);
	   Scanner reader = new Scanner (System.in);
	   String resultado = "";
	   resultado = formatoestandar.leerFormatoEstandar(reader);
	   assertEquals("hola", resultado);
	   
	}
	

}
