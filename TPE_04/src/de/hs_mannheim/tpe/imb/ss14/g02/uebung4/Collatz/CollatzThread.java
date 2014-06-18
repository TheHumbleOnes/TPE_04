package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

/**
 * Threads um die Collatz-Reihen mit mehreren Prozessorkernen berechnen zu
 * koennen
 * 
 * @author Michelle Heiler
 * @author Axel Duenninger
 * @author Luca Frank
 * 
 */
public class CollatzThread {

	public static Long number;
	public static Long maxIterations;

	/**
	 * Threads
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		CollatzMethode reihe1 = new CollatzMethode(1, 1000000);
		CollatzMethode reihe2 = new CollatzMethode(1000001, 1500000);
		CollatzMethode reihe3 = new CollatzMethode(1500001, 1750000);
		CollatzMethode reihe4 = new CollatzMethode(1750001, 2000000);

		Thread thread1 = new Thread(reihe1);
		Thread thread2 = new Thread(reihe2);
		Thread thread3 = new Thread(reihe3);
		Thread thread4 = new Thread(reihe4);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();

		System.out.println("Längste Folge mit " + maxIterations
				+ " Iterationen bei Zahl " + number);

	}
}
