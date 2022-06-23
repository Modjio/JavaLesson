import java.util.Scanner;
import java.time.LocalDate;

public class CalculationDepositVer2 {
    public static void main(String[] args) {
        final int MONTHS_OF_YEAR = 12; // месяцев в году
        final int DAYS_YEAR = 365; // дней в году
        int firstYear, firstMonth, depositTerm;
        double interestRateYear, depositAmount;
        double accruedInterestPerMonth; // доход по вкладу в текущем месяце
        double accruedInterestTotal = 0; // суммарный доход по вкладу
        int monthsCount = 0; // счетчик месяцев

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

        int i = firstYear; // присваиваем переменной год открытия вклада, как часть условия проверки на continue

        while (monthsCount < depositTerm) { // выполняем пока счетчик месяцев меньше срока вклада
            // в цикле будем увеличивать счетчик месяцев на 1
            for (int j = 1; j <= MONTHS_OF_YEAR; j++) { // итерация по месяцам с 1 до 12
                // Если номер месяца меньше или равно номеру месяца открытия вклада
                // то переходим к следующему месяцу, он не попадает в интервал
                if (i == firstYear && j <= firstMonth) {
                    continue; // пропускаем текущую итерацию, переходим к следующему месяцу
                }
                // Если номер текущего месяца равен сроку вклада, то расчет заканчиваем и выходим из цикла
                if (monthsCount == depositTerm) {
                    // выходим из текущего цикла for, из внешнего цикла while выходим по условию monthsCount < depositTerm
                    break;
                }

                // Получаем количество дней в текущем месяце
                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();

                // Рассчитаем доход по вкладу в текущем месяце
                accruedInterestPerMonth = depositAmount * interestRateYear / 100 / DAYS_YEAR * lengthOfMonth;

                // округление до копейки
                accruedInterestPerMonth = Math.round(accruedInterestPerMonth * 100) / 100.0;

                // Вывести результат начисленных процентов в месяце
                System.out.println("Начислено процентов в " + i + " году " + j + " месяца = " + accruedInterestPerMonth + " руб.");

                // Добавим процент по вкладам текущего месяца к суммарной выплате
                accruedInterestTotal += accruedInterestPerMonth;

                monthsCount++; // увеличим счетчик месяцев на 1

            }
            i++; // увеличим год на 1
        }
        // Вывести итоговый результат начисленных процентов
        System.out.println("\nВсего процентов по вкладу: " + accruedInterestTotal + " руб.");
    }
}
