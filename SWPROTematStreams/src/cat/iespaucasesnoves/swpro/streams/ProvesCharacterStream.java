package cat.iespaucasesnoves.swpro.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cat.iespaucasesnoves.swpro.streams.auxiliar.Cronometre;

public abstract class ProvesCharacterStream {

	static Cronometre tempusFugit = new Cronometre();

	// mostraCharacters. Rep com a paràmetre un String amb la ruta del fitxer
	// creat al punt 5. Llegeix el fitxer caràcter a caràcter i el mostra per
	// consola.

	public static void mostraCharacters(String ruta) throws IOException {

		// Amb recursos tanca automàticament l'String
		try (FileInputStream in = new FileInputStream(ruta)) {
			int c;
			tempusFugit.start();
			while ((c = in.read()) != -1) {
				char d = (char) c;
				System.out.print(d);
			}
			tempusFugit.stop();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// escriuCharacters(String desti, String dades) Guarda al fitxer destí el
	// text contingut dins dades.
	public static void escriuCharacters(String desti, String dades)
			throws IOException {
		// Amb recursos tanca automàticament l'String
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

	// copiaCharacters(String origen, String desti) . Copia dins el fitxer destí
	// el contingut del fitxer origen.
	public static void copiaCharacters(String origen, String desti)
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
		mostraCharacters("/home/alumne/Escriptori/lorem.txt");

	}
}
