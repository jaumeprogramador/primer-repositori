package cat.iespaucasesnoves.swpro.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import cat.iespaucasesnoves.swpro.streams.auxiliar.Cronometre;

public abstract class ProvesBufferedStream {

	static Cronometre tempusFugit = new Cronometre();

	// mostraLine. Rep com a paràmetre un String amb la ruta del fitxer de text
	// amb accents. Llegeix el fitxer línia a línia i el mostra per consola.
	// Amb recursos tanca automàticament l'String

	public static void mostraLine(String ruta) throws IOException {

		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));

			String line = null;
			tempusFugit.start();
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			tempusFugit.stop();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

	// escriuLine(String desti, String[] dades) Guarda al fitxer destí el text
	// contingut dins l'array de cadenes dades. Al fitxer s'ha de veure cada
	// string en una línia.
	public static void escriuLine(String desti, String[] dades)
			throws IOException {
	
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader ab = new BufferedReader(isr);

    
    dades = new String[40];

    for(int i=0;i<dades.length;i++)
    {
        System.out.println("Enter data");
        dades[i] = ab.readLine();
    }             


	}

	public static void main(String[] args) throws IOException {
		System.out.println("Mostra Line, ruta amb accents: \n");
		mostraLine("/home/alumne/Escriptori/loremAccentuació.txt");
		System.out.println(tempusFugit.temps());

	}

}
