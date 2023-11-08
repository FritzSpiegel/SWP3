package at.SPIFR.OOP;

public class Test {

    public static void main(String[] args) {

        Auto auto = new Auto(300,"rot");
        Auto auto1 = new Auto();

        auto.setiLeistung(300);
        auto.setsFarebe("rot");
        //auto.iLeistung = 400;

        Fahrrad fahrrad = new Fahrrad();
        fahrrad.setsFarbe("grün");

        auto.setKofferraumfahrrad(fahrrad);

        //System.out.println(fahrrad.getsFarbe() + " " + fahrrad.getsMarke());

        //System.out.println(auto.getiLeistung());
        //System.out.println(auto.getsFarebe());


        Flasche flasche = new Flasche("Coca Cola",500,"Cola");
        Getränkekiste getränkekiste = new Getränkekiste(24,flasche);
        auto.setKofferraumGetränkekiste(getränkekiste);

        System.out.println(auto.getKofferraumfahrrad().getsFarbe());

        System.out.println(auto.getKofferraumGetränkekiste());









    }

}
