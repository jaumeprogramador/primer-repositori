package cat.iespaucasesnoves.swpro.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ProvesStreams extends ProvesCharacterStream {

	public static void main(String[] args) throws IOException {

		mostraCharacters("/home/alumne/Escriptori/lorem.txt");
		System.out.println(tempusFugit.temps() + " milisegons");

	}
}
