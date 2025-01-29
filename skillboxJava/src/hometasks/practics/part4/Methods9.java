package hometasks.practics.part4;

public class Methods9 {
    public static void main(String[] args) {
        User dmitry = new User("Дмитрий", 45);
        User nastya = new User("Настя", 32);

        printUserInfo(dmitry);
        printUserInfo(nastya);
    }

    public static void printUserInfo(User user) {
        String age = checkYear(user.getAge());
        System.out.println("Пользователь: " + user.getName() + ", " + user.getAge() + " " + age);
    }

    public static String checkYear(int age){
        String ageName = "лет";
        if (age % 10 == 1) {
            return "год";
        } else if (age == 12 || age == 13 || age == 14) {
            return "года";
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            return "года";
        }
        return "лет";
    }
}
