package at.SPIFR.basics;

public class Stringhelper {


    String sSatz = "Otto";


    boolean Palindrom = isPalindrom("otto");




    public static boolean isPalindrom (String test){


        char[] textarray = test.toCharArray();

        int lange = textarray.length + 1;

        for(int i = 0; i < textarray.length/2; i++) {
            int hilfe = textarray.length - 1 - i;

            if(textarray[i] == textarray[hilfe]){
                boolean Ergebnis = true;

            }else {

                boolean Ergebnis = false;
            }
        };

        return false;
    }
}
