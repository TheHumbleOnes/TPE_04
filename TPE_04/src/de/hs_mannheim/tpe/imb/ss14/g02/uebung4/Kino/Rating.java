package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

/**
 * Enumeration die verschiedene Altersfreigaben fuer laufende Filme enthaelt
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public enum Rating {

	AB_0("[Ohne Altersbeschraenkung]"), AB_6("[Ab 6 Jahren]"), AB_12(
			"[Ab 12 Jahren]"), AB_16("[Ab 16 Jahren]"), AB_18(
			"[Ohne Jugendfreigabe]");

	private String freigabe;

	/**
	 * Konstruktor der Enum
	 * 
	 * @param freigabe
	 *            Altersfreigabe
	 */
	private Rating(String freigabe) {
		this.setRating(freigabe);
	}

	/**
	 * Getter-Methode fuer die Altersfreigabe
	 * 
	 * @return Altersfreigabe
	 */
	public String getRating() {
		return freigabe;
	}

	/**
	 * Setter-Methode fuer die Altersfreigabe
	 * 
	 * @param freigabe
	 *            Angepasste Altersfreigabe
	 */
	private void setRating(String freigabe) {
		this.freigabe = freigabe;
	}

	/**
	 * toString-Methode um die Altersfreigabe in String zu casten
	 * 
	 */
	public String toString() {
		return this.freigabe;
	}

}
