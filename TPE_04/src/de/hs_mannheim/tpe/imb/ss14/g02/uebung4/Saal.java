package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

public class Saal {
    private String name;
    private int sitzplaetze;
    
    public Saal(String name, int sitzplaetze){
    	this.name = name;
    	this.sitzplaetze = sitzplaetze;
    }

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public String getName() {
		return name;
	}

	

}
