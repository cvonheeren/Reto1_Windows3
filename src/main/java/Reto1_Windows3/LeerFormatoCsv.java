package Reto1_Windows3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class LeerFormatoCsv {

	
	public String leerCsv(String archivoEntraStrg1) {
		
		try {     
			
			BufferedReader br = new BufferedReader(new FileReader(archivoEntraStrg1));
			String line = br.readLine();
			String acumulador = "";
			int i=1;
			
			while (null!=line) {

				String[] parts = line.split(";");
				acumulador = acumulador + "\n" + i + ". " + Arrays.toString(parts) + "\n---------------------------------------------------------------------------------";
				i++;
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
