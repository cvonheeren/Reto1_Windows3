package Reto1_Windows3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxt {

public boolean leerText (String archivoEntraStrg, String archivoTestStrg) {
		
		try {
			
			FileReader archivoEntrada = new FileReader(archivoEntraStrg);
			FileReader archivoTest = new FileReader(archivoTestStrg);
			BufferedReader buffer1 = new BufferedReader(archivoEntrada);
			BufferedReader buffer2 = new BufferedReader(archivoTest);
			
			boolean iguales = true;
			
			try {
				String cadenaEntrada = buffer1.readLine();
				String cadenaTest = buffer2.readLine();
				
				while (cadenaEntrada != null && cadenaTest != null && iguales) {
					
					if (!cadenaEntrada.equals(cadenaTest)) 
						iguales = false;
					
					cadenaEntrada = buffer1.readLine();
					cadenaTest = buffer2.readLine();
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return iguales;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
