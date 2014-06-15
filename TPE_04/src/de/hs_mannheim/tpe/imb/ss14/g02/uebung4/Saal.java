package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

public class Saal {
    private String name;
    private int seats;

    public Saal(String name, int seats) {
        this.setName(name);
        this.setSeats(seats);
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSeats(int seats) {
        this.seats = seats;
    }

    public String toString() {
        return ("Saal " + "'" + this.getName() + "'" + " (" + this.getSeats() + " Plaetze)");
    }

}
