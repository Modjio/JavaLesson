// Напишите программу, которая получает от пользователя
// вес в килограммах и рост в сантиметрах, а отображает и интерпретирует его BMI.

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int weight, height;
        double BMI;

        Scanner input = new Scanner(System.in);

        // Вводная информация
        System.out.print("Введите свой вес в килограммах: ");
        weight = input.nextInt();
        System.out.print("Введите свой рост в сантиметрах: ");
        height = input.nextInt();

        // Решение по формуле BMI = вес / рост в квадрате
        BMI = weight / Math.pow(height,2) * 10000;
        //BMI = weight / (height / 100 * height / 100); // эта формула не работает

        // Выводимая информация
        System.out.println("Ваш индекс массы тела равен " + (int)(BMI * 100) / 100.0);

        // Интерпритация и вывод результата
        if (BMI < 18.5)         // Если ИМТ меньше 18,5
            System.out.println("У Вас недостаточный вес");
        else if (BMI < 25)      // Если ИМТ не меньше 18,5 и меньше 25
            System.out.println("ИМТ в пределах нормы");
        else if (BMI < 30)      // Если ИМТ не меньше 25 и меньше 30
            System.out.println("У Вас избыточный вес");
        else                    // Если ИМТ больше или равно 30
            System.out.println("У Вас ожирение");
    }
}
