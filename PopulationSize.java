/*
В городе, чье население с каждым годом растет на 10%, живет 9 870 человек.
 Напишите программу, которая отображает ежегодную численность населения и определяет,
  через сколько лет (count_years) она будет превышать 30 000 человек.
 */

public class PopulationSize {
    public static void main(String[] args) {
        int count_years;
        double cityPopulation;

        cityPopulation = 9870;  // по условию задачи, исходное население
        count_years = 0;        // количество лет

        // Цикл увеличивает количество лет на 1 и увеличивает популяцию на 10% пока оно < 30.000
        while (cityPopulation < 30000) {
            System.out.print("Текущая численость населения: " + (int)cityPopulation + " человек.\n");
            System.out.println("Проходит " + ++count_years + " год(а). Население увеличивается на 10%...\n");
            cityPopulation *= 1.1; // +10% к популяции
        }
        System.out.println("Потребуется " + count_years + " лет. Итоговое население " + (int)cityPopulation + " человек.");
    }
}