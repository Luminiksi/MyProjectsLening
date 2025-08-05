package try_1.functionalProgramming.lesson2;

public interface GarbageHandler2<T, S> {
    void handle(T what, S how);
    <E> void transfer(E dangerousWaste);
}
