package main.try_2.primitives.IntOrInteger;

public class Main {
    public static final int MAX_CHAR = 65536;

    public static void main(String[] args) {
        Container container = new Container(0);
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

//        for (int i = 1040; i <= 1105; i++) {
//            char c = (char) i;
//            System.out.println(i + " - " +  c);
//        }
//        int i = 1025;
//        char c = (char) i;
//        System.out.println(i + " - " +  c);

        for (int i = 0; i <= MAX_CHAR; i++) {
            if ((char) i == 'Ё' || (char) i == 'ё') {
                System.out.println((char) i);
            } else if ((char) i >= 'А' && (char) i <= 'я') {
                System.out.println((char) i);
            }
        }
    }
}
