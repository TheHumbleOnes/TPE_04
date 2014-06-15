package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.HashMap;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Saal {
    private String name;
    private int seats;
    
  
    public Saal(String name, int seats){
    	this.name = name;
    	this.seats = seats;
    }

	public int getSeat() {
		return seats;
	}

	public String getName() {
		return name;
	}



}
