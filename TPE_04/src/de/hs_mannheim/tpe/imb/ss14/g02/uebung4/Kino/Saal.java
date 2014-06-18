package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

/**
 * Erstellt die Saele die sich im Kino befinden
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class Saal {
	private String name;
	private int seats;

	/**
	 * Konstruktor der Klasse
	 * 
	 * @param name
	 *            Name des Saals
	 * @param seats
	 *            Anzahl der Sitze im Saal
	 */
	public Saal(String name, int seats) {
		this.name = name;
		this.seats = seats;
	}

	/**
	 * Getter-Methode fuer den Namen
	 * 
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter-Methode fuer die Anzahl der Sitze
	 * 
	 * @return Anzahl der Sitze
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * toString-Methode um Attribute des Saals in String zu casten
	 * 
	 */
	public String toString() {
		return ("Saal " + "'" + this.getName() + "'" + " (" + this.getSeats() + " Plaetze)");
	}

	/**
	 * hashCode-Methode um Saele mit einem hashCode zu versehen
	 * 
	 */
	public int hashCode() {
		return name.hashCode() ^ (int) Double.doubleToLongBits(seats);
	}

	/**
	 * equals-Methode um Saele zu vergleichen
	 * 
	 */
	public boolean equals(Object obj) {
		if ((((Saal) obj).name.equals(name)) && (((Saal) obj).seats == seats))
			return true;
		return false;
	}

}
