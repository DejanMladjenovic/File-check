package filecheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Filecheck {

	/**Glavna metoda*/
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		//Deklarisi fajl objekat
		File file;
		 
		//Kreiraj skener objekat
		Scanner input = new Scanner(System.in);
		
		do {
			// Pitaj korisnika da unese naziv fajla
			System.out.println("Unesite naziv fajla:");
			String fileName = input.nextLine();

			// Kreiraj fajl objekat
			file = new File(fileName);

			if (!file.exists()) {
				System.out.println("Fajl ne postoji.");
				System.out.println("\nPokusajte ponovo.");
			}
		} while (!file.exists());
		
		//Kreiraj listu
		ArrayList<String> list = new ArrayList<>();
		
		//Ucitaj podatke iz fajla
		input = new Scanner(file);
		while(input.hasNext()){
			list.add(input.next());
		}
		
		//Kreiraj test objekat
		Instrukcije fajl = new Instrukcije();
		
		//Naziv fajla
		System.out.println("Vas fajl: " + file.getAbsolutePath());
		
		//Broj rijeci u fajlu
		System.out.println("Broj rijeci: " + fajl.words(list));
		
		//Broj unikatnih rijeci u fajlu
		System.out.println("Broj unikatnih rijeci: " + fajl.uniqueWords(list));
		
		//Broj recenica u fajlu
		System.out.println("Broj recenica: " + fajl.sentences(list));
		
		//Broj slova u fajlu
		System.out.println("Broj slova u textu: ");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " = " + (int) (fajl.brojSlova(list)[i]));
		}
	}
	
}
