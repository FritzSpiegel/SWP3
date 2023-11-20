package at.SPIFR.OO.cars;

public class Truck extends Car{

    private String trailer;
    public Truck(String strFarbe, int iMaximalgeschwindigkeit, float fBasispreis, float fBasisverbrauch, Engine engine, Producer producer,String trailer) {
        super(strFarbe, iMaximalgeschwindigkeit, fBasispreis, fBasisverbrauch, engine, producer);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive() {

        System.out.println("I am driving the Truck - consumption is high");
        //super.drive();
    }
}
