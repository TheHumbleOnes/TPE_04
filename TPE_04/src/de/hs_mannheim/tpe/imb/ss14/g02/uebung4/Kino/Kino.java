package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

import java.util.*;

public class Kino {
    private String name;
    private String Stadt;
    private Film[] film;
    private Saal[] saal;
    private HashMap<Integer, Saal> saele = new HashMap<>();
    
    
    public Kino(String name, String Stadt, Film[] film, Saal[] saal){
    	this.name = name;
    	this.Stadt = Stadt;
    	this.saal = saal;
    	this.film = film;
    	
    }

  

	public void addSaal(Saal saal){
    saele.put(saal.hashCode(), saal);	
    }
    
    public HashMap<Integer, Saal> getSaele(){
    	return this.saele;
    }
    
	public String getName() {
		return name;
	}

	public String getStadt() {
		return Stadt;
	}

	
	public void gesamtesProgramm() {
	    System.out.println(name + " in " + Stadt);
		for(Saal s : saal){
		    
		    Verwaltung.getFilmeFuerSaalMitZeiten(s);
		    System.out.println();

	
		}
	}}
    
    
    


