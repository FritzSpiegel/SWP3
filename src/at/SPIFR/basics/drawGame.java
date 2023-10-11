package at.SPIFR.basics;

import java.util.Random;
import java.util.Scanner;

public class drawGame {

    public static void main(String[] args) {

        Random random = new Random();

        int iWuerfelSpieler;
        int iWuerfelComputer;
        int iZaehler = 0;
        int iSpielerPunkte = 0;
        int iComputerPunkte = 0;
        int iUnentschieden = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Dieses Programm ist ein Würfelspiel");
        System.out.println("Sie spielen hierbei gegen den Computer, jeder hat 6 Würfel. Derjeniger mit der höheren Augensumme gewinnt.");


        for (int i = 0; i < 6; i++) {

            iZaehler = iZaehler + 1;

            System.out.println("Sie sind mit dem " + iZaehler + " ten mal würfel dran.");
            System.out.println("Drücken sie Enter um zu würfeln.");

            scanner.nextLine();


            iWuerfelSpieler = random.nextInt(6);

            iWuerfelSpieler = iWuerfelSpieler + 1;

            System.out.println("Sie haben eine " + iWuerfelSpieler + " " +
                    "gewürfelt.");


            iWuerfelComputer = random.nextInt(6);
            iWuerfelComputer = iWuerfelComputer + 1;


            System.out.println(" \n" +
                    "Der Computer ist am Zug, und hat eine " + iWuerfelComputer + " gewürfelt");
            System.out.println("\n");


            if (iWuerfelComputer < iWuerfelSpieler) {
                System.out.println("Sie haben gewonnen!!!!");
                iSpielerPunkte = iSpielerPunkte + 1;
            } else if ((iWuerfelComputer > iWuerfelSpieler)) {

                System.out.println("Sie haben leider verloren :(");
                iComputerPunkte = iComputerPunkte + 1;

            } else {
                System.out.println("Es ist ein Unentschieden \t");
                iUnentschieden = iUnentschieden + 1;
            }
        }


        System.out.println("Insgesamt haben sie nun " + iSpielerPunkte + " mal gewonnen, und der Computer " + iComputerPunkte + " mal gewonnen. Es gab " + iUnentschieden + " Unentschieden");
    }
}

