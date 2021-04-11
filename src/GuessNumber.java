import java.util.Scanner;

// индекс массы

public class GuessNumber {
        public static void main(String[] args) {
            System.out.print("Введите массы тела (кг) " + "- ");
            Scanner scanner = new Scanner(System.in);
            double operand1 = scanner.nextInt();

            System.out.print("Введите ваш рост (cм) " + "- ");
            double operand2 = scanner.nextInt();

            double rost = operand2*operand2/10000;
            double imt = operand1/rost;

            if (imt <= 16)   {
                System.out.println("У вас выраженный дефицит масса тела");
            }
            if (imt > 16 && imt <= 18.5)    {
                System.out.println("У вас недостаточная(дефицит) масса тела");
            }
            if (imt > 18.5 && imt < 25)    {
                System.out.println("У вас нормальная масса тела");
            }
            if (imt >= 25 && imt <= 30)    {
                System.out.println("У вас избыточная масса тела");
            }
            if (imt > 30 && imt <= 35)    {
                System.out.println("У вас первая степень ожирения");
            }
            if (imt > 35 && imt <= 40)    {
                System.out.println("У вас вторая степень ожирения");
            }
            if (imt > 40)    {
                System.out.println("У вас третья степень ожирения");
            }
        }
}

