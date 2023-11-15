package at.SPIFR.cars;

public class Test {

    public static void main(String[] args) {


        Engine engine1 = new Engine(20,"Diesel");

        Producer producer1 = new Producer("Memet","Türkei",10);

        Car car1 = new Car("Rot",200, 100, 1,engine1,producer1);


        producer1.addCar(car1);

        System.out.println(car1.calculatefPreis());

        car1.drive(4900);

        car1.drive(300);





    }
}
