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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + seats;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saal other = (Saal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (seats != other.seats)
			return false;
		return true;
	}

}
