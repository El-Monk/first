public class Main {



    public class Solution {

        public void solution(int number) {
            //TODO: Code stuff here
            int a = 0;
            if (number > 0 && (number % 3 == 0 || number % 5 == 0)) {
                a = a + number;
                System.out.println(a);
            }
            System.out.println("Privet GitHub");
        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        char[] arr = text.toCharArray();
//        String result ="";
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            result = result + arr[i];
//        }
//        System.out.println(result);;
//    }
}
