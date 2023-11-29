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

    public void getFreeSpace(){
        sdcard.getFreeSpace();
    };


    public void doCall(String phonenumber){
        sim.doCall(phonenumber);
    }


    public void printAllFiles(){
        sdcard.getAllFiles();
    };

    public void takepictures(String name){
        sdcard.addBattery(cam.takepicture(name));
    };

    public void switchcam(Cam cam){
        System.out.println("Die Cam wurde gewechselt");
        this.cam = cam;
    };

    public void switchsim(SIM sim){
        System.out.println("Die SIM wurde gewechselt");
        this.sim = sim;
    };

    public void switchsdCard(SDCard sdcard){
        System.out.println("Die SDCard wurde gewechselt");
        this.sdcard = sdcard;
    };





    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
