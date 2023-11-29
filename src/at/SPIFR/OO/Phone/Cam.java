package at.SPIFR.OO.Phone;

public class Cam {

    private int resolution;



    public double makePicture(){
        double dErgebnis = 0;

        dErgebnis = this.resolution * this.resolution;

        return dErgebnis;
    };


    public Cam(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}

