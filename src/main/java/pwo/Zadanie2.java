package pwo;

public class Zadanie2 {
    public static final String FILE_NAME = "lucas_sequence.txt";

    public static void main(String[] args) {
        System.out.println("Lucas wersja 2");

        int n = 100; // liczba wyrazów do wygenerowania
        long[] lucasSequence = LucasGenerator.generateLucasSequence(n); // generowanie ciągu Lucasa

        LucasGenerator.saveLucasSequenceToFile(lucasSequence, FILE_NAME); // zapisywanie ciągu do pliku

        System.out.println("Wynik zapisany do pliku: " + FILE_NAME);
    }
}
