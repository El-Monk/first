public class Main4 {
    public static void main(String[] args) {
        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");

        bigCat.setName("Pushok");

        System.out.println("Вес большой кошки = " + bigCat.getName());
        System.out.println("Вес маленькой кошки = " + smallCat.getName());
    }
}
