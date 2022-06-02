// Напишите программу, которая моделирует работу банкомата по выдаче
// введенной суммы денег наименьшим количеством рублевых купюр.

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        int amount;                             // сумма в российских рублях

        int numberOf5000Roubles;                // количество 5 тыс. руб. купюр
        int numberOf2000Roubles;                // количество 2 тыс. руб. купюр
        int numberOf1000Roubles;                // количество 1 тыс. руб. купюр
        int numberOf500Roubles;                 // количество 500 руб. купюр
        int numberOf200Roubles;                 // количество 200 руб. купюр
        int numberOf100Roubles;                 // количество 100 руб. купюр
        int numberOf50Roubles;                  // количество 50 руб. купюр

        Scanner input = new Scanner(System.in);

        System.out.print("Введите необходиму сумму, кратную 50: ");
        amount = input.nextInt();               // Получить сумму от пользователя

        numberOf5000Roubles = amount / 5000;    // Вычислить количество 5 тыс. руб. купюр
        amount %= 5000;                         // обновить оставшуюся сумму

        numberOf2000Roubles = amount / 2000;    // Вычислить количество 2 тыс. руб. купюр
        amount %= 2000;                         // обновить оставшуюся сумму

        numberOf1000Roubles = amount / 1000;    // Вычислить количество 1 тыс. руб. купюр
        amount %= 1000;                         // обновить оставшуюся сумму

        numberOf500Roubles = amount / 500;      // Вычислить количество 500 руб. купюр
        amount %= 500;                          // обновить оставшуюся сумму

        numberOf200Roubles = amount / 200;      // Вычислить количество 200 руб. купюр
        amount %= 200;                          // обновить оставшуюся сумму

        numberOf100Roubles = amount / 100;      // Вычислить количество 100 руб. купюр
        amount %= 100;                          // обновить оставшуюся сумму

        numberOf50Roubles = amount / 50;        // Вычислить количество 50 руб. купюр
        amount %= 50;                           // обновить оставшуюся сумму

        System.out.println("К выдаче подготовлены следующие купюры:");
        System.out.println("Купюры номиналом 5000 рублей - " + numberOf5000Roubles + " шт.");
        System.out.println("Купюры номиналом 2000 рублей - " + numberOf2000Roubles + " шт.");
        System.out.println("Купюры номиналом 1000 рублей - " + numberOf1000Roubles + " шт.");
        System.out.println("Купюры номиналом 500 рублей - " + numberOf500Roubles + " шт.");
        System.out.println("Купюры номиналом 200 рублей - " + numberOf200Roubles + " шт.");
        System.out.println("Купюры номиналом 100 рублей - " + numberOf100Roubles + " шт.");
        System.out.println("Купюры номиналом 50 рублей - " + numberOf50Roubles + " шт.");
        System.out.println("Не выдаваемый остаток " + amount + " рублей.");
    }
}