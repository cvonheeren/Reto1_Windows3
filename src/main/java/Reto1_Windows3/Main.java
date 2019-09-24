package Reto1_Windows3;

import java.io.File;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {

		JFileChooser chooser= new JFileChooser();
		chooser.showDialog(null, "Abrir");
		File archivo = chooser.getSelectedFile();
		String archivoEntraStrg = archivo.getAbsolutePath();
		
		LeerTxt leerT = new LeerTxt();
		System.out.println(leerT.leerText(archivoEntraStrg));
	}

}
