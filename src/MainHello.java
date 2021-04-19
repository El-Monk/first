import java.util.Scanner;

public class MainHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();

        if (number%2 == 0 )
            System.out.println("вы ввели четное число");
        else
            System.out.println("вы ввели нечетное число");


    }
}
