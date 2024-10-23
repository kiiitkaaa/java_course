import java.util.Scanner;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final String[] words = {"java", "program", "world", "language"};
        int lives = 6;
        boolean wordGuessed = false;
        String word = words[random.nextInt(words.length)];
        char[] hiddenWord = new char[word.length()];

        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }

        while (!wordGuessed && lives > 0) {
            System.out.println("Загаданное слово: " + String.valueOf(hiddenWord));
            System.out.println("Осталось жизней: " + lives);
            System.out.print("Введите букву: ");
            char letter = scanner.nextLine().charAt(0);

            boolean isCorrect = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    hiddenWord[i] = letter;
                    isCorrect = true;
                }
            }

            if (!isCorrect) {
                lives--;
                System.out.println("Вы ввели неверное слово и потеряли одну жизнь");
            }

            if (String.valueOf(hiddenWord).equals(word)) {
                wordGuessed = true;
            }
        }

        if (wordGuessed) {
            System.out.println("Вы угадали слово: " + word);
        } else {
            System.out.println("Игра окончена. Загаданное слово: " + word);
        }

        scanner.close();
    }
}
