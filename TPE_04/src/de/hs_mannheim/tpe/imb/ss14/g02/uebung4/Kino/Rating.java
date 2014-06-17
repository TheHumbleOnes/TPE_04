package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Kino;

public enum Rating {

    AB_0("[Ohne Altersbeschraenkung]"),
    AB_6("[Ab 6 Jahren]"),
    AB_12("[Ab 12 Jahren]"),
    AB_16("[Ab 16 Jahren]"),
    AB_18("[Ohne Jugendfreigabe]");

    private String freigabe;

    private Rating(String freigabe) {
        this.setRating(freigabe);
    }

    public String getRating() {
        return freigabe;
    }

    private void setRating(String freigabe) {
        this.freigabe = freigabe;
    }

    public String toString() {
        return this.freigabe;
    }

}
