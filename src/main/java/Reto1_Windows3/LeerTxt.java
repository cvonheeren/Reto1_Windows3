package Reto1_Windows3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class LeerTxt {

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
}
