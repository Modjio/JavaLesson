public class GreenwichMeanTime {
    public static void main(String[] args){
        final int MILLISECONDS_PER_SECOND = 1000; // 1 секунда содержит 1000 миллисекунд
        final int SECONDS_PER_MINUTE = 60; // 1 минута содержит 60 секунд
        final int MINUTES_PER_HOUR = 60; // 1 час содержит 60 минут
        final int HOURS_PER_DAY = 24; // 1 сутки содержат 24 часа

        // Входные данные:
        long totalMilliseconds; // общее количество миллисекунд, прошедших с 00:00:00 GMT 01/01/1970

        // Выходные данные:
        long currentHour; // текущее количество часов по Гринвичу
        long currentMinute; // текущее количество минут
        long currentSecond; // текущее количество секунд

        // Переменные программы:
        long totalSeconds; // общее количество секунд, прошедших с 00:00:00 GMT 01/01/1970
        long totalMinutes; // общее количество минут, прошедших с 00:00:00 GMT 01/01/1970
        long totalHours; // общее количество часов, прошедших с 00:00:00 GMT 01/01/1970

        totalMilliseconds = System.currentTimeMillis();

        // Вычисление
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY;

        // Вывод результата
        System.out.println("Текущее время по Гринвичу " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        System.out.println("Что равно " + totalMilliseconds + " миллисекунд");
    }
}
