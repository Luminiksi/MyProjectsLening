package try_1.functionalProgramming.lesson3;

@FunctionalInterface
interface Action<T extends Number> {
    T calculate(T t1, T t2);
}
