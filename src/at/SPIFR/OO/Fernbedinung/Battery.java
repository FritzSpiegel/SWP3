package at.SPIFR.OO.Fernbedinung;

public class Battery {


    private int ichargingStatus;


    public Battery(int ichargingStatus) {
        this.ichargingStatus = ichargingStatus;
    }

    public int getIchargingStatus() {
        return ichargingStatus;
    }

    public void setIchargingStatus(int ichargingStatus) {
        this.ichargingStatus = ichargingStatus;
    }
}
