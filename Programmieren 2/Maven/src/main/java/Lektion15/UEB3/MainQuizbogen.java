package Lektion15.UEB3;

public class MainQuizbogen {
    public static void main(String[] args) {
QuizFragen[] quizFragen = new QuizFragen[4];
    quizFragen[0] = new Lektion15.UEB3.TextFragen("Was ist 2 + 2?");
    quizFragen[1] = new Lektion15.UEB3.TextFragen("Was ist 3 + 2?");
    quizFragen[2] = new Lektion15.UEB3.TextFragen("Was ist 4 + 2?");
    String [] antowrt = {"A: 3", "B: 4", "C: 5" };
    quizFragen[3] = new Lektion15.UEB3.MulitpleFragen("Was ist 2 + 2?", antowrt);

    for (int i = 0; i < quizFragen.length; i++) {
        quizFragen[i].ausgabe();
    }

    }
}
