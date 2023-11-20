package at.SPIFR.OO.cars;


public class Car {


    private String strFarbe;
    private int iMaximalgeschwindigkeit;
    private float fBasispreis;
    private float fBasisverbrauch;
    private float fKilometeranzahl;
    private Engine engine;
    private Producer producer;



    public Car(String strFarbe, int iMaximalgeschwindigkeit, float fBasispreis, float fBasisverbrauch, Engine engine, Producer producer) {
        this.strFarbe = strFarbe;
        this.iMaximalgeschwindigkeit = iMaximalgeschwindigkeit;
        this.fBasispreis = fBasispreis;
        this.fBasisverbrauch = fBasisverbrauch;
        this.engine = engine;
        this.producer = producer;
    }

    public float calculatefPreis(){
        float fresult = 0;
        float a = getProducer().getfRabatt();
        float b = getfBasispreis();
        fresult = b - (b / a);
        return fresult;
    };

    public void drive(){
        System.out.println("I am driving");
    }

    public void stop(){
        System.out.println("I am breaking ... car");
    }

    public float drive1(float fdistanz){
        float fKilometeranzahlalt = fKilometeranzahl;
        fKilometeranzahl = fKilometeranzahl + fdistanz;
        double dresult;

        if(fKilometeranzahl <= 5000){

            dresult = fdistanz * fBasisverbrauch;

        } else if (fKilometeranzahlalt < 5000) {

            float f = 5000 - fKilometeranzahlalt;
            float f2 = fdistanz - f;

            dresult = (f * fBasisverbrauch) + ((f2 * fBasisverbrauch )+(f2 * fBasisverbrauch * 0.098));
        } else {
            dresult = fdistanz * fBasisverbrauch +(fdistanz * fBasisverbrauch * 0.098);
        }
        System.out.println("Das Auto ist nun " + fdistanz + "km gefahren, und hat dabei: "+ dresult + " Liter verbraucht");


      return 0;
    };
    public String getStrFarbe() {
        return strFarbe;
    }

    public void setStrFarbe(String strFarbe) {
        this.strFarbe = strFarbe;
    }

    public int getiMaximalgeschwindigkeit() {
        return iMaximalgeschwindigkeit;
    }

    public void setiMaximalgeschwindigkeit(int iMaximalgeschwindigkeit) {
        this.iMaximalgeschwindigkeit = iMaximalgeschwindigkeit;
    }

    public float getfBasispreis() {
        return fBasispreis;
    }

    public void setfBasispreis(float fBasispreis) {
        this.fBasispreis = fBasispreis;
    }

    public float getfBasisverbrauch() {
        return fBasisverbrauch;
    }

    public void setfBasisverbrauch(float fBasisverbrauch) {
        this.fBasisverbrauch = fBasisverbrauch;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;

    }
}
