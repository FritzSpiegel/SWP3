package at.SPIFR.OO.Phone;

public class Main {


    public static void main(String[] args) {

        Cam cam1 = new Cam(100);

        SIM sim1 = new SIM(01,"+43 103 012893");

        SDCard sdcard1 = new SDCard(1000000);


        Phone phone1 = new Phone("green",sim1,cam1,sdcard1);


    }
}
