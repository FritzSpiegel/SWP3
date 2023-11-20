package at.SPIFR.OO.Konto;

public class Test {


    public static void main(String[] args) {

        Konto K1 = new Konto(0);

        Sparbuch S1 = new Sparbuch(0);

        Girokonto G1 = new Girokonto(0,2000);

        Kreditkonto Kr1 = new Kreditkonto(-1000);

        Kr1.einzahlen(-2000);

        Kr1.einzahlen(2000);

        Kr1.auszahlen(700);

        Kr1.auszahlen(3000);

        Kr1.auszahlen(40000);

        Kr1.einzahlen(44700);




    }




}
