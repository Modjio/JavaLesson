import java.util.Scanner;

public class CreditPayment {
    public static void main(String[] args) {
        double annualRate, M, i, T, A;
        int godCredit, n;

        final int MONTHS_PER_YEAR = 12;

        // Формула M = (A * i) / (1 - 1 / ((1 + i)n) )
        // T = M * n

        /* где M — ежемесячный платеж,
        А — сумма кредита,
        i — ежемесячная процентная ставка,
        n — срок кредита в месяцах,
        T — стоимость кредита. */

        Scanner input = new Scanner(System.in);

        // Вводные данные от пользователя:
        // Ежегодная процентная ставка
        // Сумма кредита
        // Количество лет

        System.out.print("Введите ежегодную процентную ставку, 8,25: ");
        annualRate = input.nextDouble();

        System.out.print("Введите сумму кредита, 120000,95: ");
        A = input.nextDouble();

        System.out.print("Введите количество лет погашения кредита, 5: ");
        godCredit = input.nextInt();

        // Расчёт

        n = godCredit * MONTHS_PER_YEAR;          // срок кредита в месяцах
        i = annualRate / MONTHS_PER_YEAR / 100;   // ежемесячная процентная ставка

        M = (A * i) / (1 - 1 / Math.pow((1 + i),n) );
        T = M * n;

        // Выводимые данные:
        // Ежемесячный платёж
        System.out.println("Ежемесячный платёж состовляет " + (int)(M * 100) / 100.0 + " рублей.");
        // Стоимость кредита
        System.out.println("Стоимость кредита состовляет " + (int)(T * 100) / 100.0 + " рублей.");
    }
}
