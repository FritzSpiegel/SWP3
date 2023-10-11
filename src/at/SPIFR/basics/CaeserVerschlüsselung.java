package at.SPIFR.basics;

import java.io.CharConversionException;
import java.util.Scanner;


public class CaeserVerschlüsselung {

    public static void main(String[] args) {

        String sSatz = "";
        int iVerschieben = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mit diesem Programm können sie einen String verschlüsseln");
        System.out.println("Geben sie bitte ihren String nun ein: ");

        sSatz = scanner.nextLine();

        System.out.println("Um wei viele Stellen möchten Sie den Satz verschieben?");

        iVerschieben = scanner.nextInt();




    String sVerschluesselt = encrypt(iVerschieben,sSatz);
        System.out.println(sVerschluesselt);
    }


    public static String encrypt(int verschiebung, String StringVerschluesseln) {

        String sVerschluesselt = "";
        char[] aString = StringVerschluesseln.toCharArray();
        for (int i = 0; i < aString.length; i++) {
            int iVerschluesselt = aString[i] + verschiebung;
            sVerschluesselt = sVerschluesselt + Character.toString(iVerschluesselt);
        }


        return sVerschluesselt;
    }

}
