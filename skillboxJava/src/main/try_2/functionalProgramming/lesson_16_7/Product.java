package main.try_2.functionalProgramming.lesson_16_7;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor //генерация конструкетора без арогументов
@ToString(includeFieldNames = false) // toString игнорирует названия полей - выводит только значения
public class Product {
    @Setter
    private String name;

    @Setter
    private int price;
}
