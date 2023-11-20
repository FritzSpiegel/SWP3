package at.SPIFR.OO.Konto;

public class Sparbuch extends Konto{

    public Sparbuch(float fKontostand) {
        super(fKontostand);
    }


    @Override
    public void auszahlen(float fBetrag) {

        if(super.getfKontostand() - fBetrag < 0){
            System.out.println("Ihre Transaktion konnte leidernicht durchgeführt werden, da Sie ansonsten ins Minus gelangen");
        }else {
            super.auszahlen(fBetrag);
        }
    }
}
