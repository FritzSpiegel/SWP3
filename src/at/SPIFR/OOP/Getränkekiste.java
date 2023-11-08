package at.SPIFR.OOP;

import java.util.ArrayList;

public class Getränkekiste {

    private int iFlaschen = 0;
    private Flasche flasche;

    private ArrayList<Flasche> Flasche = new ArrayList<Flasche>();



    public Getränkekiste(int iFlaschen, Flasche flasche) {
        this.iFlaschen = iFlaschen;
        this.flasche = flasche;


    }

    public int getiFlaschen() {
        return iFlaschen;
    }

    public ArrayList<Flasche> getFlasche() {
        return Flasche;
    }

    public void setiFlaschen(int iFlaschen) {
        this.iFlaschen = iFlaschen;
    }

    public void setFlasche(Flasche flasche) {
        this.Flasche.add(flasche);
    }
}
