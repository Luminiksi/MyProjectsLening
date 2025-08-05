package try_1.functionalProgramming.lesson7;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
public class Product {
    @Setter
    @EqualsAndHashCode.Include
    private String name;
    @Setter
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private int price;

    public void changeName(@NonNull String name) {
        this.name = name;
    }
}
