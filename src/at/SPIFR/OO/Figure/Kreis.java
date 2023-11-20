package at.SPIFR.OO.Figure;

public class Kreis {


    private String sName;
    private float fRadius;

    public Kreis(String sName, float fRadius) {
        this.sName = sName;
        this.fRadius = fRadius;
    }


    public String getName(){
        return getsName();
    }

    public double getArea(){
        double dErgebnis = getfRadius() * getfRadius() * Math.PI;

        return dErgebnis;
    }




    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public float getfRadius() {
        return fRadius;
    }

    public void setfRadius(float fRadius) {
        this.fRadius = fRadius;
    }
}
