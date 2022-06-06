// Напишите программу, которая получает от пользователя
// вес в килограммах и рост в сантиметрах, а отображает и интерпретирует его BMI.

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double bmi, weight, height;
        //final int SMS_PER_METER = 100;

        Scanner input = new Scanner(System.in);

        // Вводная информация
        System.out.print("Введите свой вес в килограммах: ");
        weight = input.nextDouble();
        System.out.print("Введите свой рост в сантиметрах: ");
        height = input.nextDouble();

        // Решение по формуле BMI = вес / рост в квадрате
        bmi = weight / Math.pow(height,2) * 1E+4;
        //BMI = weight / (height / SMS_PER_METER * height / SMS_PER_METER); // эта формула не корректно считает

        // Выводимая информация
        System.out.println("Ваш индекс массы тела равен " + (int)(bmi * 100) / 100.0);

        // Интерпритация и вывод результата
        if (bmi < 18.5)         // Если ИМТ меньше 18,5
            System.out.println("У Вас недостаточный вес");
        else if (bmi < 25)      // Если ИМТ не меньше 18,5 и меньше 25
            System.out.println("ИМТ в пределах нормы");
        else if (bmi < 30)      // Если ИМТ не меньше 25 и меньше 30
            System.out.println("У Вас избыточный вес");
        else                    // Если ИМТ больше или равно 30
            System.out.println("У Вас ожирение");
    }
}
