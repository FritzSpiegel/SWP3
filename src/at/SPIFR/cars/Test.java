package at.SPIFR.cars;

public class Test {

    public static void main(String[] args) {


        Engine engine = new Engine(20,"Diesel");

        Car car1 = new Car("Rot",200, 25000, 10);

        car1.setEngine(engine);



    }
}
