package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.*;

public class Kino {
    private String name;
    private String Stadt;
    private Saal saal;
    //den value muss man gefügig noch ändern da bisher noch nicht klar ist für was man sie braucht
    private HashMap<Saal, Saal> saele = new HashMap();
    
    
    public Kino(String name, String Stadt, Saal saal){
    	this.name = name;
    	this.Stadt = Stadt;
    	this.saal = saal;
    	
    }

    public void addSaal(Saal saal){
    saele.put(saal, saal);	
    }
    public HashMap<Saal,Saal> getseale(){
    	return this.saele;
    }
    
	public String getName() {
		return name;
	}

	public String getStadt() {
		return Stadt;
	}

	public Saal getSaal() {
		return saal;
	}


	
    
    
    
    

}
