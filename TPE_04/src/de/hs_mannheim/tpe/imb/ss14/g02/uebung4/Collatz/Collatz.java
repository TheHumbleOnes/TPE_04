package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

import java.util.*;

/**
 * Hauptprogramm um Collatz-Reihe ausgeben zu koennen
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class Collatz {
	private static LinkedList<Long> folge = new LinkedList<Long>();

	/**
	 * Gibt die laengste Folge aus
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Zahl mit der längesten folge
		coll(999999);
		System.out.println(folge);
		System.out.println(folge.size());

	}

	/**
	 * Getter-Methode um Liste mit laengster Folge zu bekommen
	 * 
	 * @return Liste
	 */
	public static LinkedList getList() {
		return folge;
	}

	/**
	 * Fuegt laengste Folge der Collatz-Reihe zu Liste hinzu
	 * 
	 * @param startwert
	 *            Startwert der Collatz-Reihe
	 * @return Laengste Folge in der Liste
	 */
	public static LinkedList coll(long startwert) {

		long tmp = startwert;
		while (tmp != 1) {
			if (tmp % 2 == 0) {
				tmp /= 2;
				folge.add(tmp);
			} else {
				tmp = ((3 * tmp) + 1);
				folge.add(tmp);
			}
		}
		final ListIterator<Long> iterator = folge.listIterator();
		return folge;
	}

}
