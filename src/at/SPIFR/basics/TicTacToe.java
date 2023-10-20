package at.SPIFR.basics;

import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {


        // Spieler X hat die 1
        // Spieler 0 hat die 2
        int iTest = 1;
        int iAuswahl = ' ';
        int iÜberprüfung = 0;
        int idurchgelaufen = 0;
        int igewonnen = 0;
        Scanner scanner = new Scanner(System.in);

        int[]  iumgewandelt = new int[2];

        char[][] cSpielfeld = new char[3][3];

        int[][] iavailable = new int [3][3];


        //Die beiden Arrays nur mit 0/ " " befüllen
        for (int i = 0; i < cSpielfeld.length; i++) {
            for (int j = 0; j < cSpielfeld.length; j++) {
                cSpielfeld[i][j] = ' ';
            }
        }

        for (int i = 0; i < iavailable.length; i++) {
            for (int j = 0; j < iavailable.length; j++) {
                iavailable[i][j] = 0;
            }
        }

        System.out.println("Das ist ein Tic Tac Toe spiel, die spieler sind nacheinander dran, für das Auswählen eines Feldes, müssen sie die richtige Zahl dafür eingeben.");
        System.out.println("1|2|3\n"  +
                "4|5|6\n" +
                "7|8|9\n");


        //Zug des resten Spielers
        anzeigeSpielfeld(cSpielfeld);
        do {

            System.out.println("Der erste Spieler mit dem X ist dran, geben Sie ein wo sie setzen möchten");

            do {

                iAuswahl = scanner.nextInt();

                iÜberprüfung = isavailable(iavailable, iAuswahl);

                if (iÜberprüfung == 0) {
                    //Das Feld ist frei
                    iumgewandelt = umwandeln(iAuswahl);

                    iavailable[iumgewandelt[0]][iumgewandelt[1]] = 1;

                    cSpielfeld[iumgewandelt[0]][iumgewandelt[1]] = 'X';

                    anzeigeSpielfeld(cSpielfeld);

                    idurchgelaufen = 1;

                } else if (iÜberprüfung == 1) {
                    //Dieser Spieler hat bereits in diesem Feld ein X plaziert

                    System.out.println("Sie haben in diesem Feld bereits ein X platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr X platzieren wollen");

                } else if (iÜberprüfung == 2) {
                    //Der andere Spieler hat dieses Feld bereits belegt

                    System.out.println("Der andere Spieler hat bereits ein O in diesem Feld platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr X platzieren wollen");

                }


            } while (idurchgelaufen != 1);
            idurchgelaufen = 0;

            System.out.println("Nun ist der Spieler mit dem O dran, wähle einen Ort aus, wo du deinen Kreis platzieren möchtest: ");


            do {
                iAuswahl = scanner.nextInt();


                iÜberprüfung = isavailable(iavailable, iAuswahl);


                if (iÜberprüfung == 0) {
                    //Das Feld ist frei
                    iumgewandelt = umwandeln(iAuswahl);

                    iavailable[iumgewandelt[0]][iumgewandelt[1]] = 2;

                    cSpielfeld[iumgewandelt[0]][iumgewandelt[1]] = 'O';

                    anzeigeSpielfeld(cSpielfeld);

                    idurchgelaufen = 1;

                } else if (iÜberprüfung == 1) {
                    //Dieser Spieler hat bereits in diesem Feld ein X plaziert

                    System.out.println("Der andere Spieler hat bereits ein X in diesem Feld platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr O platzieren wollen");
                } else if (iÜberprüfung == 2) {
                    //Der andere Spieler hat dieses Feld bereits belegt

                    System.out.println("Sie haben in diesem Feld bereits ein O platziert");

                    System.out.println("Geben sie eine neue Zahl ein, an der sie ihr O platzieren wollen");
                }

            } while (idurchgelaufen != 1);
        }while(igewonnen != 1);


    }





    public static void anzeigeSpielfeld (char[][] Spielfeld){
        for ( int i = 0; i < Spielfeld.length; i ++){
                System.out.println("|" +  Spielfeld[i][0] + "|" +  Spielfeld[i][1] +  "|" +  Spielfeld[i][2] + "|");
        }
    }

    public static int isavailable (int[][] Spielfeld, int Zahl) {
        int iZahl = Zahl;
        int iErgebnis = 0;
        int[] iArray = new int[2];

        iArray = umwandeln(iZahl);




        if (Spielfeld[iArray[0]][iArray[1]] == 0) {
            iErgebnis = 0;

        } else if (Spielfeld[iArray[0]][iArray[1]] == 1) {
            iErgebnis = 1;
        } else {
            iErgebnis = 2;
        }
        return iErgebnis;
    }


    public static int[] umwandeln (int Zahl){

        int iZeile = 0;
        int iSpalte = 0;
        int[] iumgewandelt = new int[2];

        switch (Zahl) {
            case 1:
                iZeile = 0;
                iSpalte = 0;
                break;
            case 2:
                iZeile = 0;
                iSpalte = 1;
                break;
            case 3:
                iZeile = 0;
                iSpalte = 2;

                break;
            case 4:
                iZeile = 1;
                iSpalte = 0;
                break;
            case 5:
                iZeile = 1;
                iSpalte = 1;
                break;
            case 6:
                iZeile = 1;
                iSpalte = 2;

                break;
            case 7:
                iZeile = 2;
                iSpalte = 0;
                break;
            case 8:
                iZeile = 2;
                iSpalte = 1;
                break;
            case 9:
                iZeile = 2;
                iSpalte = 2;
                break;
        }
        iumgewandelt[0] = iZeile;
        iumgewandelt[1] = iSpalte;
        return  iumgewandelt;
    }

    public static int gewonnen (int[][] iAvailable){

        int iGewonnen = 0;


        if(iAvailable[0][0] == 1 && iAvailable[1][1] == 1 && iAvailable[2][2] == 1){
            iGewonnen = 1;

        } else if (iAvailable[0][2] == 1 && iAvailable[1][1] == 1 && iAvailable[2][0] == 1) {
            iGewonnen = 1;

        } else if (iAvailable[0][0] == 1 && iAvailable[0][1] == 1 && iAvailable[0][2] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[1][0] == 1 && iAvailable[1][1] == 1 && iAvailable[1][2] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[2][0] == 1 && iAvailable[2][1] == 1 && iAvailable[2][2] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[0][0] == 1 && iAvailable[1][0] == 1 && iAvailable[2][0] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[0][1] == 1 && iAvailable[1][1] == 1 && iAvailable[2][1] == 1) {
            iGewonnen = 1;

        }else if (iAvailable[0][2] == 1 && iAvailable[1][2] == 1 && iAvailable[2][2] == 1) {
            iGewonnen = 1;


        }


    };
}
