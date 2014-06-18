package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testToStringFilm() throws illegalTimeException {
		Saal gruenerSaal = new Saal("Gruener Saal", 200);
		Film barbie = new Film("Barbie - Die Prinzessinnen-Akademie",
				" 81 min", Rating.AB_0, new Zeit(15, 00), gruenerSaal);
		assertEquals("15:00 -- Barbie - Die Prinzessinnen-Akademie"
				+ Rating.AB_0 + " 81 min", barbie.toString());

		Saal blauerSaal = new Saal("Blauer Saal", 250);
		Film batman = new Film("Batman Begins", " 134 min", Rating.AB_12,
				new Zeit("14:00"), blauerSaal);
		assertEquals("14:00 -- Batman Begins" + Rating.AB_12 + " 134 min",
				batman.toString());
	}

	@Test
	public void testToStringSaal() {
		Saal studio = new Saal("Studio", 150);
		assertEquals("Saal 'Studio' (150 Plaetze)", studio.toString());
	}

	@Test
	public void testOhneUhrzeit() throws illegalTimeException {
		Saal kellerloch = new Saal("Kellerloch", 30);
		Film chocolat = new Film("Chocolat", "121 min", Rating.AB_6, new Zeit(
				"17:00"), kellerloch);
		assertEquals("Chocolat" + Rating.AB_6 + " 121 min",
				chocolat.ohneUhrzeit());
	}

}
