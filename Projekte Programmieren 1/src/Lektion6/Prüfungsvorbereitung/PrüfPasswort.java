package Prüfungsvorbereitung;

public class PrüfPasswort {
    public static String Passwort = "Ha8o";
    public static String Passworttrue;

    public static void main(String[] args) {
        System.out.println(alsPWgeeignet(Passwort));
        System.out.println(Sternchen(Passwort));
    }

    public static boolean alsPWgeeignet(String Passwort) {
        char[] passwort = Passwort.toCharArray();
        //char[] passworttemp = Passwort.toCharArray();
        boolean geeignet = false;
        int counterUpper = 0;
        int counterLower = 0;
        for (int i = 0; i < passwort.length;i++){
            if(Character.isUpperCase(passwort[i])){
             counterUpper += 1;
            }
            if(Character.isLowerCase(passwort[i])){
                counterLower += 1;
            }

        }
        int counterNumber = 0;
        for (int i = 0; i < passwort.length;i++){
            if((passwort[i]) > 0){
                counterNumber += 1;
            }
            else{
                counterNumber = counterNumber;
            }
        }
        if (passwort.length >= 8) {
            if (counterUpper >= 2) {
                if (counterLower >= 2) {
                    if (counterNumber >= 2) {
                        geeignet = true;
                    } else {
                        geeignet = false;
                    }
                } else {
                    geeignet = false;
                }
            } else {
                geeignet = false;
            }
        } else {
            geeignet = false;
        }
        return geeignet;
    }

    public PrüfPasswort (String Passwort){
        if (alsPWgeeignet(Passwort)){
            Passworttrue = Passwort;//.toCharArray();
        }
        else{
            Passworttrue = null;
        }
    }

    public static String Sternchen(String Passwort){
        String PasswortStern = "";
        PrüfPasswort passwort1 = new PrüfPasswort(Passwort);
        char[] Passwort1 = Passwort.toCharArray();
        if(Passworttrue == null){
            System.err.println("ICH HASSE ALLES!");
        }else{
            for (int i = 0; i < Passwort1.length; i++){
                PasswortStern += '*';
            }
        }


        return PasswortStern;
    }

}

