import java.util.Scanner;

public class AnglesTriangle {
    public static void main(String[] args) {
        double aX, aY, bX, bY, cX, cY, edgeA, edgeB, edgeC, angleA, angleB, angleC;

        Scanner input = new Scanner(System.in);

        // Вводная информация
        System.out.println("Для вычисления углов треугольника необходимо ввести координаты по осям x и y для трёх точек.");
        System.out.print("Введите координаты точки A по оси x: ");
        aX = input.nextDouble();
        System.out.print("Введите координаты точки A по оси y: ");
        aY = input.nextDouble();

        System.out.print("Введите координаты точки B по оси x: ");
        bX = input.nextDouble();
        System.out.print("Введите координаты точки B по оси y: ");
        bY = input.nextDouble();

        System.out.print("Введите координаты точки C по оси x: ");
        cX = input.nextDouble();
        System.out.print("Введите координаты точки C по оси y: ");
        cY = input.nextDouble();

        // Для вычисления размеров углов необходимо сначала вычислить длины сторон треугольника по формуле
        edgeA = Math.sqrt(Math.pow(bX - aX,2) + Math.pow(bY - aY,2));
        edgeB = Math.sqrt(Math.pow(cX - bX,2) + Math.pow(cY - bY,2));
        edgeC = Math.sqrt(Math.pow(aX - cX,2) + Math.pow(aY - cY,2));

        // Вычисляем размеры углов треугольника в градусах по формуле
        angleA = Math.toDegrees(Math.acos(-((Math.pow(edgeB,2)-Math.pow(edgeC,2)-Math.pow(edgeA,2)) / (2 * edgeA * edgeC))));
        angleB = Math.toDegrees(Math.acos(-((Math.pow(edgeA,2)-Math.pow(edgeB,2)-Math.pow(edgeC,2)) / (2 * edgeB * edgeC))));
        angleC = Math.toDegrees(Math.acos(-((Math.pow(edgeC,2)-Math.pow(edgeB,2)-Math.pow(edgeA,2)) / (2 * edgeB * edgeA))));

        // Выводимая информация
        System.out.println("При координатах A " + aX + " " + aY);
        System.out.println("При координатах B " + bX + " " + bY);
        System.out.println("При координатах C " + cX + " " + cY);
        System.out.println("Длина стороны A " + (int)(edgeA * 100) / 100.0 + " условных единиц");
        System.out.println("Длина стороны B " + (int)(edgeB * 100) / 100.0 + " условных единиц");
        System.out.println("Длина стороны C " + (int)(edgeC * 100) / 100.0 + " условных единиц");
        System.out.println("Угол A состовляет " + (int)(angleA * 100) / 100.0 + " градусов");
        System.out.println("Угол B состовляет " + (int)(angleB * 100) / 100.0 + " градусов");
        System.out.println("Угол C состовляет " + (int)(angleC * 100) / 100.0 + " градусов");
    }
}