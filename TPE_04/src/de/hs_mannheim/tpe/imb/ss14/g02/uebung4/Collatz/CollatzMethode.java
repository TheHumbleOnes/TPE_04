package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;

public class CollatzMethode implements Runnable {

    private long start;
    private long ende;

    static Long iterierungen = 0L;

    public CollatzMethode(long start, long ende) {
        this.start = start;
        this.ende = ende;
    }

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
        // System.out.println("Längste Folge mit " + iterierungen +
        // " Iterationen bei Zahl " + max);

    }

    private void maxLength(Long i, Long collatz) {

        if (collatz > iterierungen) {
            iterierungen = collatz;
            CollatzThread.maxIterations = collatz;
            CollatzThread.number = i;
        }

    }

}
