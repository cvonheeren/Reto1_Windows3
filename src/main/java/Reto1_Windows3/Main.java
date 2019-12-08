package Reto1_Windows3;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
public class Main { 

	public static void main(String[]  args) {
		
		 
		JFileChooser chooser= new JFileChooser();
		
		
		Scanner reader = new Scanner (System.in);
		int tipo = 0;
		
//		System.out.println("Eliga el tipo de archivo:");
//		System.out.println("1. Leer .txt\n2. Leer .xml\n3. Leer .csv\n4. Leer desde la entrada estandar\n5. Escribir en txt");
		System.out.print("Introduzca el numero 7: ");
		tipo = reader.nextInt();
		System.out.println("");
			
			if (tipo == 1) {
					
				
				chooser.showDialog(null, "Abrir");
				File archivo = chooser.getSelectedFile();
				String archivoEntraStrg = archivo.getAbsolutePath();
				
				TratarTxt leerTxt = new TratarTxt();
				System.out.println(leerTxt.leerText(archivoEntraStrg));
				
			
			}
			
			if (tipo == 2) {
				
				
				chooser.showDialog(null, "Abrir");
				File archivo = chooser.getSelectedFile();
				String archivoEntraStrg = archivo.getAbsolutePath();
				
				LeerFormatoXml leerXml = new LeerFormatoXml();
				System.out.println(leerXml.leerXml(archivoEntraStrg));
				
				
			}
			
			if (tipo == 3) {
	
				chooser.showDialog(null, "Abrir");
				File archivo = chooser.getSelectedFile();
				String archivoEntraStrg = archivo.getAbsolutePath();
				
				TratarCsv leerCsv = new TratarCsv();
				System.out.println(leerCsv.leerCsv(archivoEntraStrg));
				
			}
			
			if (tipo == 4) {
				
				LeerFormatoEstandar leerFormatoEstandar = new LeerFormatoEstandar();
				System.out.println(leerFormatoEstandar.leerFormatoEstandar());
				
			}
			
			if (tipo == 5) {

				chooser.showDialog(null, "Abrir");
				File archivo = chooser.getSelectedFile();
				String archivoEntraStrg = archivo.getAbsolutePath();
				
				TratarTxt escribirTxt = new TratarTxt();
				escribirTxt.escribirTxt(archivoEntraStrg);
			}
			
			if (tipo == 6) {
				chooser.showDialog(null, "Abrir");
				File archivo = chooser.getSelectedFile();
				String archivoEntraStrg = archivo.getAbsolutePath();
				
				
				TratarCsv csv = new TratarCsv();
				System.out.println("¿Cuantas columnas vas introducir?");
				int tamanio = reader.nextInt();
				String[] datos = csv.escribirArray(tamanio);
				csv.escribirCsv(archivoEntraStrg, datos);
			}
			
			if (tipo == 7) {
							
				FormatearDatos format = new FormatearDatos();

				chooser.showDialog(null, "Abrir");
				File archivo = chooser.getSelectedFile();
				String archivoEntraStrg = archivo.getAbsolutePath();
						
				TratarCsv csv = new TratarCsv();
				format.formatoANumeros(csv.leerCsv(archivoEntraStrg));
				format.verFormatoBien(format.guardardatosbien);

			}
				
		reader.close();
		
	
	}
}
