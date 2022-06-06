import java.util.Scanner;

public class TestSomeThing {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        boolean even = number % 2 == 0;

        System.out.println(even);
    }
}
