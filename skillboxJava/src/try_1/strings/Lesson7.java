package try_1.strings;

import try_1.myFeatures.Printer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static try_1.myFeatures.Colors.ANSI_PURPLE;
import static try_1.myFeatures.Colors.ANSI_RESET;

public class Lesson7 {

    private static final String REGEX = "[^0-9]";

    public static void run() {
        Printer.printLessonNumber(7, 9);
        Printer.printLessonName("Регулярные выражения");
        Printer.printDescription("Регулярные выражения — это специальные выражения, позволяющие описывать множества строк.\n\n" +
                "Регулярные выражения позволяют решать такие задачи со строками, как:\n" +
                "\t* замена в строках одних фрагментов на другие;\n" +
                "\t* разбивка строки на фрагменты определённым образом;\n" +
                "\t* проверка соответствия строк определённому шаблону;\n" +
                "\t* поиск в строках фрагментов, соответствующих шаблону;\n" +
                "\t* выделение в найденных фрагментах отдельных компонентов.");
        System.out.println();
        Printer.printTaskNumber(1);
        Printer.printTaskName("Замена одних фрагментов строк на другие");
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        Printer.printTaskName("Разбиение строк на фрагменты");
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        Printer.printTaskName("Разбиение строк на фрагменты (несколько пробелов)");
        task3();
        System.out.println();
        Printer.printTaskNumber(4);
        Printer.printTaskName("Проверка соответствия строк шаблону");
        task4();
        System.out.println();
        Printer.printTaskNumber(5);
        Printer.printTaskName("Поиск фрагментов строк, соответствующих шаблону");
        task5();
        System.out.println();
        Printer.printTaskNumber(6);
        Printer.printTaskName("Поиск фрагментов строк, соответствующих шаблону(второй вариант)");
        task6();
        System.out.println();
        Printer.printTaskNumber(7);
        Printer.printTaskName("Маски в регулярных выражениях (без маски)");
        task7();
        System.out.println();
        Printer.printTaskNumber(8);
        Printer.printTaskName("Маски в регулярных выражениях (с маской)");
        task8();
        System.out.println();
        Printer.printTaskNumber(9);
        Printer.printTaskName("Маски в регулярных выражениях (с маской +)");
        task9();
        System.out.println();
        printInfo();
    }

    public static void task1() {
        String phone1 = "+7 903 712-37-54";
        String phone2 = "7 (903) 968-60-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9616245";

        System.out.println("old - {" + phone1 + "} | new - {" + formatPhoneNumber(phone1) + "}");
        System.out.println("old - {" + phone2 + "} | new - {" + formatPhoneNumber(phone2) + "}");
        System.out.println("old - {" + phone3 + "} | new - {" + formatPhoneNumber(phone3) + "}");
        System.out.println("old - {" + phone4 + "} | new - {" + formatPhoneNumber(phone4) + "}");

    }

    public static String formatPhoneNumber(String phone) {
        return phone.replaceAll(REGEX, "");
    }

    public static void task2() {
        String text = "I know something about it";
        System.out.println("String = '" + text + "'");
        System.out.println("Result:");
        String[] words = text.split("\\s");
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void task3() {
        String text = "I  know\tsomething   about\n  it";
        System.out.println("String = '" + text + "'");
        System.out.println("Result:");
        String[] words = text.split("\\s+");
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void task4() {
        String number = "А674МР197";
        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regex = lettersRange + "[0-9]{3}" +lettersRange + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex));
    }

    public static void task5() {
        String text = "Алексей, добрый день!\nМой гитхаб — https://github.com/, а также ссылка на мой персональный сайт " +
                "— https://www.skillbox.ru/\nЕсли возникнут вопросы, пишите мне напрямую. Я всегда доступен";
        String regex = "https://[^,\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
    }

    public static void task6() {
        String text = "Алексей, добрый день!\nМой гитхаб — https://github.com/, а также ссылка на мой персональный сайт " +
                "— https://www.skillbox.ru/\nЕсли возникнут вопросы, пишите мне напрямую. Я всегда доступен";
        String regex = "https://[^,\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void task7() {
        String text = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени " +
                "все документы!» На что Анна ему ответила: «А документы-то так и не привезли». Дмитрий удивлённо " +
                "посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        String regex = "«[^»]+»";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void task8() {
        String text = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени " +
                "все документы!» На что Анна ему ответила: «А документы-то так и не привезли». Дмитрий удивлённо " +
                "посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        String regex = "«([^»]+)»";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void task9() {
        String text = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени " +
                "все документы!» На что Анна ему ответила: «А документы-то так и не привезли». Дмитрий удивлённо " +
                "посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        String regex = "«([^»]+)»";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
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
        System.out.println(ANSI_PURPLE+ "________________________________________________" + ANSI_RESET);
    }

}
