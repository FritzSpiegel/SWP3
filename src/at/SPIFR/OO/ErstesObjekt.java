package at.SPIFR.OO;


public class ErstesObjekt {

    public static void main(String[] args) {

        int a = 7;
/*
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption  = 7;
        c1.serialnumber = "A1234";
        c1.fuelAmount = 70;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialnumber = "M1234";
        c2.fuelAmount = 20;

        Car c3 = new Car(17,"Opel","1234O");
*/
        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialnumber("1234");
        c1.setFuelAmount(70);
        c1.setTank(17);

        System.out.println(c1.getFuelAmount());
        c1.drive();
        System.out.println(c1.getFuelAmount());
        c1.turboboost();
        c1.honk(2);









    }


}
