/*
Напишите программу, которая запрашивает у пользователя числовые значения,
 а выводит количество положительных и количество отрицательных введенных значений.
 В качестве значения сигнальной метки используйте 0.
 */

import java.util.Scanner;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
        int number, countPositive, countNegative;
        final int SENTINEL = 0; // константа для остановки цикла

        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число (для остановки введите 0): ");
        number = input.nextInt();

        countPositive = 0; // инициализация переменной
        countNegative = 0; // инициализация переменной

        // цикл будет продолжаться пока введённое значение не равно константе (0)
        while (number != SENTINEL)
        {
            if (number > 0) // условие: если введенное значение положительное, то
            {
                ++countPositive; // увеличиваем счётчик положительных чисел, иначе
            }
            else
            {
                ++countNegative; // увеличиваем счётчик отрицательных чисел
            }
            // повторно запрашиваем число для проверки условий цикла
            System.out.print("Введите целое число (для остановки введите 0): ");
            number = input.nextInt();
        }
        System.out.println("Введён 0 и цикл остановлен.\n");
        System.out.println("Количество положительных чисел: " + countPositive);
        System.out.println("Количество отрицательных чисел: " + countNegative);
    }
}