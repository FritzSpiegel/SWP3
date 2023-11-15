package at.SPIFR.cars;

import at.SPIFR.Fernbedinung.Battery;

import java.util.ArrayList;
import java.util.List;

public class Producer {

    private String strName;
    private String strHerkunftsland;
    private float fRabatt;
    private List<Car> carList;



    public void addCar(Car car) {
        this.carList.add(car);
    }




    public Producer(String strName, String strHerkunftsland, float fRabatt, List<Car> carList) {
        this.strName = strName;
        this.strHerkunftsland = strHerkunftsland;
        this.fRabatt = fRabatt;
        this.carList = new ArrayList<>();
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrHerkunftsland() {
        return strHerkunftsland;
    }

    public void setStrHerkunftsland(String strHerkunftsland) {
        this.strHerkunftsland = strHerkunftsland;
    }

    public float getfRabatt() {
        return fRabatt;
    }

    public void setfRabatt(float fRabatt) {
        this.fRabatt = fRabatt;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
