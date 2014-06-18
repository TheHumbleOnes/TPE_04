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

	private long start;
	private long ende;

	static Long iterierungen = 0L;

	/**
	 * Konstruktor der Klasse
	 * 
	 * @param start
	 *            Startwert
	 * @param ende
	 *            Endwert
	 */
	public CollatzMethode(long start, long ende) {
		this.start = start;
		this.ende = ende;
	}

	/**
	 * Berechnet Collatz-Reihe
	 * 
	 */
	public void run() {

		for (long i = this.start; i <= this.ende; i++) {

			long temp = i;
			long collatz = 0;
			while (temp != 1) {
				if (temp % 2 == 0) {
					temp /= 2;
					collatz++;
				} else {
					temp = ((3 * temp) + 1);
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
