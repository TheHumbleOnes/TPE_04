package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

import java.util.Comparator;

public class Film {
    private String name;
    private String laufzeit;
    private Rating altersfreigabe;
    private Zeit startzeit;
    private Saal saal;

    public Film(String name, String laufzeit, Rating altersfreigabe,
            Zeit startzeit, Saal saal) {
        this.name = name;
        this.laufzeit = laufzeit;
        this.altersfreigabe = altersfreigabe;
        this.startzeit = startzeit;
        this.saal = saal;

    }

    static class FilmName implements Comparator<Film> {

        @Override
        public int compare(Film film1, Film film2) {
            if (film1.getName() == null && film2.getName() == null) {
                return 0;
            }
            if (film1.getName() == null) {
                return 1;
            }
            if (film2.getName() == null) {
                return -1;
            }
            return film1.getName().compareTo(film2.getName());
        }
    }

    static class FilmRating implements Comparator<Film> {

        @Override
        public int compare(Film film1, Film film2) {
            if (film1.getAltersfreigabe() == null
                    && film2.getAltersfreigabe() == null) {
                return 0;
            }
            if (film1.getAltersfreigabe() == null) {
                return 1;
            }
            if (film2.getAltersfreigabe() == null) {
                return -1;
            }
            return film1.getAltersfreigabe().compareTo(
                    film2.getAltersfreigabe());
        }
    }

    static class FilmStartzeit implements Comparator<Film> {

        @Override
        public int compare(Film film1, Film film2) {
            if (film1.getStartzeit().toString() == null
                    && film2.getStartzeit().toString() == null) {
                return 0;
            }
            if (film1.getStartzeit().toString() == null) {
                return 1;
            }
            if (film2.getStartzeit().toString() == null) {
                return -1;
            }
            return film1.getStartzeit().toString()
                    .compareTo(film2.getStartzeit().toString());
        }
    }

    static class FilmLaufzeit implements Comparator<Film> {

        @Override
        public int compare(Film film1, Film film2) {
            if (film1.getLaufzeit() == null && film2.getLaufzeit() == null) {
                return 0;
            }
            if (film1.getLaufzeit() == null) {
                return 1;
            }
            if (film2.getLaufzeit() == null) {
                return -1;
            }
            return film1.getLaufzeit().compareTo(film2.getLaufzeit());
        }
    }

    public Zeit getStartzeit() {
        return startzeit;
    }

    public String getSaal() {
        return this.saal.getName();
    }

    public String getName() {
        return name;
    }

    public String getLaufzeit() {
        return laufzeit;
    }

    public Rating getAltersfreigabe() {
        return altersfreigabe;
    }

    public String toString() {
        String ausgabe = this.startzeit + " -- " + this.name + " "
                + this.altersfreigabe + " " + this.laufzeit;
        return ausgabe;
    }

    public String ohneUhrzeit() {
        String ausgabe = this.name + " " + this.altersfreigabe + " "
                + this.laufzeit;
        return ausgabe;
    }
}
