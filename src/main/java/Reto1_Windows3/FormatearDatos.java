package Reto1_Windows3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class FormatearDatos {
	
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
		DecimalFormat formato = new DecimalFormat("#,###.## �");
		ArrayList<String> datos = new ArrayList<String>();
	
		datos = tratarArchivoConDelimitador(tabla, "-");
	
		for (int i = 0; i<datos.size(); i++) {
			if (i % 2 != 0) {
				try {
					datos.set(i, formato.format(Float.parseFloat(datos.get(i))));
				} catch(Exception e){
					String[] parts = (datos.get(i).split(","));
					datos.set(i, formato.format(Float.parseFloat(parts[0] + "." + parts[1])));
				}
			}else {
				
				datos.set(i, ponerEnMayuscula(datos.get(i)));
			}
				
		}	
		return datos;
	}
	
	public String ponerEnMayuscula (String titulo) {
		
	      String mayuscula = "";	
					
	      String[] parts = titulo.split(" ");
	      
	      for (int i = 0; i<parts.length; i++) {
	    	  
	    	  mayuscula += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1) + " ";
	      }
	      
	      return mayuscula;
		
	}
}
