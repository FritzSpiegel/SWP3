package at.SPIFR.cars;

import at.SPIFR.OO.Engine;
import at.SPIFR.OOP.Fahrrad;

public class Car {


    private String strFarbe;
    private int iMaximalgeschwindigkeit;
    private float fBasispreis;
    private float fBasisverbrauch;
    private Engine engine;


    public Car(String strFarbe, int iMaximalgeschwindigkeit, float fBasispreis, float fBasisverbrauch) {
        this.strFarbe = strFarbe;
        this.iMaximalgeschwindigkeit = iMaximalgeschwindigkeit;
        this.fBasispreis = fBasispreis;
        this.fBasisverbrauch = fBasisverbrauch;
    }

    public String getStrFarbe() {
        return strFarbe;
    }

    public void setStrFarbe(String strFarbe) {
        this.strFarbe = strFarbe;
    }

    public int getiMaximalgeschwindigkeit() {
        return iMaximalgeschwindigkeit;
    }

    public void setiMaximalgeschwindigkeit(int iMaximalgeschwindigkeit) {
        this.iMaximalgeschwindigkeit = iMaximalgeschwindigkeit;
    }

    public float getfBasispreis() {
        return fBasispreis;
    }

    public void setfBasispreis(float fBasispreis) {
        this.fBasispreis = fBasispreis;
    }

    public float getfBasisverbrauch() {
        return fBasisverbrauch;
    }

    public void setfBasisverbrauch(float fBasisverbrauch) {
        this.fBasisverbrauch = fBasisverbrauch;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
