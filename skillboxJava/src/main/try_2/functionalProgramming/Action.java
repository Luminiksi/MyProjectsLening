package main.try_2.functionalProgramming;

public interface Action <T extends Number> {
    T calculate(T t1, T t2);
}
