package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

public class Film {
    private String name;
    private int laufzeit;
    private String altersfreigabe;
    
    public Film(String name, int laufzeit, String altersfreigabe){
    	this.name = name;
    	this.laufzeit = laufzeit;
    	this.altersfreigabe = altersfreigabe;
    	
    }

	public String getName() {
		return name;
	}


	public int getLaufzeit() {
		return laufzeit;
	}

	public String getAltersfreigabe() {
		return altersfreigabe;
	}

	


}


