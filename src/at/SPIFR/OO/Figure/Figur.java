package at.SPIFR.OO.Figure;

public class Figur {

    private String sName;
    private float fLaenge;



    public Figur(String sName, float fLaenge) {
        this.sName = sName;
        this.fLaenge = fLaenge;

    }

    public String getName(){
        return getsName();
    }


    public double getArea(){
        double dErgebnis = getfLaenge() * getfLaenge();
        return dErgebnis;
    }



    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public float getfLaenge() {
        return fLaenge;
    }

    public void setfLaenge(float fLaenge) {
        this.fLaenge = fLaenge;
    }


}
