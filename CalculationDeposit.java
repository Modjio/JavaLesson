/*
Написать программу, которая вычисляет ежемесячные проценты по вкладу (без капитализации),
 исходя из введенных пользователем месяца и года открытия вклада, срока вклада в месяцах,
  годовой процентной ставки и суммы вклада в рублях. Пусть количество дней в году будет
   всегда равно 365, т.е. високосные года в вычислениях не учитываются.
*/

import java.util.Scanner;

public class CalculationDeposit {
    public static void main(String[] args) {
        final int MONTHS_OF_YEAR = 12;
        int firstYear, firstMonth, depositTerm;
        double interestRateYear, interestRateMonth, depositAmount, capitalizationAmount;

        Scanner input = new Scanner(System.in);

        // Вводные данные месяц и год открытия вклада
        System.out.print("Введите год открытия вклада: ");
        firstYear = input.nextInt();
        System.out.print("Введите месяц открытия вклада: ");
        firstMonth = input.nextInt();

        // срок вклада в месяцах
        System.out.print("Введите срок вклада в месяцах (подсказка: 1 год = 12 месяцам): ");
        depositTerm = input.nextInt();

        // годовой процентной ставки и суммы вклада в рублях
        System.out.print("Введите годовую процентную ставку: ");
        interestRateYear = input.nextDouble();
        System.out.print("Введите сумму вклада в рублях: ");
        depositAmount = input.nextDouble();

        // Вычисление
        interestRateMonth = interestRateYear / MONTHS_OF_YEAR; // Вычисление месячной процентной ставки

        capitalizationAmount = depositAmount * (interestRateMonth / 100); // Капитализация вклада за 1 месяц

        // Выводные данные. Сумма ежемесячных процентов по вкладу
        System.out.println("\nЕжемесячная процентная ставка: " + (int)(interestRateMonth * 100) / 100.0 + "%");
        System.out.println("Ежемесячная капитализация по вкладу: " + (int)(capitalizationAmount * 100) / 100.0 + " руб.");
        System.out.println("Через " + depositTerm + " месяцев проценты по вкладу составят " + (int)(capitalizationAmount * depositTerm * 100) / 100.0 + " руб.");
        System.out.println("Сумма вклада плюс проценты по вкладу: " + (int)((depositAmount + capitalizationAmount * depositTerm) * 100) / 100.0 + " руб.");
    }
}
