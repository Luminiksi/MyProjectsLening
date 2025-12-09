package main.try_2.strings;

import main.try_2.myFeatures.Printer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.try_1.myFeatures.Colors.ANSI_PURPLE;
import static main.try_1.myFeatures.Colors.ANSI_RESET;

public class Lesson_9_7 {

    public static void run() {
        Printer.printLessonNumber(7, 9);
        Printer.printLessonName("Регулярные выражения");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Замена одних фрагментов строк на другие");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Разбиение строк на фрагменты");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Проверка соответствия строк шаблону");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Поиск фрагментов строк, соответствующих шаблону");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Маски в регулярных выражениях");
        task5();
        System.out.println();
        printInfo();
    }

    public static void task1() {
        String phone1 = "+7 903 712-37-54";
        String phone2 = "7 (903) 968-60-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9616245";

        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
    }

    public static String formatPhoneNumber(String phone) {
        //String regex = "[0-9a-f]";
        String regex = "[^0-9]";
        return phone.replaceAll(regex, "");
    }

    public static void task2() {
        String text = "I know something about it";
        // \\s - любой пробельный символ
        String[] words = text.split("\\s");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println();

        String text1 = "I  know\tsomething   about\n  it";
        //Добавим символ плюса, означающий, что пробельный символ может встретиться как один раз, так и несколько
        String[] words1 = text1.split("\\s+");
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i]);
        }
    }

    public static void task3() {
        System.out.println("Пример на автомобольных номерах");
        String number = "А674МР197";
        System.out.println(number);
        System.out.println("Проверим его корректность");
//        Можно использовать только эти буквы
//        String regex = "АВЕКМНОРСТУХ";
//        первая буква:
//        String regex = "[АВЕКМНОРСТУХ]";
//        Далее 3 цифры
//        String regex = "[АВЕКМНОРСТУХ][0-9]{3}";
//        Потом 2 буквы
//        String regex = "[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}";
//        А потом 2 или 3 цифры региона
//        String regex = "[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{2,3}";
//        упростим и перечисление букв вынесем в отдельную переменную
        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regex = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex));
    }

    public static void task4() {
        String text = "Алексей, добрый день!\nМой гитхаб — https://github.com/, " +
                "а также ссылка на мой персональный сайт — https://www.skillbox.ru/\n" +
                "Если возникнут вопросы, пишите мне напрямую. Я всегда доступен";
        System.out.println("Попробуем найти ссылку в следующем тексте:");
        System.out.println(text);

//        Ссылка начинается с
//        String regex = "https://";
//        Так выглядит начало любой ссылки, представленной в письме выше.
//        Далее могут быть разные символы, и после ссылки — пробел или запятая.
//        Можно написать, что должны идти любые символы, кроме запятой и пробела:
        String regex = "https://[^,\\s]+";
//        Квадратные скобки - обозначают набор символов, и в нём как раз два символа: запятая и пробельный символ \\s
//        П«Крышечка» — ^ — в начале набора символов (внутри квадратных скобок) означает отрицание этого набора.
//        То есть это обратный набор — все символы, кроме входящих в этот набор — все символы, кроме пробела и запятой.
//        Символ плюса после символа, в том числе после набора символов, означает, что эти символы, которые «не запятая» и
//        «не пробельный символ», могут встречаться один или более раз.
//        с помощью этого выражения найдём все ссылки в нашем тексте. Для этого воспользуемся специальным классом Pattern:
        Pattern pattern = Pattern.compile(regex);
//        С помощью специального класса Matcher, использующего паттерн, переберём фрагменты, которые этому паттерну,
//        а точнее переданному в паттерн регулярному выражению, соответствуют:
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
//        второй вариант:
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
    }

    public static void task5() {
        String text = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени все документы!» " +
                "На что Анна ему ответила: «А документы-то так и не привезли». Дмитрий удивлённо посмотрел на неё и сказал: «Ну и ладно», " +
                "— вздохнул, махнул рукой и удалился.";
        System.out.println("Найдем и извлечем все фрагменты в кавычках, в тексте:");
        System.out.println(text);
//        Это мы получим цитаты с кавычками
//        String regex = "«[^»]+»";
//        А тут получим без кавычек
        String regex = "«([^»]+)»";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
//            Для работы с масками у класса Matcher есть метод group, в качестве параметра
//            в который можно передавать порядковый номер маски, начиная с единицы.
//            То есть:
//            matcher.group(1); вернёт содержимое первой маски - то есть без кавычек
//            matcher.group(2); — второй (хз тут не работает
//            matcher.group(0); будет возвращать целиком весь соответствующий регулярному выражению текст - с кавычками
//            matcher.group(); аналог matcher.group(0)

            String citation = matcher.group(1);
            System.out.println(citation);
        }
    }

    public static void printInfo() {
        System.out.println(ANSI_PURPLE + "Информация из урока!!!!");
        System.out.println("________________________________________________");
        System.out.println("\tЭлементы синтаксиса регулярных выражений");
        System.out.println("________________________________________________" + ANSI_RESET);
        System.out.println("\tВыражение\t\t|\t\t\t\tОписание");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\t[abc]\t\t|\tНабор символов. Данное выражение соответствует любому символу из " +
                "перечисленных в квадратных скобках. Например, регулярное выражение [13579] будет соответствовать символу, " +
                "являющемуся нечётным числом.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\t[^abc]\t\t|\tОтрицание набора символов. Данное выражение соответствует любому символу, " +
                "кроме перечисленных в квадратных скобках. Символ-«крышечка» — ^ — не входит в этот набор и обозначает отрицание набора.\n" +
                "\t\t\t\t\t|\tНапример, регулярное выражение [^xyz] будет соответствовать любому символу, кроме букв x, y и z.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\t[0-9]\t\t|\tДиапазон символов. Дефис означает, что в набор символов входят все цифры от 0 до 9. Например, " +
                "регулярное выражение [a-z] будет соответствовать любой строчной латинской букве.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\t\\\\s\t\t\t|\tПробельный символ — пробел, символ переноса строки, символ табуляции или иной пробельный символ.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\tn+\t\t\t|\tОдин или несколько символов n. Например, регулярное выражение [0-9]+ будет соответствовать всем числам, " +
                "независимо от того, состоят ли они из одной или нескольких цифр. При этом, если в числе есть точка, " +
                "запятая или хотя бы один пробел, оно не будет соответствовать такому выражению.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\tn*\t\t\t|\tНоль, один или несколько символов n. Например, регулярное выражение [A-Z][a-zA-Z]* " +
                "будет соответствовать как просто отдельным прописным буквам, так и всем прописным буквам, " +
                "после которых идут прописные или строчные буквы в любом количестве," +
                "\n\t\t\t\t\t|\tнапример:\n" +
                "\t\t\t\t\t|\tA \n" +
                "\t\t\t\t\t|\tAn \n" +
                "\t\t\t\t\t|\tArticle \n" +
                "\t\t\t\t\t|\tANTICS");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\tn?\t\t\t|\tНоль или один символ n. Например, регулярное выражение https?:// будет соответствовать как строкам http://, " +
                "так и строкам https://, поскольку после буквы s стоит вопросительный знак, означающий, " +
                "что буква s может присутствовать или отсутствовать.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\tn{5}\t\t|\tСимвол n, встречающийся пять раз. Например, выражение [1-9][0-9]{3} " +
                "будет соответствовать всем числам, состоящим из четырёх цифр, и начинающихся с цифр от 1 до 9.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\tn{5,}\t\t|\tСимвол n, встречающийся пять и более раз. Например, регулярное выражение [A-Z]{2,} " +
                "будет соответствовать всем строкам, состоящим из двух и более прописных букв.");
        System.out.println("\t\t\t\t\t|\t");
        System.out.println("\t\tn{5,8}\t\t|\tСимвол n, встречающийся пять-восемь раз. Например, регулярное выражение:\n" +
                "\t\t\t\t\t|\t[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} \n" +
                "\t\t\t\t\t|\tбудет соответствовать всем IP-адресам стандарта IPv4, которые имеют такой вид:\n" +
                "\t\t\t\t\t|\t192.168.0.1\n" +
                "\t\t\t\t\t|\t0.0.0.0\n" +
                "\t\t\t\t\t|\t255.255.255.0\n" +
                "\t\t\t\t\t|\tПри этом важно, что каждое число в таких адресах может быть в диапазоне от 0 до 255, и " +
                "проверить это при помощи регулярных выражений сложнее (см. ссылку в допматериалах).");
        System.out.println(ANSI_PURPLE + "________________________________________________" + ANSI_RESET);
    }
}
