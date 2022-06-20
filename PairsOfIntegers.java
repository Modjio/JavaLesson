/*
Напишите программу с интерактивным циклом проверки правильности ввода данных,
 считывающую пары целых чисел до тех пор, пока не встретит пару,
  в которой одно из чисел кратно другому.
 */

import java.util.Scanner;

public class PairsOfIntegers {
    public static void main(String[] args) {
        int number1, number2;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите два числа через пробел: ");
            number1 = input.nextInt();
            number2 = input.nextInt();
        } while (number1 % number2 != 0 && number2 % number1 != 0);
        // логика такова, что для выхода из цикла нужно получить false
        // логичное || не подходит, так как при любом удобном случае возвращаться будет true и цикл повторится
        // при && если одно из чисел делится без остатка, то оно не может быть !=0 и мы получаем false и выходим из цикла
        // потратил минут 20 на осознание всего этого =)

        System.out.println("Числа кратные");
    }
}
