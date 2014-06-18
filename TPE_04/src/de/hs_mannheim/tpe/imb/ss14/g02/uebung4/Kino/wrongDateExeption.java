package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

/**
 * Ausgabe einer Exception falls eine ungueltige Startzeit eingegeben wurde
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class wrongDateExeption extends Exception {
	/**
	 * Gibt Exception aus
	 * 
	 * @param exeption
	 */
	public wrongDateExeption(String exeption) {
		System.err.println(exeption);
	}

}
