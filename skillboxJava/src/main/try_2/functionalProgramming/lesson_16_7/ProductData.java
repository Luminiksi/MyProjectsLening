package main.try_2.functionalProgramming.lesson_16_7;

import lombok.Data;

@Data   // включает в себя:
        // @ToString  @EqualsAndHashCode  @Getter  @Setter  @RequiredArgsConstructor
public class ProductData {
    private final String name;
    private double price;
}
