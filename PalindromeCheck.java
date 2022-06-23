/*
Напишите программу, которая запрашивает у пользователя строку и отображает, является ли она палиндромом.
 */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        // Входные данные:
        String s; // строка

        // Переменные программы:
        int low; // индекс начала строки
        int high; // индекс конца строки
        boolean isPalindrome = true; // является ли палиндромом

        Scanner input = new Scanner(System.in);

        // получить строку от пользователя
        System.out.println("Введите строку для проверки на палиндром: ");
        s = input.nextLine();

        // исключить регистр
        s = s.toLowerCase();

        // убрать пробелы в начале и в конце строки
        s = s.trim();

        // определить индекс начала строки
        low = 0;

        // определить индекс конца строки
        high = s.length() -1;

        // посимвольно сравнить строку с исходником без учёта регистра ?и пробелов?
        for (int i = high; i >= 0; i--) {
            System.out.print(s.charAt(i)); // вывести строку наоборот
            if (s.charAt(i) != s.charAt(low)) {
                isPalindrome = false;   // символы не равны, это не палиндром
                break;                  // прерывание цикла проверки
            }
            low++;      // перебор символов строки
        }

        System.out.println(); // отступ ради отступа

        // строка является палиндромом? да нет
        System.out.println(isPalindrome ? "\nЭто палиндром" : "\nЭто не палиндром");
    }
}
