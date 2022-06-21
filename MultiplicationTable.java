/*
Напишите программу, которая отображает таблицу умножения для чисел от 0 до 9.
** Чуть дополнил, программа запрашивает два числа и строит таблицу умножения.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int x, y, num1, num2, min, max;

        Scanner input = new Scanner(System.in);

        System.out.print("Таблица умножения ОТ и ДО чисел через пробел: ");
        num1 = input.nextInt(); // получаем первое
        num2 = input.nextInt(); // и второе число

        // выясняем какое из чисел большее, что бы таблица смотрелась красиво
        if (num1 > num2) { // если первое число больше второго
            max = num1;
            min = num2;
        }
        else { // если второе число больше первого
            max = num2;
            min = num1;
        }

        System.out.print("\n\t"); // отступ в левом вернем углу таблицы
        for (x = min; x <= max; x++) { // верхняя строка чисел ОТ и ДО через табуляцию
            System.out.print(x + "\t");
        }
        System.out.println(); // переход ко второй строке таблицы

        for (y = min; y <= max; y++) { // заполнение таблицы
            x = min; // присваиваем минимальное (начальное) значение
            System.out.print(y + "\t"); // выводим левый столбец ОТ и ДО
            while (x <= max) { // цикл заполнения всей строки таблицы
                System.out.print(x * y + "\t");
                ++x;
            }
            System.out.println(); // переход на следующую строку в таблице
        }
    }
}