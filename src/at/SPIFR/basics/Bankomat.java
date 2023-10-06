package at.SPIFR.basics;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bankomat {


    public static void main(String[] args) {

        int iAuswahl = 0;
        double dHilfe = 0;
        char cAbbruch = 'n';
        char cAuswahl = 'a';
        double dGesamtkonto = 0;
        Scanner scanner = new Scanner(System.in);


        //Menü, für die Asuwahl einer Funktion

        System.out.println("Dieses Programm simmuliert einen Bankautomat, Sie haben nun 4 möglichkeiten: ");

        do {
            System.out.println(
                    "\n 1. Einzahlen" +
                            "\n 2. Abheben" +
                            "\n 3. Kontostand anzeigen" +
                            "\n 4. Programm beenden");


            //Auswahl kann eingegeben werden
            iAuswahl = scanner.nextInt();


            if (iAuswahl == 1) {

                //Geld einzahlen

                System.out.println("Wie viel Geld möchten sie einzaheln?");

                dHilfe = scanner.nextDouble();

                dGesamtkonto = dGesamtkonto + dHilfe;

                System.out.println("Sie haben nun " + dHilfe + "€ eingezahlt.");

            } else if (iAuswahl == 2) {

                //Geld abheben

                System.out.println("Wie viel Geld möchten sie auszahlen?");

                dHilfe = scanner.nextDouble();

                dGesamtkonto = dGesamtkonto - dHilfe;

                if (dGesamtkonto < 0 && dGesamtkonto > -1000) {

                    System.out.println("Wenn sie diese Transaktion durchführen sind sie im Minus.");
                    System.out.println("\n Sie können bis zu einem Wert von minus 1000€, ihre jetzige Transaktion führt sie zu einem Kontostand von:" + dGesamtkonto + "€");
                    System.out.println("Möchten Sie die Transaktion trotzdem durchführen?" +
                            "\n ja (j) " +
                            "\n nein (n)");

                    cAuswahl = scanner.next().charAt(0);

                    if (cAuswahl == 'n') {

                        dGesamtkonto = dGesamtkonto + dHilfe;

                        System.out.println("Die Transaktion wurde gestoppt.");
                    } else if (cAuswahl == 'j') {

                        System.out.println("Die Transaktion wurde durchgeführt.");

                        System.out.println("\n Sie haben nun " + dHilfe + "€ ausgezahlt.");

                    }
                } else if (dGesamtkonto < -1000) {
                    //Wenn die Transaktion unter -1000€ fällt.
                    System.out.println("Sie können diese Transaktion nicht durchführen, da Ihr Konto ansonsten unter -1000€ fällt.");

                } else {
                    //Wenn die Transaktion noch im positiven Bereich ist
                    System.out.println("Sie haben nun " + dHilfe + "€ ausgezahlt.");


                }


            } else if (iAuswahl == 3) {

                //Kontostand anzeigen

                System.out.println(" Ihr Kontostand beträgt nun " + dGesamtkonto + "€ ");
            } else if (iAuswahl == 4) {

                System.out.println("\n Sie haben nun das Programm beendet");

                cAbbruch = 'j';
            }

            System.out.println("\n \n Sie können nun eine weitere Funktion auswählen.");
        } while (cAbbruch != 'j');
    }

}