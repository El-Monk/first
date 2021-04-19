import java.util.Scanner;

public class MainHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();

        if (number%2 == 0 && number >= 0)
            System.out.println("вы ввели четное число");
        else if (number > 0)
            System.out.println("число нечетное");
        else
            System.out.println("вы ввели отрицательное число");
    }
}
