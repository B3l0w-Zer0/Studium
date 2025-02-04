package Prüfungsvorbereitung;

public class PrüfErsetzeZeichen {
    public static void main(String[] args){
        String name = "Graphik.Init.Datei.ini";
        char[] array = name.toCharArray();
        System.out.println(ersetzeHurensohn(array));

    }

    public static int ersetzeHurensohn(char[] array){
        int zaehler = 0;
        for (int i = 0; i < array.length - 4; i++){
            if (array[i] == '.'){
                array[i] = '_';
                zaehler++;
            }
        }
        System.out.println(array);
        return zaehler;
    }

}
