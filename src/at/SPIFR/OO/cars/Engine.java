package at.SPIFR.OO.cars;

public class Engine {

    private int iLeistung;
    private String strType;


    public Engine(int iLeistung, String strType) {
        this.iLeistung = iLeistung;
        this.strType = strType;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getStrType() {
        return strType;
    }

    public void setStrType(String strType) {
        this.strType = strType;
    }
}
