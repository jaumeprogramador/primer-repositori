package cat.iespaucasesnoves.swpro.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class ProvesByteStream {

	// mostraBytes. Rep com a paràmetre un String amb la ruta d'un fitxer.
	// Llegeix el fitxer byte a byte i el mostra per consola.
	public static void mostraBytes(String ruta) throws IOException {
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

	// escriuByte(String desti, String dades) Guarda al fitxer destí el text
	// contingut dins dades.
	public static void escriuByte(String desti, String dades)
			throws IOException {
		try (FileInputStream in = new FileInputStream(dades)) {
			int c;
			while ((c = in.read()) != -1) {
				char d = (char) c;
				FileOutputStream out = new FileOutputStream(desti);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// copiaBytes/String origen, String desti) . Copia dins el fitxer destí el
	// contingut del fitxer origen. Prova-ho amb una imatge que tenguis a
	// l'ordinador.
	public static void copiaBytes(String origen, String desti)
			throws IOException {
		try (FileInputStream in = new FileInputStream(origen)) {
			int c;
			while ((c = in.read()) != -1) {
				FileOutputStream out = new FileOutputStream(desti);
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void main(String[] args) throws IOException {
		mostraBytes("C:/home/alumne/Escriptori/lorem.txt");
		
		
	}
	

}
