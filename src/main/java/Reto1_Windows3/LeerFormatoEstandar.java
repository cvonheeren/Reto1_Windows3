package Reto1_Windows3;

import java.util.Scanner;

public class LeerFormatoEstandar {

	public String leerFormatoEstandar(Scanner reader) {
		
		String cadena = "";			
		System.out.print ("Introduce un texto: ");
		cadena = reader.next();
		reader.close();
		return cadena;
		
		
}

}
