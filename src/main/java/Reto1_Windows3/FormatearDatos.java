package Reto1_Windows3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class FormatearDatos {
	
	DecimalFormat formato = new DecimalFormat("#,###.## ¤");
	
	
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

	public ArrayList<String> formatoANumeros (String tabla) {
		
		ArrayList<String> datos = new ArrayList<String>();
	
		datos = tratarArchivoConDelimitador(tabla, "-");
	
		for (int i = 0; i<datos.size(); i++) {
			if (i % 2 != 0) {
				try {
					datos.set(i, formato.format(Float.parseFloat(datos.get(i))));
				} catch(Exception e){
					datos.set(i,ponerPrecioBien(datos, i));
				}
			}else {
				
				datos.set(i, ponerEnMayuscula(datos.get(i)));
			}
				
		}	
		return datos;
	}
	
	public String ponerEnMayuscula (String titulo) {
		
	      String mayuscula = "";	
					
	      ArrayList<String> parts = tratarArchivoConDelimitador(titulo, " ");
	      
	      for (int i = 0; i<parts.size(); i++) {
	    	  
	    	  mayuscula += parts.get(i).substring(0, 1).toUpperCase() + parts.get(i).substring(1) + " ";
	      }
	      
	      return mayuscula;
		
	}
	
	public void verFormatoBien (String tabla) {
		
		
		String acumular = "";
		ArrayList<String> datos = new ArrayList<String>();
		
		datos = tratarArchivoConDelimitador(tabla, "-");
		
		for (int i = 0; i<datos.size(); i++) {
			if (i % 2 == 0) {
				acumular += "Titulo: " + ponerEnMayuscula(datos.get(i)) + "\n";
			}else {			
				acumular += "Precio: " + ponerPrecioBien(datos, i) + "\n";
			}
			
		}		
		System.out.println(acumular);
	}
	
	public String ponerPrecioBien (ArrayList<String> precio, int posicion) {
		
		String acumular="";
		String[] parts = (precio.get(posicion).split(","));
		acumular += formato.format(Float.parseFloat(parts[0] + "." + parts[1]));
		return acumular;
		
	}
}
