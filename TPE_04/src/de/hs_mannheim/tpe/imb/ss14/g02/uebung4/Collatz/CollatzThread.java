package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

public class CollatzThread {

	public static void main(String[] args) throws InterruptedException {

		CollatzMethode c1 = new CollatzMethode(1, 250000);
		CollatzMethode c2 = new CollatzMethode(250001, 500000);
		CollatzMethode c3 = new CollatzMethode(500001, 750000);
		CollatzMethode c4 = new CollatzMethode(750001, 1000000);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
//		t1.join();
//		t2.join();
//		t3.join();
//		t4.join();
	}
}
