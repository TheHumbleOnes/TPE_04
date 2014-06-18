package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

import java.util.*;

/**
 * Erstellt ein Kino mit seinen Eigenschaften
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class Kino {
	private String name;
	private String Stadt;
	private Film[] film;
	private Saal[] saal;
	private HashMap<Integer, Saal> saele = new HashMap<>();

	/**
	 * Kontruktor der Klasse
	 * 
	 * @param name
	 *            Name des Kinos
	 * @param Stadt
	 *            Stadt in der sich das Kino befindet
	 * @param film
	 *            Filme die im Kino laufen
	 * @param saal
	 *            Saele die das Kino beinhaltet
	 */
	public Kino(String name, String Stadt, Film[] film, Saal[] saal) {
		this.name = name;
		this.Stadt = Stadt;
		this.saal = saal;
		this.film = film;

	}

	/**
	 * Fuegt einen Saal im Kino hinzu
	 * 
	 * @param saal
	 *            Uebergebener Saal wird dem Kino hinzugefuegt
	 */
	public void addSaal(Saal saal) {
		saele.put(saal.hashCode(), saal);
	}

	/**
	 * Erstellt eine HashMap der Saele die das Kino umfasst
	 * 
	 * @return Saele
	 */
	public HashMap<Integer, Saal> getSaele() {
		return this.saele;
	}

	/**
	 * Getter-Methode fuer den Kinonamen
	 * 
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter-Methode fuer die Stadt
	 * 
	 * @return Stadt
	 */
	public String getStadt() {
		return Stadt;
	}

	/**
	 * Gibt das gesamte Kinoprogramm iterativ aus
	 * 
	 */
	public void gesamtesProgramm() {
		System.out.println(name + " in " + Stadt);
		for (Saal s : saal) {

			Verwaltung.getFilmeFuerSaalMitZeiten(s);
			System.out.println();

		}
	}
}
