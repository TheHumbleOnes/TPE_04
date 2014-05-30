package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

public enum Altersfreigabe {

   AB_0("Ohne Altersbeschraenkung"),
   AB_6("Ab 6 Jahren"),
   AB_12("Ab 12 Jahren"),
   AB_16("Ab 16 Jahren"),
   AB_18("Ohne Jugendfreigabe");
   
   private final String freigabe;
   
   private Altersfreigabe(final String freigabe){
       this.freigabe = freigabe;
   }
   
   @Override
   public String toString(){
       return freigabe;
   }
        
    
}
