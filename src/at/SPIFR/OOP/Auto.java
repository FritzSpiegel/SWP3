package at.SPIFR.OOP;

import java.util.ArrayList;

public class Auto {


    private int iLeistung = 0;
    private String sFarbe = "keine Farbe";
    private Fahrrad kofferraumfahrrad;
    private ArrayList<Getränkekiste> kofferraumGetränkekiste = new ArrayList<Getränkekiste>();


    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public ArrayList<Getränkekiste> getKofferraumGetränkekiste() {
        return kofferraumGetränkekiste;
    }

    public void setKofferraumGetränkekiste(Getränkekiste kofferraumGetränkekiste) {
        this.kofferraumGetränkekiste.add(kofferraumGetränkekiste);

    }

    public Fahrrad getKofferraumfahrrad() {
        return kofferraumfahrrad;
    }

    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        this.kofferraumfahrrad = kofferraumfahrrad;
    }



    public int getiLeistung() {
        return iLeistung;
    }

    public String getsFarebe() {
        return sFarbe;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public void setsFarebe(String sFarebe) {
        this.sFarbe = sFarebe;
    }


}
