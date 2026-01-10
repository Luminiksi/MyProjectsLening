package main.try_2.functionalProgramming.lesson_16_7;

import lombok.*;

@Getter
@AllArgsConstructor //генерация конструкетора со всеми переменными
@ToString
@EqualsAndHashCode  // автоматически создаются методы equals и hashCode (исключая статические поля)
                    // можно проставить аннотации, какие поля надо включать/исключать при помощи аннотаций
                    // @EqualsAndHashCode.Include и @EqualsAndHashCode.Exclude соответсвенно
public class ProductAll {
    @Setter
    @EqualsAndHashCode.Include
    private String name;

    @Setter
    @ToString.Exclude // Исключение поля из toString
    @EqualsAndHashCode.Exclude
    private int price;

    public ProductAll(@NonNull String name) { // автоматическая проверка на null значения
        this.name = name;
    }
}
