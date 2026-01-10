package main.try_2.functionalProgramming.lesson_16_7;

import lombok.Value;

@Value // неизменяемый вариант POJO класса - все поля private final, сеттеров нет, а класс становится final
public class ProductValue {
    String name;
    double price;
}
