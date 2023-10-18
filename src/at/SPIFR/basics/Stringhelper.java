package at.SPIFR.basics;

import java.util.Scanner;

public class Stringhelper {
    public static void main(String[] args) {

        String sSatz = "";
        char  cAuswahl = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie ein Wort ein: ");

        sSatz = scanner.nextLine();

        System.out.println("Welche Funktion moechten sie mit ihrem String ausführen?");
        System.out.println("\tIst es ein Palindrom? (a)");
        System.out.println("\tWi eviele Buchstaben sind im String? (b)");

        cAuswahl = scanner.next().charAt(0);



        if(cAuswahl == 'a'){
            boolean Palindrom = isPalindrom(sSatz);

            System.out.println(Palindrom);
        }else if(cAuswahl == 'b'){

            int iAnzahl = countLetters(sSatz);

            System.out.println(iAnzahl);

        }



        System.out.println("Möchten sie noch ein weiteres Wort eingeben? \t Ja(j) \t Nein(n)");

    }





    public static boolean isPalindrom (String test){

        boolean Ergebnis = true;
        int ihilfe = 0;


        char[] textarray = test.toCharArray();



        for (int i = 0; i < textarray.length; i++) {
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


    public static int countLetters (String test){

        char[] textarray = test.toCharArray();
        int iZaehler = 0;


        for(int i = 0; i < textarray.length; i ++){

            iZaehler += 1;
        }

       return iZaehler;
    }
}
