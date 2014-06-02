package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.*;

public class Kino {
    private String name;
    private String Stadt;
    private Saal saal;
    
    
    public Kino(String name, String Stadt, Saal saal){
    	this.name = name;
    	this.Stadt = Stadt;
    	this.saal = saal;
    	
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
