package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;



public class Saal {
    private String name;
    private int seats;

    public Saal(String name, int seats) {
        this.setName(name);
        this.setSeats(seats);
    }

    public int getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSeats(int seats) {
        this.seats = seats;
    }
    
    

}
