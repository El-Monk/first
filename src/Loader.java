import java.util.Scanner;

public class Loader {

        public static void main(String Scanner[]) {

            System.out.println("Введите два числа");
            java.util.Scanner scanner = new Scanner(System.in);
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            for (int i = operand1; i < operand2; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
}
