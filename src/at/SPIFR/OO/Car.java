package at.SPIFR.OO;

public class Car {

    // Instanz / Gedächtnisvariablen

    //don't do that later!
    private int fuelConsumption;
    private int Tank;
    private int fuelAmount;
    private String brand;
    private String serialnumber;
    private String color;



    public Car(int fuelConsumption, String brand , String serialnumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialnumber = serialnumber;
    }


    //Methode
    public void drive(){
        if(this.fuelAmount < fuelConsumption){
            System.out.println("Not enough Fuel to drive");
        }else {
            this.fuelAmount = this.fuelAmount-fuelConsumption;
            System.out.println("I am driving");
        }

    }

    public void stop(){
        System.out.println("Ich bremse!");
    }

    public void turboboost(){
        if(this.fuelAmount > fuelAmount/10){
            System.out.println("SuperBoostMode");
        }else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions){

        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuut");
        }
    }

    public void getRemainingRange(){

        int remainingRange = 0;
        remainingRange = fuelAmount / fuelConsumption;
        System.out.println("You can drive: " +  remainingRange + "time");

    }

    public void setTank(int tank) {
        Tank = tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        if(fuelAmount > 100){
            this.fuelAmount = 100;
        }else {
            this.fuelAmount = fuelAmount;
        }

    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public int getTank() {
        return Tank;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialnumber() {
        return serialnumber;
    }
}
