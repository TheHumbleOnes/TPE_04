package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
	
	private Scanner scan = new Scanner(System.in);

	public Kino neuesKino() {
		System.out.println("Kinoname: ");
		String name = scan.nextLine();
		System.out.println("Kinostandort: ");
		String standort = scan.nextLine();

		HashMap<Integer, Saal> saal = neueSaele();
		return new Kino(name, standort, saal);
	}

	private HashMap<Integer, Saal> neueSaele() {

		HashMap<Integer, Saal> saele = new HashMap<>();

		System.out.print("Saalname: ");
		String saalname = scan.nextLine();
		System.out.println("Sitzplätze: ");
		int sitz = scan.nextInt();
		Saal saal = new Saal(saalname, sitz);

		saele.put(saal.hashCode(), saal);

		return saele;
	}

	private Film neuerFilm() {

	}

	// private boolean weitererSaal(){
	// weiter:
	// while(true){
	// System.out.println("Noch einen Saal hinzufügen? (J/N)");
	// String entscheidung = scan.nextLine();
	// if(entscheidung.equals("J"))
	// {
	// return true;
	// }
	// else if(entscheidung.equals("N"))
	// {
	// break weiter;
	// }
	//
	// }
	// }

}
