import java.util.Locale;

public class Zada4a321 {
//    public static void main(String[] args) {
//        String a = "Sometime";
//        System.out.println(a.charAt(2));
//    }

    public static void main(String[] args) {
        String name1 = "Роман Иванов Васильевич";
        String name2 = "иван иванов Васильевич";

        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
        checkUserName(name1, name2);
    }
        public static void checkUserName(String name1, String name2) {
        String name1copy = name1.replace(" ","");
            if(name1.equals(name2) == true)
                System.out.println("Такой пользователь уже есть");
            else {
                System.out.println("Добро пожаловать в систему");
                System.out.println("А без пробелов ваше имя занимает " + name1copy.length() + " символов");
            }
        }
}
