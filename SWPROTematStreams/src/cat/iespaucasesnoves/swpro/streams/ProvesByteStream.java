package cat.iespaucasesnoves.swpro.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class ProvesByteStream {

	// mostraBytes. Rep com a paràmetre un String amb la ruta d'un fitxer.
	// Llegeix el fitxer byte a byte i el mostra per consola.
	
	public static void mostraBytes(String ruta) throws IOException{
		try (FileInputStream in = new FileInputStream(ruta)) {
			int c;
			while ((c = in.read()) != -1) {
			char d = (char) c;
			System.out.print(d);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
	


