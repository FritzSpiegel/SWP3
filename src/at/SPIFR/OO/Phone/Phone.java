package at.SPIFR.OO.Phone;

public class Phone {

    private String color;

    private SIM sim;
    private Cam cam;
    private SDCard sdcard;


    public Phone(String color, SIM sim, Cam cam, SDCard sdcard) {
        this.color = color;
        this.sim = sim;
        this.cam = cam;
        this.sdcard = sdcard;
    }

    public void takepictures(){

    };



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
