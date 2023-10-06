package at.SPIFR.basics;

import java.util.Random;
import java.util.Scanner;

public class drawGame {

    public static void main(String[] args) {

        Random random = new Random();

        int iWuerfel = 0;
        int iSpielerGesamt = 0;
        int iComputerGesamt = 0;
        int iZaehler = 0;

        char cwuerfeln = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Dieses Programm ist ein Würfelspiel");
        System.out.println("Sie spielen hierbei gegen den Computer, jeder hat 6 Würfel. Derjeniger mit der höheren Augensumme gewinnt.");


        for (int i = 0; i < 6; i++) {

            iZaehler = iZaehler + 1;

            System.out.println("Sie sind mit dem " + iZaehler + " ten mal würfel dran.");
            System.out.println("Drücken sie Enter um zu würfeln.");

            scanner.nextLine();


            iWuerfel = random.nextInt(6);

            iWuerfel = iWuerfel + 1;

            iSpielerGesamt = iSpielerGesamt + iWuerfel;

            System.out.println("Sie haben eine " + iWuerfel + " " +
                    "gewürfelt.");
            System.out.println("Insgesamt haben sie nun eine Augenzahl von: " + iSpielerGesamt);

            iWuerfel = random.nextInt(6);
            iWuerfel = iWuerfel + 1;

            iComputerGesamt = iComputerGesamt + iWuerfel;

            System.out.println(" \n" +
                    "Der Computer ist am Zug, und hat eine " + iWuerfel + " gewürfelt. Insgesamt hat er eine " + iComputerGesamt);
            System.out.println("\n");

        System.out.println("Jeder hat nun 6 mal gewürfelt.");

        if (iSpielerGesamt > iComputerGesamt) {
            System.out.println("Sie haben gewonnen!!!!");
        } else if ((iComputerGesamt > iSpielerGesamt)) {
            System.out.println("Sie haben leider verloren :(");
        } else {
            System.out.println("Es ist ein Unentschieden... viel Glück beim nächsten mal.");
        }
    }
}
