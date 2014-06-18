package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

/**
 * Eigene Zeit-Klasse um Filmen eine Startzeit geben zu koennen
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class Zeit {
	private int hour;
	private int minute;
	private String hhmm;

	/**
	 * Gibt der Zeit ein einheitliches Format (00:00 Uhr bis 23:59 Uhr)
	 * 
	 * @param zeit
	 *            Eingegebene Startzeit
	 * @throws wrongDateExeption
	 *             Fehlermeldung falls eine ungueltige Uhrzeit eingegeben wurde
	 */
	public Zeit(String zeit) throws wrongDateExeption {
		if (zeit.length() > 5) {
			throw new wrongDateExeption(
					"Kein korrekte Zeitangabe, Text zu lang!");
		} else if (!zeit.contains(":")) {
			throw new wrongDateExeption("Kein korrektes Datumsformat angegeben");
		} else {
			int temphour = Integer.parseInt(zeit.substring(0, 2));
			int tempmin = Integer.parseInt(zeit.substring(3));
			if (checkDate(temphour, tempmin)) {
				this.hour = temphour;
				this.minute = tempmin;
			}
		}
	}

	/**
	 * Konstruktor der Klasse
	 * 
	 * @param hour
	 *            Stunden
	 * @param minute
	 *            Minuten
	 */
	public Zeit(int hour, int minute) {
		if (checkDate(hour, minute)) {
			this.hour = hour;
			this.minute = minute;

		}
	}

	/**
	 * Ueberprueft ob die Zeit im vorgegebenen Rahmen liegt (00:00 Uhr bis 23:59
	 * Uhr)
	 * 
	 * @param hour
	 *            Stunde
	 * @param minute
	 *            Minute
	 * @return true
	 * @return false
	 */
	private boolean checkDate(int hour, int minute) {
		if (hour > 24) {
			return false;
		} else if (minute > 59) {
			return false;
		}
		return true;
	}

	/**
	 * toString-Methode um gewuenschte Zeit in einen String zu casten
	 * 
	 */
	public String toString() {
		if (minute < 10) {
			this.hhmm = hour + ":" + "0" + minute;
		} else {
			this.hhmm = hour + ":" + minute;
		}
		return hhmm;

	}

	/**
	 * hashCode-Methode um Startzeit mit einem HashCode zu versehen
	 * 
	 */
	@Override
	public int hashCode() {

		int result;
		result = hour * 100;
		result = result + minute;
		return result;
	}

	/**
	 * equals-Methode um Startzeiten vergleichen zu koennen
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zeit other = (Zeit) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
}
