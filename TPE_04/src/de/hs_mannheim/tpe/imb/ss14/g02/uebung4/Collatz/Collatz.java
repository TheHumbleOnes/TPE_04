package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

import java.util.*;

public class Collatz {
	private static LinkedList<Long> list = new LinkedList<Long>();

	public static void main(String[] args) {

		coll(200);
		
		
		
	}
	public static LinkedList getList(){
		return list;
	}

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
