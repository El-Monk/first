public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.setYear(2000);
        car.setModel("audi");


        System.out.println(car.getYear() + " " + car.getModel() + " " + car.getColor());
    }
}
