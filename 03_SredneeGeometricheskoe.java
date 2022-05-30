import java.util.Scanner;

public class SredneeGeometricheskoe {
  public static void main(String[] args) {
    double number1, number2, number3; // объявление переменных
    
    // Задача: вычислить среднее геометрическое трёх чисел по формуле
    // корень кубический из x1*x2*x3

    Scanner input = new Scanner(System.in); // создание объекта типа Scanner
    
    // Получить 3 числа
    System.out.print("Введите три числа через пробел: ");
    number1 = input.nextDouble();
    number2 = input.nextDouble();
    number3 = input.nextDouble();

    // Отобразить среднее геометрическое трех чисел
    System.out.println("Среднее геометрическое трех чисел равно " + 
    Math.cbrt(number1 * number2 * number3));
  } 
}