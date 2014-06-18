package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

/**
 * Klasse zur Berechnung der Collatz-Reihe
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class CollatzMethode implements Runnable {

	private long anfangswert;
	private long schlusswert;

	static Long iterierungen = 0L;

	/**
	 * Konstruktor der Klasse
	 * 
	 * @param anfangswert
	 *            Startwert
	 * @param endwert
	 *            Endwert
	 */
	public CollatzMethode(long anfangswert, long endwert) {
		this.anfangswert = anfangswert;
		this.schlusswert = endwert;
	}

	/**
	 * Berechnet Collatz-Reihe
	 * 
	 */
	public void run() {

		for (long i = this.anfangswert; i <= this.schlusswert; i++) {

			long tmp = i;
			long collatz = 0;
			while (tmp != 1) {
				if (tmp % 2 == 0) {
					tmp /= 2;
					collatz++;
				} else {
					tmp = ((3 * tmp) + 1);
					collatz++;
				}
			}

			maxLength(i, collatz);

		}

	}

	/**
	 * Findet heraus welche laenge der Collatz-Reihe maximal ist
	 * 
	 * @param i
	 *            Wert der maximalen Iterationen
	 * @param collatz
	 *            Wert der Collatz-Reihe
	 */
	private void maxLength(Long i, Long collatz) {

		if (collatz > iterierungen) {
			iterierungen = collatz;
			CollatzThread.maxIterations = collatz;
			CollatzThread.number = i;
		}

	}

}
