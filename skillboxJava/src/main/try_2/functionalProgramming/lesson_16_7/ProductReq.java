package main.try_2.functionalProgramming.lesson_16_7;

import lombok.*;

@Getter
@RequiredArgsConstructor //генерация конструкетора со всеми ключевыми полями, помеченными final и NotNull (игнорирует статические поля)
@ToString(onlyExplicitlyIncluded = true) // для включение в toString нужно явно указывать поля, через аннотацию - @ToString.Include
public class ProductReq {
    @Setter
    private String name;

    @Setter
    @ToString.Include
    private int price;
}
