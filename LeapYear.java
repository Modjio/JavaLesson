// Напишите программу, которая определяет, является ли введенный год високосным или нет.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;

        Scanner input = new Scanner(System.in);

        // Вводная информация
        System.out.print("Введите год: ");
        year = input.nextInt();

        // Решение по формуле:
        // Год считается високосным, если он делится без остатка на 4,
        // но при этом не делится на 100, кроме случая, когда он делится без остатка на 400.
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Выводимая информация
        System.out.println(year + " год високосный? - " + isLeapYear);
    }
}
