package at.SPIFR.OO.Konto;

public class Kreditkonto extends Konto{

    public Kreditkonto(float fKontostand) {
            super(fKontostand);
    }

    @Override
    public void einzahlen(float fBetrag) {
        if (super.getfKontostand() + fBetrag > 0){

            System.out.println("Sie können mit ihrem Kreditkonto nicht ins Plus gelangen, " +
                    "somit müssen sie um ihre Schulden abzubezahlen noch: " + (super.getfKontostand() *(-1)) + " einzahlen");
        } else if (super.getfKontostand() +fBetrag == 0) {
            System.out.println("Herzlichen Glückwunsch, Sie haben alle Ihre Schulen abbezahlt.");
        } else {
            super.einzahlen(fBetrag);
        }
    }
}
