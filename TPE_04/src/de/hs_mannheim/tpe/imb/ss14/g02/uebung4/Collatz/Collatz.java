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
	private static LinkedList<Long> list = new LinkedList<Long>();

	/**
	 * Gibt die laengste Folge aus
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Zahl mit der längesten folge
		coll(999999);
		System.out.println(list);
		System.out.println(list.size());
		
		
	}
	
	/**
	 * Getter-Methode um Liste mit laengster Folge zu bekommen
	 * 
	 * @return Liste
	 */
	public static LinkedList getList(){
		return list;
	}

	/**
	 * Fuegt laengste Folge der Collatz-Reihe zu Liste hinzu
	 * 
	 * @param startwert Startwert der Collatz-Reihe
	 * @return Laengste Folge in der Liste
	 */
	public static LinkedList coll(long startwert) {
		
		long temp = startwert;
		while (temp != 1) {
			if (temp % 2 == 0) {
				temp /= 2;
				list.add(temp);
			} else {
				temp = ((3 * temp) + 1);
				list.add(temp);
			}
		}
		final ListIterator<Long> iterator = list.listIterator();
		return list;
	}

}
