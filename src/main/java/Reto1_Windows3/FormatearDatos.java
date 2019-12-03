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
           System.out.println(datos.get(i));
           i++;
       }
       
       return datos;
	}

	public ArrayList<String> formatoANumeros (String tabla) {
		DecimalFormat formato = new DecimalFormat("#,###.## ¤");
		ArrayList<String> datos = new ArrayList<String>();
	
		datos = tratarArchivoConDelimitador(tabla, " ");
	
		for (int i = 0; i<datos.size(); i++) {
			if (i % 2 != 0) {
				try {
					datos.set(i, formato.format(Float.parseFloat(datos.get(i))));
				} catch(Exception e){
					String[] parts = (datos.get(i).split(","));
					datos.set(i, formato.format(Float.parseFloat(parts[0] + "." + parts[1])));
				}
			}
		}	
		return datos;
	}
}
