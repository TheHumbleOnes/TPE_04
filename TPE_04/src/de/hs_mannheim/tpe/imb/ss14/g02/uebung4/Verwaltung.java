package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;





public class Verwaltung {

	static Film[] cinemaxxProgramm = new Film[14];
	static Saal[] cinemaxxSaele = new Saal[4];

	public static void main(String[] args) throws wrongDateExeption {

		Saal blauerSaal = new Saal("Blauer Saal", 250);
		Saal gruenerSaal = new Saal("Gruener Saal", 200);
		Saal studio = new Saal("Studio", 150);
		Saal kellerloch = new Saal("Kellerloch", 30);

		cinemaxxProgramm[0] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("14:00"), blauerSaal);
		cinemaxxProgramm[1] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("17:00"), blauerSaal);
		cinemaxxProgramm[2] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("20:00"), blauerSaal);
		cinemaxxProgramm[3] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("21:00"), blauerSaal);
		cinemaxxProgramm[4] = new Film("Ice Age 3", "90 Minuten", Rating.AB_0,
				new Zeit("17:00"), gruenerSaal);
		cinemaxxProgramm[5] = new Film("Ice Age 3", "90 Minuten", Rating.AB_0,
				new Zeit("19:00"), gruenerSaal);
		cinemaxxProgramm[6] = new Film("Ice Age 3", "90 Minuten", Rating.AB_0,
				new Zeit("15:00"), studio);
		cinemaxxProgramm[7] = new Film("Barbie - Die Prinzessinnen-Akademie",
				"81 Minuten", Rating.AB_0, new Zeit("15:00"), gruenerSaal);
		cinemaxxProgramm[8] = new Film("Machete", "100 Minuten", Rating.AB_16,
				new Zeit("21:00"), gruenerSaal);
		cinemaxxProgramm[9] = new Film("Trainspotting", "89 Minuten",
				Rating.AB_18, new Zeit("17:00"), studio);
		cinemaxxProgramm[10] = new Film("Pulp Fiction", "148 Minuten",
				Rating.AB_16, new Zeit("20:00"), studio);
		cinemaxxProgramm[11] = new Film("From Dusk till Dawn", "87 Minuten",
				Rating.AB_16, new Zeit("23:00"), studio);
		cinemaxxProgramm[12] = new Film("Chocolat", "121 Minuten", Rating.AB_6,
				new Zeit("20:00"), kellerloch);
		cinemaxxProgramm[13] = new Film("Trainspotting", "89 Minuten",
				Rating.AB_18, new Zeit("23:00"), kellerloch);

		ArrayList<Film> blauerSaalList = new ArrayList<Film>();
		blauerSaalList.add(cinemaxxProgramm[0]);
		blauerSaalList.add(cinemaxxProgramm[1]);
		blauerSaalList.add(cinemaxxProgramm[2]);
		blauerSaalList.add(cinemaxxProgramm[3]);

		ArrayList<Film> gruenerSaalList = new ArrayList<Film>();
		gruenerSaalList.add(cinemaxxProgramm[4]);
		gruenerSaalList.add(cinemaxxProgramm[5]);
		gruenerSaalList.add(cinemaxxProgramm[7]);
		gruenerSaalList.add(cinemaxxProgramm[8]);

		ArrayList<Film> studioList = new ArrayList<Film>();
		studioList.add(cinemaxxProgramm[6]);
		studioList.add(cinemaxxProgramm[9]);
		studioList.add(cinemaxxProgramm[10]);
		studioList.add(cinemaxxProgramm[11]);

		ArrayList<Film> kellerlochList = new ArrayList<Film>();
		kellerlochList.add(cinemaxxProgramm[12]);
		kellerlochList.add(cinemaxxProgramm[13]);

		Map<Saal, ArrayList> karteSaal = new HashMap<Saal, ArrayList>();

		karteSaal.put(blauerSaal, blauerSaalList);
		karteSaal.put(gruenerSaal, gruenerSaalList);
		karteSaal.put(studio, studioList);
		karteSaal.put(kellerloch, kellerlochList);

		Kino cinemaxxMannheim = new Kino("Cinemaxx Mannheim", "Mannheim",
				cinemaxxProgramm, cinemaxxSaele);

		cinemaxxSaele[0] = blauerSaal;
		cinemaxxSaele[1] = gruenerSaal;
		cinemaxxSaele[2] = studio;
		cinemaxxSaele[3] = kellerloch;
		
//		cinemaxxMannheim.gesamtesProgramm();
//		System.out.println();
//		getAlleFilme();
//		getAlleFilme(Sortieren.Name);
//		System.out.println();
//		getAlleFilme(Sortieren.Laufzeit);
//		System.out.println();
//		getAlleFilme(Sortieren.Altersfreigabe);
//		System.out.println();
		getFilmeFuerSaalMitZeiten(blauerSaal);
		
	}

	private static void getAlleFilmeMitZeiten() {
		Comparator<Film> startzeit = new Film.FilmStartzeit();
		Arrays.sort(cinemaxxProgramm, startzeit);

		for (int i = 0; i < cinemaxxProgramm.length; i++) {
			System.out.println(cinemaxxProgramm[i].toString());
		}
		System.out.println();

	}

	private static void getFilmeFuerSaalMitZeiten(Saal k) {
		int zaehler = 0;
		for (int i = 0; i < cinemaxxProgramm.length; i++) {
			if ((cinemaxxProgramm[i].getSaal()).equals(k.getName())) {
				zaehler++;
			}
		}
		Film[] temp = new Film[zaehler];
		int z = 0;
		for (int i = 0; i < cinemaxxProgramm.length; i++) {
			if (cinemaxxProgramm[i].getSaal().equals(k.getName())) {
				temp[z] = cinemaxxProgramm[i];
				z++;
			}
		}
		Comparator<Film> startzeit = new Film.FilmStartzeit();
		Arrays.sort(cinemaxxProgramm, startzeit);

		System.out.println("Saal " + "'" + k.getName() + "'  " + "("
		        + k.getSeats() + " Plaetze)");

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i].toString());
		}

	}

	private static void getAlleFilme() {
		getAlleFilme(Sortieren.Name);
	}

	private static void getAlleFilme(Sortieren s) {
		int count = 0;
		Film[] einfacheFilme = new Film[0];
		for (int j = 0; j < cinemaxxProgramm.length; j++) {
			if (doppeltest(cinemaxxProgramm[j].getName(), einfacheFilme)) {
				einfacheFilme = arrayVergroessern(einfacheFilme);
				einfacheFilme[count] = cinemaxxProgramm[j];
				count++;
			}
		}
		switch (s) {

		case Name:
			Comparator<Film> name = new Film.FilmName();
			Arrays.sort(einfacheFilme, name);
			break;
		case Altersfreigabe:
			Comparator<Film> altersfreigabe = new Film.FilmRating();
			Arrays.sort(einfacheFilme, altersfreigabe);
			break;
		case Laufzeit:
			Comparator<Film> laufzeit = new Film.FilmLaufzeit();
			Arrays.sort(einfacheFilme, laufzeit);

			break;
		default:
			Comparator<Film> name1 = new Film.FilmName();
			Arrays.sort(einfacheFilme, name1);

		}
		 for (int i = 0; i < einfacheFilme.length; i++) {
		 System.out.println(einfacheFilme[i].ohneUhrzeit());
	 } 
		 //brauchen wir das wirklich?
	}

	public static Film[] arrayVergroessern(Film[] oldArray) {
		Film[] newArray = new Film[oldArray.length + 1];
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}

	// Methode zum Pr�fen auf gleiche Namen im Array
	public static boolean doppeltest(String namen, Film[] filme) {

		for (int i = 0; i < filme.length; i++) {
			if (namen.equals(filme[i].getName())) {
				return false;
			}
		}
		return true;
	}

	public static void toString(Kino kino) {

		System.out.println(kino.getName());

		for (int i = 0; i < cinemaxxSaele.length; i++) {
			getFilmeFuerSaalMitZeiten(cinemaxxSaele[i]);
			System.out.println();
		}

	}
}
