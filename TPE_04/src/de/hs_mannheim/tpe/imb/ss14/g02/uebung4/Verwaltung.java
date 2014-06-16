package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Verwaltung {

	static Film[] filmecinemaxx = new Film[14];
	static Saal[] saelecinemaxx = new Saal[4];

	public static void main(String[] args) throws wrongDateExeption {

		Saal blauerSaal = new Saal("Blauer Saal", 250);
		Saal gruenerSaal = new Saal("Gruener Saal", 200);
		Saal studio = new Saal("Studio", 150);
		Saal kellerloch = new Saal("Kellerloch", 30);

		filmecinemaxx[0] = new Film("Batman Begins", "134 Minuten", "ab 12 Jahre",
				new Zeit(14, 00), blauerSaal);
		filmecinemaxx[1] = new Film("Batman Begins", "134 Minuten", "ab 12 Jahre",
				new Zeit(17, 00), blauerSaal);
		filmecinemaxx[2] = new Film("Batman Begins", "134 Minuten", "ab 12 Jahre",
				new Zeit(20, 00), blauerSaal);
		filmecinemaxx[3] = new Film("Batman Begins", "134 Minuten", "ab 12 Jahre",
				new Zeit("23:00"), blauerSaal);
		filmecinemaxx[4] = new Film("Ice Age 3", "90 Minuten",
				"ab 0  Jahre (Ohne Altersbeschraenkung)", new Zeit(17, 00),
				gruenerSaal);
		filmecinemaxx[5] = new Film("Ice Age 3", "90 Minuten",
				"ab 0  Jahre (Ohne Altersbeschraenkung)", new Zeit(19, 00),
				gruenerSaal);
		filmecinemaxx[6] = new Film("Ice Age 3", "90 Minuten",
				"ab 0  Jahre (Ohne Altersbeschraenkung)", new Zeit(15, 00),
				studio);
		filmecinemaxx[7] = new Film("Barbie - Die Prinzessinnen-Akademie",
				"81 Minuten", "ab 0  Jahre (Ohne Altersbeschraenkung)", new Zeit(
						15, 00), gruenerSaal);
		filmecinemaxx[8] = new Film("Machete", "100 Minuten",
				"ab 18 Jahre (keine Jugendfreigabe)", new Zeit(21, 00),
				gruenerSaal);
		filmecinemaxx[9] = new Film("Trainspotting", "89 Minuten",
				"ab 18 Jahre (keine Jugendfreigabe)", new Zeit(17, 00), studio);
		filmecinemaxx[10] = new Film("Pulp Fiction", "148 Minuten", "ab 16 Jahre",
				new Zeit(20, 00), studio);
		filmecinemaxx[11] = new Film("From Dusk till Dawn", "87 Minuten",
				"ab 16 Jahre", new Zeit(23, 00), studio);
		filmecinemaxx[12] = new Film("Chocolat", "121 Minuten", "ab 06 Jahre",
				new Zeit(20, 00), kellerloch);
		filmecinemaxx[13] = new Film("Trainspotting", "89 Minuten",
				"ab 18 Jahre (keine Jugendfreigabe)", new Zeit(23, 00),
				kellerloch);

		ArrayList<Film> blauerSaalList = new ArrayList<Film>();
		blauerSaalList.add(filmecinemaxx[0]);
		blauerSaalList.add(filmecinemaxx[1]);
		blauerSaalList.add(filmecinemaxx[2]);
		blauerSaalList.add(filmecinemaxx[3]);

		ArrayList<Film> gruenerSaalList = new ArrayList<Film>();
		gruenerSaalList.add(filmecinemaxx[4]);
		gruenerSaalList.add(filmecinemaxx[5]);
		gruenerSaalList.add(filmecinemaxx[7]);
		gruenerSaalList.add(filmecinemaxx[8]);

		ArrayList<Film> studioList = new ArrayList<Film>();
		studioList.add(filmecinemaxx[6]);
		studioList.add(filmecinemaxx[9]);
		studioList.add(filmecinemaxx[10]);
		studioList.add(filmecinemaxx[11]);

		ArrayList<Film> kellerlochList = new ArrayList<Film>();
		kellerlochList.add(filmecinemaxx[12]);
		kellerlochList.add(filmecinemaxx[13]);

		Map<Saal, ArrayList> karteSaal = new HashMap<Saal, ArrayList>();

		karteSaal.put(blauerSaal, blauerSaalList);
		karteSaal.put(gruenerSaal, gruenerSaalList);
		karteSaal.put(studio, studioList);
		karteSaal.put(kellerloch, kellerlochList);

		Kino cinemaxxMannheim = new Kino("Cinemaxx Mannheim", "Mannheim",
				filmecinemaxx, saelecinemaxx);

		saelecinemaxx[0] = blauerSaal;
		saelecinemaxx[1] = gruenerSaal;
		saelecinemaxx[2] = studio;
		saelecinemaxx[3] = kellerloch;
	}
	private static void getAlleFilmeMitZeiten() {
		Comparator<Film> startzeit = new Film.StartFilmComperator();
		Arrays.sort(filmecinemaxx, startzeit);

		for (int i = 0; i < filmecinemaxx.length; i++) {
			System.out.println(filmecinemaxx[i].toString());
		}
		System.out.println();

	}

	private static void getFilmeFuerSaalMitZeiten(Saal k) {
		int i = 0;
		for (int j = 0; j < filmecinemaxx.length; j++) {
			if ((filmecinemaxx[j].getSaal()).equals(k.getName())) {
				i++;
			}
		}
		Film[] temp = new Film[i];
		int s = 0;
		for (int j = 0; j < filmecinemaxx.length; j++) {
			if (filmecinemaxx[i].getSaal().equals(k.getName())) {
				temp[s] = filmecinemaxx[j];
				s++;
			}
		}
		Comparator<Film> startzeit = new Film.StartFilmComperator();
		Arrays.sort(filmecinemaxx, startzeit);

		System.out.println("Saal " + "'" + k.getName() + "'  " + "("
		        + k.getSeats() + " Plaetze)");

		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[i].toString());
		}

	}

	private static void getAlleFilme() {
		getAlleFilme(Sortierkriterium.Name);
	}

	private static void getAlleFilme(Sortierkriterium s) {
		int count = 0;
		Film[] einfacheFilme = new Film[0];
		for (int j = 0; j < filmecinemaxx.length; j++) {
			if (doppeltest(filmecinemaxx[j].getName(), einfacheFilme)) {
				einfacheFilme = arrayVergroessern(einfacheFilme);
				einfacheFilme[count] = filmecinemaxx[j];
				count++;
			}
		}
		switch (s) {

		case Name:
			Comparator<Film> name = new Film.TitelFilmComperator();
			Arrays.sort(einfacheFilme, name);
			break;
		case Altersfreigabe:
			Comparator<Film> altersfreigabe = new Film.AltersfreigabeComperator();
			Arrays.sort(einfacheFilme, altersfreigabe);
			break;
		case Laufzeit:
			Comparator<Film> laufzeit = new Film.LaufzeitComperator();
			Arrays.sort(einfacheFilme, laufzeit);

			break;
		default:
			Comparator<Film> name1 = new Film.TitelFilmComperator();
			Arrays.sort(einfacheFilme, name1);

		}
//		for (int i = 0; i < einfacheFilme.length; i++) {
//			System.out.println(einfacheFilme[i].ohneUhrzeit());
//		} brauchen wir das wirklich?
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

		for (int i = 0; i < saelecinemaxx.length; i++) {
			getFilmeFuerSaalMitZeiten(saelecinemaxx[i]);
			System.out.println();
		}

	}
}
