import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double BYN_to_USD = 3.2998;
        final double BYN_to_EUR = 3.5987;
        final double BYN_to_RUB = 0.034;
        final double BYN_to_PLN = 0.82;
        final double BYN_to_UAH = 0.079;

        System.out.print("Введите сумму в беларусских рублях(BYN): ");
        double byn = scanner.nextDouble();

        double usd = byn / BYN_to_USD;
        double eur = byn / BYN_to_EUR;
        double rub = byn / BYN_to_RUB;
        double pln = byn / BYN_to_PLN;
        double uah = byn / BYN_to_UAH;

        System.out.println("Конвертированная сумма:");
        System.out.printf("В долларах (USD): %.2f%n", usd);
        System.out.printf("В евро (EUR): %.2f%n", eur);
        System.out.printf("В российских рублях (RUB): %.2f%n", rub);
        System.out.printf("В злотых (PLN): %.2f%n", pln);
        System.out.printf("В гривнах (UAH): %.2f%n", uah);

        scanner.close();
    }
}
