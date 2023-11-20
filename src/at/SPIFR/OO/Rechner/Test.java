package at.SPIFR.OO.Rechner;

public class Test {

    public static void main(String[] args) {
        Rechner rechner1 = new Rechner();

        WissenschaftlichenRechner wissenschaftlichenRechner1 = new WissenschaftlichenRechner();

        Wurzelrechner wurzelrechner1 = new Wurzelrechner();

        System.out.println(rechner1.plus(5,5));
        System.out.println(rechner1.minus(15,5));
        System.out.println(rechner1.multiplizieren(5,2));
        System.out.println(rechner1.dividieren(40,4));

        System.out.println(wissenschaftlichenRechner1.sinus(90));
        System.out.println(wissenschaftlichenRechner1.cosinus(10));

        System.out.println(wissenschaftlichenRechner1.plus(5,5));

        System.out.println(wurzelrechner1.wurzel(9));
        System.out.println(wurzelrechner1.plus(5,5));


    }


}
