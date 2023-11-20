package at.SPIFR.OO.Konto;

public class Konto {

private float fKontostand;


    public Konto(float fKontostand) {
        this.fKontostand = fKontostand;
    }


    public void einzahlen(float fBetrag){
        if(fBetrag < 0){
            System.out.println("Sie können nur einen Positiven Wert einzahlen");
        }else {
            setfKontostand(getfKontostand() + fBetrag);
            System.out.println("Sie haben nun: " + fBetrag + "€ eingezahlt, Ihr neuer Kontostand lautet nun: " + getfKontostand());
        }
        };

    public void auszahlen(float fBetrag){
        if(fBetrag < 0){
            System.out.println("Sie können nur einen Positiven Wert einzahlen");
        }else {
            setfKontostand(getfKontostand() - fBetrag);
            System.out.println("Sie haben nun: " + fBetrag + "€ ausgezahlt, Ihr neuer Kontostand lautet nun: " + getfKontostand());
        }
    };




    public float getfKontostand() {
        return fKontostand;
    }

    public void setfKontostand(float fKontostand) {
        this.fKontostand = fKontostand;
    }


}


