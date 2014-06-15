package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private ArrayList<Kino> kino = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    
    public Kino neuesKino(){
        System.out.println("Kinoname: ");
        String name = scan.nextLine();
        System.out.println("Kinostandort: ");
        String standort = scan.nextLine();
        
        Saal[] saal = neuerSaal();
        return new Kino(name, standort, saal);
    }

    private Saal[] neuerSaal(){
        //TODO
        Saal[] nSaal = new Saal[1]; //1 nur Platzhalter!!
        
        return nSaal;
    }
}
