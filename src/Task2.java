public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(2020, "Honda", "Black");
        System.out.println(motorbike.getModel() + "\n" +
                motorbike.getYear() + "\n" +
                motorbike.getColor());
    }
}
