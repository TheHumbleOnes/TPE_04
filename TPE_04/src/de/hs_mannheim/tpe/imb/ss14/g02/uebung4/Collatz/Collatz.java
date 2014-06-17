package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

import java.util.*;

public class Collatz {
	static ArrayList<Long> list = new ArrayList<Long>();

	public static void main(String[] args) {

		coll(200);
		Iterator<Long> i = new Iterator<Long>() {

			private int counter = 0;

			@Override
			public boolean hasNext() {
				if (counter < list.size()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public Long next() {
				return list.get(counter++);
			}

			@Override
			public void remove() {
				list.remove(counter);
			}
		};
	}

	public static void coll(long startwert) {

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

		while (iterator.hasNext()) {
			long wert = iterator.next();
			System.out.print(wert + ",");
		}
	}

}
