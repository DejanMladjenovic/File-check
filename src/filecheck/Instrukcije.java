package filecheck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

/*
 * Klasa sadrzi metode za ucitavanje pdataka iz fajla
 */

public class Instrukcije {
	
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
	
	/**Broj recenica u fajlu*/
	public static int sentences(ArrayList<String> list){
		
		int count = 0;
		for(String s: list){
			if(s.endsWith(".") || s.endsWith("?") || s.endsWith("!"))
				count++;
		}
		
		return count;
	}
	/**Prebrojavanje slova**/
	
	public static char [] brojSlova(ArrayList <String> list){
		char[] charcount = new char[10000];
		// loop to count characters
		for(int i =0; i<list.size(); i++){
		for (char z : list.get(i).toCharArray()) {
			charcount[z]++;

		}
		}
	
		return charcount;
	}
}
