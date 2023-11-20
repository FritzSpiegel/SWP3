package at.SPIFR.OO.Fernbedinung;

public class Test {


    public static void main(String[] args) {

        Remote remote1 = new Remote(false, true);
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(100);

        remote1.addBattery(battery1);
        remote1.addBattery(battery1);

        System.out.println(remote1.getStatus());

        remote1.turnOn();

        remote1.turnOff();

        System.out.println(remote1.getStatus());



    }




}
