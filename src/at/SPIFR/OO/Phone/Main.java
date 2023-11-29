package at.SPIFR.OO.Phone;

public class Main {


    public static void main(String[] args) {

        Cam cam1 = new Cam(100);
        Cam cam2 = new Cam(150);

        SIM sim1 = new SIM(01,"+43 103 012893");

        SDCard sdcard1 = new SDCard(100000);
        SDCard sdcard2 = new SDCard(999999);



        Phone phone1 = new Phone("green",sim1,cam1,sdcard1);

        phone1.takepictures("Katze");


        phone1.switchcam(cam2);

        phone1.takepictures("Haus");
        phone1.takepictures("Baum");

        phone1.getFreeSpace();
        phone1.printAllFiles();

        phone1.switchsdCard(sdcard2);

        phone1.takepictures("Baum");

        phone1.getFreeSpace();
        phone1.printAllFiles();

        phone1.doCall("+43 278 1074839");









    }
}
