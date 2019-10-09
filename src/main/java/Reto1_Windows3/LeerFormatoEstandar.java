package Reto1_Windows3;

import java.util.Scanner;

public class LeerFormatoEstandar {

	
	public  String leerFormatoEstandar() {
		
		String cadena = "";	
		
		Scanner reader = new Scanner(System.in);
		try {
					
			System.out.print ("Introduce un texto: ");
			cadena = reader.next();
		}
		catch(Exception e){
			
		}
		
		reader.close();
		return cadena;
		
		
}

}
