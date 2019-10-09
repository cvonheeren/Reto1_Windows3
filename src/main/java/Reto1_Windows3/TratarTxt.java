package Reto1_Windows3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class TratarTxt {

	public String leerText (String archivoEntraStrg) {
			
		try {
			
			FileReader archivoEntrada = new FileReader(archivoEntraStrg);
			Scanner scan1 = new Scanner(archivoEntrada);
			String textoAcumulado = "";
			
			while (scan1.hasNextLine()) {
				textoAcumulado = textoAcumulado + scan1.nextLine() + "\n";
			}
			scan1.close();
			
			return textoAcumulado; 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	public void escribirTxt(String ruta) {
		
		String escribir = "";
		Scanner reader = new Scanner(System.in);
		System.out.println("escribe algo");
		escribir = reader.next();
		int estado = -1;
		
		ArrayList<String> lineas = new ArrayList<String>();
		
		while (estado != 0) {
			lineas.add(reader.next());
		}
		
		FileWriter fichero = null;
		try {

			fichero = new FileWriter(ruta,true);

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(escribir + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}
 