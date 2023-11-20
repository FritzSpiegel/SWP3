package at.SPIFR.OO.Figure;

public class Viereck extends Figur{

    public float fBreite;

    public Viereck(String sName, float fLaenge,float fBreite) {
        super(sName, fLaenge);
        this.fBreite = fBreite;
    }


    @Override
    public double getArea() {
        double dErgebnis = getfLaenge() * getfBreite();

        return dErgebnis;
    }

    public float getfBreite() {
        return fBreite;
    }

    public void setfBreite(float fBreite) {
        this.fBreite = fBreite;
    }
}
