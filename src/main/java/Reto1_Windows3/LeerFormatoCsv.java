package Reto1_Windows3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class LeerFormatoCsv {

	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	
	public String leerCsv(String archivoEntraStrg1) {
		
		try {     
			
			BufferedReader br = new BufferedReader(new FileReader(archivoEntraStrg1));
			String line = br.readLine();
			String acumulador = "";
			
			while (null!=line) {
				String [] fields = line.split(SEPARATOR);
				acumulador = acumulador + Arrays.toString(fields);
				fields = removeTrailingQuotes(fields);
				acumulador = acumulador + Arrays.toString(fields);
				line = br.readLine();
			}
			br.close();
			
			return acumulador;
			
		} catch (Exception e) {
			System.out.println("No se encuentra el archivo");
		}
		
		return "";
	}
	
	private static String[] removeTrailingQuotes(String[] fields) {
		String result[] = new String[fields.length];
		
		for (int i=0;i<result.length;i++) {
			result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
		}
		
		return result;
   }
	
}
