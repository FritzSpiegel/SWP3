package at.SPIFR.OOP;

public class Flasche {
    private String sHersteller = "kein Hersteller";
    private int iVolumen;
    private String sGefülltmit;




    public Flasche(String sHersteller, int iVolumen, String sGefülltmit) {
        this.sHersteller = sHersteller;
        this.iVolumen = iVolumen;
        this.sGefülltmit = sGefülltmit;
    }

    public String getsHersteller() {
        return sHersteller;
    }

    public int getiVolumen() {
        return iVolumen;
    }

    public String getsGefülltmit() {
        return sGefülltmit;
    }

    public void setsHersteller(String sHersteller) {
        this.sHersteller = sHersteller;
    }

    public void setiVolumen(int iVolumen) {
        this.iVolumen = iVolumen;
    }

    public void setsGefülltmit(String sGefülltmit) {
        this.sGefülltmit = sGefülltmit;
    }
}
