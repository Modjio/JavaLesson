import java.util.Scanner;

public class OstatokOtDeleniya {
  public static void main(String[] args) {
    int answer;
    
    Scanner input = new Scanner(System.in);
    
    // Небольшой тест с проверкой ответа
    System.out.println("Проверка на понимание как работает остаток от деления");
    
    // 56 % 6
    System.out.print("Сколько будет 56 % 6? ");
    answer = input.nextInt();
    
    if (answer == 56 % 6) System.out.println("Верно");
    else System.out.println("Неверно");
    
    // 78 % -4
    System.out.print("Сколько будет 78 % -4? ");
    answer = input.nextInt();
    
    if (answer == 78 % -4) System.out.println("Верно");
    else System.out.println("Неверно");
        
    // -34 % 5
    System.out.print("Сколько будет -34 % 5? ");
    answer = input.nextInt();
    
    if (answer == -34 % 5) System.out.println("Верно");
    else System.out.println("Неверно");
    
    // -34 % -5
    System.out.print("Сколько будет -34 % -5? ");
    answer = input.nextInt();
    
    if (answer == -34 % -5) System.out.println("Верно");
    else System.out.println("Неверно");

    // 5 % 1
    System.out.print("Сколько будет 5 % 1? ");
    answer = input.nextInt();
    
    if (answer == 5 % 1) System.out.println("Верно");
    else System.out.println("Неверно");
    
    // 1 % 5
    System.out.print("Сколько будет 1 % 5? ");
    answer = input.nextInt();
    
    if (answer == 1 % 5) System.out.println("Верно");
    else System.out.println("Неверно");

    // Заключение
    System.out.println("Ну, как-то так");    
  }
}
