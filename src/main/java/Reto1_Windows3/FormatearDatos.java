package Reto1_Windows3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class FormatearDatos {
	
	DecimalFormat formato = new DecimalFormat("#,###.## ¤");
	ArrayList<String> guardardatosbien = new ArrayList<String>();
	
	
	public ArrayList<String> tratarArchivoConDelimitador (String tabla, String delimitador) {
		
	   StringTokenizer tokens = new StringTokenizer(tabla, delimitador);
	       
       ArrayList<String> datos = new ArrayList<String>();
       
       int i=0;
     
       while(tokens.hasMoreTokens()){
           String str=tokens.nextToken();
           datos.add(str);
           i++;
       }
       
       return datos;
	}

	public void formatoANumeros (ArrayList<String> tabla) {
		
		ArrayList<String> datos = new ArrayList<String>();
		
	
		for (int i = 0; i<tabla.size(); i++) {
		datos = tratarArchivoConDelimitador(tabla.get(i), "-");
	
		for (int y=0; y<datos.size();y++) {
			if (y % 2 != 0) {
				try {
					guardardatosbien.add(formato.format(Float.parseFloat(datos.get(y))));
				} catch(Exception e){
					String[] parts = (datos.get(y).split(","));
					guardardatosbien.add(formato.format(Float.parseFloat(parts[0] + "." + parts[1])));
				
				}
			}else {
				
				guardardatosbien.add(ponerEnMayuscula(datos.get(y)));
			}
		}	
		}
	
	}
	
	public String ponerEnMayuscula (String titulo) {
		
	      String mayuscula = "";	
					
	      ArrayList<String> parts = tratarArchivoConDelimitador(titulo, " ");
	      
	      for (int i = 0; i<parts.size(); i++) {
	    	  
	    	  mayuscula += parts.get(i).substring(0, 1).toUpperCase() + parts.get(i).substring(1) + " ";
	      }
	      
	      return mayuscula;
		
	}
	
	public void verFormatoBien (ArrayList<String> tabla) {
		
		int fila = tabla.size() / 2;
		int fila2 = 1;
		int fila3 = 1;
		
		String arraybidimensional[][]=new String [fila+1][2];

		arraybidimensional[0][0]= "TITULO";
		arraybidimensional[0][1]= "        PRECIO";
		
		for (int i = 0; i<tabla.size(); i++) {
			
			if (i % 2 == 0) {				
				arraybidimensional[fila2][0] = guardardatosbien.get(i);
				fila2 +=1;	
			}else {			
				arraybidimensional[fila3][1] = guardardatosbien.get(i);
				fila3 +=1;
			}
			
		}
		recorrerArrayBidimensinal(arraybidimensional);
	}
	
	public void recorrerArrayBidimensinal(String[][] array) {
		
		for (int x=0; x < array.length; x++) 
		 {
		    for (int y=0; y < array[x].length; y++) 
		    {

		     System.out.print(array[x][y] + "\t");
		    }
		  System.out.println();

		 }
	}
}
