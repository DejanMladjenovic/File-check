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

		//Kreiraj skener objekat
		Scanner input = new Scanner(System.in);
		
		//Pitaj korisnika da unese naziv fajla
		System.out.println("Unesite naziv fajla:");
		String fileName = input.nextLine();
		
		//Kreiraj fajl objekat
		File file = new File(fileName + ".txt");
		
		if(!file.exists()){
			System.out.println("File doesn't exists.");
			System.exit(0);
		}
		//Kreiraj listu
		ArrayList<String> list = new ArrayList<>();
		
		//Ucitaj podatke iz fajla
		input = new Scanner(file);
		while(input.hasNext()){
			list.add(input.next());
		}
		
		//Naziv fajla
		System.out.println("Vas fajl: " + file.getAbsolutePath());
		
		//Broj rijeci u fajlu
		System.out.println("Broj rijeci: " + words(list));
		
		//Broj unikatnih rijeci u fajlu
		System.out.println("Broj unikatnih rijeci: " + uniqueWords(list));
		
	}
	
	/**Broj rijeci u fajlu*/
	public static int words(ArrayList<String> list){
		
		int words = list.size();
		
		return words;
	}
	
	/**Broj unikatnih rijeci u fajlu*/
	public static int uniqueWords(ArrayList<String> list){
		
		Set<String> set = new HashSet<>(list);
		
		int count = set.size();
		
		return count;
	}

}
