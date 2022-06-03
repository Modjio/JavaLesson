import java.util.Scanner;

public class CreditPayment {
    public static void main(String[] args) {
        double annualRate, monthlyPayment, monthlyAnnualRate, costOfCredit, loanAmount;
        int yearOfCredit, monthsOfCredit;

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

        System.out.print("Введите ежегодную процентную ставку, например 8,25: ");
        annualRate = input.nextDouble();

        System.out.print("Введите необходимую сумму кредита, например 120000,95: ");
        loanAmount = input.nextDouble();

        System.out.print("Введите количество лет погашения кредита, например 5: ");
        yearOfCredit = input.nextInt();

        // Расчёт

        monthsOfCredit = yearOfCredit * MONTHS_PER_YEAR;          // срок кредита в месяцах
        monthlyAnnualRate = annualRate / MONTHS_PER_YEAR / 100;   // ежемесячная процентная ставка в долях процента
        /* с долей процента честно не понял, на данный момент...  */

        monthlyPayment = (loanAmount * monthlyAnnualRate) / (1 - 1 / Math.pow((1 + monthlyAnnualRate),monthsOfCredit) );    // формула ежемесячного платёжа
        costOfCredit = monthlyPayment * monthsOfCredit;           // формура стоимость кредита

        // Выводимые данные:
        // Ежемесячный платёж
        System.out.println("Ежемесячный платёж состовляет " + (int)(monthlyPayment * 100) / 100.0 + " рублей.");
        // Стоимость кредита
        System.out.println("Стоимость кредита состовляет " + (int)(costOfCredit * 100) / 100.0 + " рублей.");
    }
}
