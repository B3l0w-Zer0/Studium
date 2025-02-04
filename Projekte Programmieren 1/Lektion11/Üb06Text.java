package Lektion11;

public class Üb06Text {
    public char[][] text;

    public int countChars(){
        int counter = 0;
        for (int i = 0; i < text.length; i++){
            for (int j = 0; j < text[i].length; j++){
                if (text[i][j] != ' '){
                    counter++;
                }
            }
        }
        return counter;
    }

    public char[][] getText() {
        return this.text;
    }

    public boolean vertauscheZeilen(int zeile1, int zeile2){
        if (!is_in_bounds(zeile1) || !is_in_bounds(zeile2)) {
            return false;
        }
        char[] tmp = text[zeile1];
        text[zeile1] = text[zeile2];
        text[zeile2] = tmp;
        return true;
    }
    public boolean is_in_bounds(int zeile) {
    return 0<= zeile && zeile < text.length;
    }
    
}
