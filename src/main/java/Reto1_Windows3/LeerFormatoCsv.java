package Reto1_Windows3;

import java.io.BufferedReader;
import java.io.FileReader;


public class LeerFormatoCsv {

	
	public String leerCsv(String archivoEntraStrg1) {
		
		try {     
			
			BufferedReader br = new BufferedReader(new FileReader(archivoEntraStrg1));
			String line = br.readLine();
			String acumulador = "";
			
			while (null!=line) {
				acumulador = acumulador + line;
				line = br.readLine();
			}
			br.close();
			
			return acumulador;
			
		} catch (Exception e) {
			System.out.println("No se encuentra el archivo");
		}
		
		return "";
	}
	
	
	
}
