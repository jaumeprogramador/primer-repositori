package cat.iespaucasesnoves.swpro.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class ProvesByteStream {

	// mostraBytes. Rep com a paràmetre un String amb la ruta d'un fitxer.
	// Llegeix el fitxer byte a byte i el mostra per consola.
	public static void mostraBytes(String ruta) throws IOException {
		try (FileInputStream in = new FileInputStream(ruta)) {
			int c;
			while ((c = in.read()) != -1) {
				System.out.println(c);
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
		//Amb recursos tanca automàticament l'String
		try (FileInputStream in = new FileInputStream(dades)) {
			int c;
			while ((c = in.read()) != -1) {
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
		try (FileInputStream in = new FileInputStream(origen);
				FileOutputStream out = new FileOutputStream(desti);) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		/*
		 * A la classe ProvesStreams crea un mètode anomenat provesByte des d'on
		 * cridis tots els mètodes de l'exercici anterior. Per l'exercici 1,
		 * utilitza com a fitxer origen el que has creat al punt 3, lorem.txt.
		 * Per l'exercici 3, utilitza una imatge o un pdf o zip que tenguis al
		 * disc dur. La còpia ha de quedar idèntica a l'original.
		 */
		// ruta sense lletra unitat com al Windows
		mostraBytes("/home/alumne/Escriptori/lorem.txt");

		copiaBytes("/home/alumne/Escriptori/index.jpeg",
				"/home/alumne/Escriptori/index2.jpeg");

		/*
		 * Copia la lletra de l'himne dels pirates que trobareu a l'aula virtual
		 * a un fitxer txt i pasau-lo com a paràmetre a mostraBytes. Utilitzau
		 * la versió adequada al vostre sistema. Es veu correctament? Explica-ho
		 * amb un println.
		 */
		copiaBytes("/home/alumne/Escriptori/Himne dels pirates UTF-8.txt.zip",
				"/home/alumne/Escriptori/Himne dels pirates UTF-8 COPIA.txt.zip");
		
		System.out.println("Es veu correctament. Deu ser pel format UTF-8");
		
		

	}

}
