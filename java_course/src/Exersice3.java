import java.util.Scanner;
import java.security.SecureRandom;

public class Exersice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lower = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String special = "!@#$%^&*()-_+=<>?";
        final String all = upper + lower + digits + special;

        System.out.print("Введите длину пароля: ");
        int passwordLength = scanner.nextInt();

        if (passwordLength < 8 || passwordLength > 12) {
            System.out.println("Длина пароля должна быть от 8 до 12 символов");
            return;
        }

        StringBuilder password = new StringBuilder(passwordLength);
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        for (int i = 4; i < passwordLength; i++) {
            password.append(all.charAt(random.nextInt(all.length())));
        }

        char[] randomPasswordChar = password.toString().toCharArray();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(passwordLength);
            char temp = randomPasswordChar[i];
            randomPasswordChar[i] = randomPasswordChar[randomIndex];
            randomPasswordChar[randomIndex] = temp;
        }

        String randomPassword = new String(randomPasswordChar);
        System.out.println("Сгенерированный пароль: " + randomPassword);

        scanner.close();
    }
}
