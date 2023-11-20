package at.SPIFR.OO.erstesProjekt;

public class Fahrrad {

    private String sFarbe = "keine Farbe";
    private String sMarke = "keine Marke";
    private int iZahl = 0;


    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public void setsMarke(String sMarke) {
        this.sMarke = sMarke;
    }

    public void setiZahl(int iZahl) {
        this.iZahl = iZahl;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public String getsMarke() {
        return sMarke;
    }

    public int getiZahl() {
        return iZahl;
    }
}
