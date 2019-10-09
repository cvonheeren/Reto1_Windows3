package Reto1_Windows3;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;


import org.apache.poi.hwpf.extractor.WordExtractor;


public class LeerFormatoDoc {

	
	public String Leerdoc(String archivoEntraStrg) {
		
		try {
			
			File archivoEntrada = new File(archivoEntraStrg);
			FileInputStream fis = new FileInputStream(archivoEntrada.getAbsolutePath());
			InputStream entradaArch  = fis;
			WordExtractor we = new WordExtractor(entradaArch);
			
			
			String textoAcumulado = we.getText();
				
			we.close();		
			return textoAcumulado;
				
			 
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	
}
