package at.SPIFR.basics;

import java.util.Scanner;

public class Stringhelper {
    public static void main(String[] args) {

        String sSatz = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie ein Wort ein, von dem sie wissen möchten ob es ein Palindrom ist: ");

        sSatz = scanner.nextLine();

        boolean Palindrom = isPalindrom(sSatz);

        System.out.println(Palindrom);


        System.out.println("Möchten sie noch ein weiteres Wort eingeben? \t Ja(j) \t Nein(n)");




    }
    public static boolean isPalindrom (String test){


        boolean Ergebnis = true;
        int ihilfe = 0;
        char[] textarray = test.toCharArray();


        for (int i = 0; i < textarray.length / 2; i++) {
            int hilfe = textarray.length - 1 - i;

            if (textarray[i] == textarray[hilfe]) {

            } else {
                ihilfe = 1;

            }

        }

        if(ihilfe == 1){
            Ergebnis = false;
        }
        return Ergebnis;
    }
}
