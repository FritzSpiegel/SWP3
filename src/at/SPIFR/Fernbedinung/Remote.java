package at.SPIFR.Fernbedinung;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private boolean ison;
    private boolean hasPower;
    private List<Battery> batteryList;



    public void turnOn(){
        for (int i = 0; i < batteryList.size(); i++) {
            int i2 = i+1;
            System.out.println("Verbraucher angeschlossen");
            this.batteryList.get(i).setIchargingStatus(batteryList.get(i).getIchargingStatus()-5);
        }
    };

    public void turnOff(){
        for (int i = 0; i < batteryList.size(); i++) {
            int i2 = i+1;
            System.out.println("Verbraucher abgeschlossen");
        }
    };

    public float getStatus(){
        int iLadestatus = 0;
        for (int i = 0; i < batteryList.size(); i++) {

                iLadestatus = (iLadestatus +batteryList.get(i).getIchargingStatus()) / (i+1);

        }
        return iLadestatus;
    }


    public Remote(boolean ison, boolean hasPower) {
        this.ison = ison;
        this.hasPower = hasPower;
        this.batteryList = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteryList.add(battery);
    }

    public List<Battery> getBatteryList() {
        return batteryList;
    }

    public boolean isIson() {
        return ison;
    }

    public void setIson(boolean ison) {
        this.ison = ison;
    }

    public boolean isHasPower() {
        return hasPower;
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }
}
