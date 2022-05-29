import java.util.Scanner;

public class Radius {
  public static void main(String[] args) {
    //  Требуется получить от пользователя радиус окружности, 
    //  вычислить и отобразить длину окружности. 
 
    double radius; // радиус круга
    double dlinna; // длинна круга
    final double PI = 3.14159; // константа ПИ
    
    Scanner input = new Scanner(System.in); // создание объекта типа Scanner
    
    // Получить (от пользователя) радиус круга
    System.out.print("Введите радиус круга: ");
    radius = input.nextDouble();

    // Вычислить длинну окружности через радиус по формуле P=2πR
    dlinna = 2 * PI * radius;

    // Отобразить длинну круга
    System.out.println("Длинна круга для радиуса " +
      radius + " равна " + dlinna + ".");
  } 
}
