package at.SPIFR.OO.Konto;

public class Girokonto extends  Konto{


    private float fLimit;

    public Girokonto(float fKontostand, float fLimit) {
        super(fKontostand);
        this.fLimit = fLimit;
    }

    @Override
    public void auszahlen(float fBetrag) {
        if(super.getfKontostand() - fBetrag < (getfLimit() * (-1))){
            System.out.println("Ihre Transaktion kann leider nicht durchegführt werden, da Sie ansonsten unter ihr Limit kommen.");
        }else {
            super.auszahlen(fBetrag);
        }
    }

    public float getfLimit() {
        return fLimit;
    }

    public void setfLimit(float fLimit) {
        this.fLimit = fLimit;
    }
}
