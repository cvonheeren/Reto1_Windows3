package Reto1_Windows3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.opencsv.CSVWriter;


public class TratarCsv {

	
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
	
	public void escribirCsv(String archivoEntraStrg1, String[] datos) {
		String archCSV = archivoEntraStrg1;
		CSVWriter writer;
		
		try {
			writer = new CSVWriter(new FileWriter(archCSV));
			writer.writeNext(datos);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String[] escribirArray(int tamanio) {
		String[] aux = new String[tamanio];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < aux.length; i++) {
			System.out.println("Columna " + i + ": ");
			aux[i] = sc.next();
		}
		sc.close();
		
		return aux;
	}
	
}
