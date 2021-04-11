import java.util.Random;
import java.util.Scanner;

public class Zada4a_4 {
    public static void main(String[] args) {
        //Создаем экземпляр класса Random()
        Random rand = new Random();
        //Создаем переменную типа int
        int randInt;
        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 100");
        while (true)    {

            System.out.println("Введите число");
            int operand1 = scanner.nextInt();
            if (randInt == operand1)    {
                System.out.println("Поздравляю, вы угадали");
                break;
            }
            else if (randInt > operand1)    {
                System.out.println("ваше число меньше загаданного");
            }
            if (randInt < operand1)    {
                System.out.println("ваше число больше загаданного");
            }
        }
    }
}
