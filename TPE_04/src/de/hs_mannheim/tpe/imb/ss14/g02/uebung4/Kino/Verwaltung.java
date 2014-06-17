package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;





public class Verwaltung {

	static Film[] filme = new Film[14];
	static Saal[] saele = new Saal[4];

	public static void main(String[] args) throws wrongDateExeption {

		Saal blauerSaal = new Saal("Blauer Saal", 250);
		Saal gruenerSaal = new Saal("Grüner Saal", 200);
		Saal studio = new Saal("Studio", 150);
		Saal kellerloch = new Saal("Kellerloch", 30);

		filme[0] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("14:00"), blauerSaal);
		filme[1] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("17:00"), blauerSaal);
		filme[2] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("20:00"), blauerSaal);
		filme[3] = new Film("Batman Begins", "134 Minuten",
				Rating.AB_12, new Zeit("23:00"), blauerSaal);
		filme[4] = new Film("Ice Age 3", "90 Minuten", Rating.AB_0,
				new Zeit("17:00"), gruenerSaal);
		filme[5] = new Film("Ice Age 3", "90 Minuten", Rating.AB_0,
				new Zeit("19:00"), gruenerSaal);
		filme[6] = new Film("Ice Age 3", "90 Minuten", Rating.AB_0,
				new Zeit("15:00"), studio);
		filme[7] = new Film("Barbie - Die Prinzessinnen-Akademie",
				"81 Minuten", Rating.AB_0, new Zeit("15:00"), gruenerSaal);
		filme[8] = new Film("Machete", "100 Minuten", Rating.AB_16,
				new Zeit("21:00"), gruenerSaal);
		filme[9] = new Film("Trainspotting", "89 Minuten",
				Rating.AB_18, new Zeit("17:00"), studio);
		filme[10] = new Film("Pulp Fiction", "148 Minuten",
				Rating.AB_16, new Zeit("20:00"), studio);
		filme[11] = new Film("From Dusk till Dawn", "87 Minuten",
				Rating.AB_16, new Zeit("23:00"), studio);
		filme[12] = new Film("Chocolat", "121 Minuten", Rating.AB_6,
				new Zeit("20:00"), kellerloch);
		filme[13] = new Film("Trainspotting", "89 Minuten",
				Rating.AB_18, new Zeit("23:00"), kellerloch);

		ArrayList<Film> blauerSaalList = new ArrayList<Film>();
		blauerSaalList.add(filme[0]);
		blauerSaalList.add(filme[1]);
		blauerSaalList.add(filme[2]);
		blauerSaalList.add(filme[3]);

		ArrayList<Film> gruenerSaalList = new ArrayList<Film>();
		gruenerSaalList.add(filme[4]);
		gruenerSaalList.add(filme[5]);
		gruenerSaalList.add(filme[7]);
		gruenerSaalList.add(filme[8]);

		ArrayList<Film> studioList = new ArrayList<Film>();
		studioList.add(filme[6]);
		studioList.add(filme[9]);
		studioList.add(filme[10]);
		studioList.add(filme[11]);

		ArrayList<Film> kellerlochList = new ArrayList<Film>();
		kellerlochList.add(filme[12]);
		kellerlochList.add(filme[13]);

		Map<Saal, ArrayList> karteSaal = new HashMap<Saal, ArrayList>();

		karteSaal.put(blauerSaal, blauerSaalList);
		karteSaal.put(gruenerSaal, gruenerSaalList);
		karteSaal.put(studio, studioList);
		karteSaal.put(kellerloch, kellerlochList);

		Kino cinemaxx = new Kino("Cinemaxx", "Mannheim",
				filme, saele);

		saele[0] = blauerSaal;
		saele[1] = gruenerSaal;
		saele[2] = studio;
		saele[3] = kellerloch;
		
		cinemaxx.gesamtesProgramm();
		System.out.println();
//		getAlleFilme();
//		getAlleFilme(Sortieren.Name);
//		System.out.println();
//		getAlleFilme(Sortieren.Laufzeit);
//		System.out.println();
//		getAlleFilme(Sortieren.Altersfreigabe);
		System.out.println();
//		getFilmeFuerSaalMitZeiten(gruenerSaal);
		
	}

	private static void getAlleFilmeMitZeiten() {
		Comparator<Film> startzeit = new Film.FilmStartzeit();
		Arrays.sort(filme, startzeit);

		for (int i = 0; i < filme.length; i++) {
			System.out.println(filme[i].toString());
		}
		System.out.println();

	}

	public static void getFilmeFuerSaalMitZeiten(Saal k) {
		int zaehler = 0;
		for (int i = 0; i < filme.length; i++) {
			if ((filme[i].getSaal()).equals(k.getName())) {
				zaehler++;
			}
		}
		Film[] temp = new Film[zaehler];
		int z = 0;
		for (int i = 0; i < filme.length; i++) {
			if (filme[i].getSaal().equals(k.getName())) {
				temp[z] = filme[i];
				z++;
			}
		}
		Comparator<Film> startzeit = new Film.FilmStartzeit();
		Arrays.sort(filme, startzeit);

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
		for (int j = 0; j < filme.length; j++) {
			if (doppeltest(filme[j].getName(), einfacheFilme)) {
				einfacheFilme = arrayVergroessern(einfacheFilme);
				einfacheFilme[count] = filme[j];
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

	// Methode zum Prüfen auf gleiche Namen im Array
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

		for (int i = 0; i < saele.length; i++) {
			getFilmeFuerSaalMitZeiten(saele[i]);
			System.out.println();
		}

	}
}
