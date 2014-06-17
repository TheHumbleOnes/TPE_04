package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

public class CollatzThread {

    public static Long number;
    public static Long maxIterations;

    public static void main(String[] args) throws InterruptedException {

        CollatzMethode c1 = new CollatzMethode(1, 2500000);
        CollatzMethode c2 = new CollatzMethode(25000001, 500000000);
        CollatzMethode c3 = new CollatzMethode(5000001, 7500000);
        CollatzMethode c4 = new CollatzMethode(7000001, 10000000);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Längste Folge mit " + maxIterations
                + " Iterationen bei Zahl " + number);

    }
}
