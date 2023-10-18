package at.SPIFR.basics;

import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {

        int iTest = 1;
        Scanner scanner = new Scanner(System.in);


        char[][] cSpielfeld = new char[3][3];

        for (int i = 0; i < cSpielfeld.length; i++) {
            for (int j = 0; j < cSpielfeld.length; j++) {
                cSpielfeld[i][j] = ' ';
            }
        }


        System.out.println("1|2|3 \t -----  \t 4|5|6 \t ------\t 7|8|9 ");


        anzeigeSpielfeld(cSpielfeld);

    }





    public static void anzeigeSpielfeld (char[][] Spielfeld){

        for ( int i = 0; i < Spielfeld.length; i ++){
                System.out.println("|" +  Spielfeld[0][i] + "|" +  Spielfeld[1][i] +  "|" +  Spielfeld[2][i] + "|");

        }

    }

}
