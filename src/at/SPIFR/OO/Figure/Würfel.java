package at.SPIFR.OO.Figure;

public class Würfel extends Quadrat{

    private float fHöhe;

    public Würfel(String sName, float fLaenge, float fHöhe) {
        super(sName, fLaenge);
        this.fHöhe = fHöhe;
    }


    @Override
    public double getArea() {
        return super.getArea() *6;
    }

    public float getfHöhe() {
        return fHöhe;
    }

    public void setfHöhe(float fHöhe) {
        this.fHöhe = fHöhe;
    }
}
