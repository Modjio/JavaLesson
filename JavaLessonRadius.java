import java.util.Scanner;

public class Radius {
  public static void main(String[] args) {
    //  Требуется получить от пользователя радиус окружности, 
    //  вычислить и отобразить длину окружности. 
 
    double radius; // радиус окружности
    double dlinna; // длина окружности
    final double PI = 3.14159; // константа ПИ
    
    Scanner input = new Scanner(System.in); // создание объекта типа Scanner
    
    // Получить (от пользователя) радиус окружности
    System.out.print("Введите радиус окружности: ");
    radius = input.nextDouble();

    // Вычислить длину окружности через радиус по формуле P=2πR
    dlinna = 2 * PI * radius;

    // Отобразить длину окружности
    System.out.println("Длинна окружности для радиуса " +
      radius + " равна " + dlinna + ".");
  } 
}
