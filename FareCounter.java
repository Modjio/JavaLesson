import java.util.Scanner;

public class FareCounter {
    public static void main(String[] args) {
        int initialOdometerReadings, finalOdometerReadings, distanceTraveled;
        double fare;

        final double PRICE = 8.5;

        // Напишите программу, которая вычисляет стоимость проезда в такси в зависимости
        // от расстояния из расчета 8 руб. 50 коп. за километр.

        Scanner input = new Scanner(System.in);

        // Вводные данные от пользователя:
        // Начальные показания одометра
        // Конечные показания одометра

        System.out.print("Введите начальные показания одометра, например 13505: ");
        initialOdometerReadings = input.nextInt();

        System.out.print("Введите конечные показания одометра, например 13810: ");
        finalOdometerReadings = input.nextInt();

        // Расчёт
        distanceTraveled = finalOdometerReadings - initialOdometerReadings;     // вычисляем пройденный путь
        fare = distanceTraveled * PRICE;                                        // вычисляем стоимость пройденого пути

        // Выводимые данные:
        System.out.println("Вы проехали " + distanceTraveled + " км. Из расчета 8 руб. 50 коп. за км");
        System.out.println("Стоимость проезда равна " + (int)fare + " руб. " + (int)(fare % 1 * 100) + " коп.");
    }
}
