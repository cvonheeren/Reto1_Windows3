package Reto1_Windows3;

import java.util.Scanner;

public class leerFormatoEstandar {

	public boolean leerFormatoEstandar2() {
		
		Scanner reader1 = new Scanner (System.in);
		Scanner reader2 = new Scanner (System.in);
		
	
		
		boolean igual = true;
		
	
		try {
			String prueba1 = reader1.nextLine();
			String prueba2 = reader2.nextLine();
			
			while(igual && prueba1 != null && prueba2 != null) {
				if(!prueba1.equals(prueba2)) {
					igual = false;
				}
					
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	
		return false;
}

}
