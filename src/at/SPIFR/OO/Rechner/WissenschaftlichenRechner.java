package at.SPIFR.OO.Rechner;

public class WissenschaftlichenRechner extends Rechner{

    public WissenschaftlichenRechner() {
    }


    public double sinus(float a){
        double dResult = (Math.sin(Math.toRadians(a)));
        return dResult;
    }

    public double cosinus(float a){
        double dResult = (Math.cos(Math.toRadians(a)));

        return dResult;
    }
}
