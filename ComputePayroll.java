/*
Напишите программу, которая вычисляет и отображает зарплату каждого сотрудника,
 а также общую зарплату компании, исходя из отработанного каждым сотрудником
 времени в часах и часовой ставки в рублях.
 */

import java.util.Scanner;

public class ComputePayroll {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Входные данные:

        int number_emp; // количество сотрудников
        double hours; // отработанные часы
        double rate; // часовая ставка в руб.

        //Переменные программы:

        int count_emp; // текущий сотрудник

        //Выходные данные:

        double pay; // зарплата текущего сотрудника в руб.
        double total_pay; // общая зарплата компании

        count_emp = 0; // инициализация переменной
        total_pay = 0; // инициализация переменной

        System.out.print("Введите количество сотрудников компании: "); // количество циклов
        number_emp = input.nextInt();

        while (count_emp < number_emp) {
            System.out.println("\nСотрудник № " + ++count_emp); // Номер сотрудника + счётчик цикла

            System.out.print("Введите количество отработаных часов: ");
            hours = input.nextDouble();
            System.out.print("Введите часовую ставку сотрудника в рублях: ");
            rate = input.nextDouble();

            //Формулы расчёта:
            pay = hours * rate; // зарплата сотрудника
            total_pay += pay; // зарплата компании

            System.out.print("Зарплата сотрудника: " + pay + " руб.\n");

        }
        System.out.println("\nОбщая зарплата компании состовляет: " + total_pay + " руб.");
    }
}