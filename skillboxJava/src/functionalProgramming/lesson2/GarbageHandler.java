package functionalProgramming.lesson2;

public interface GarbageHandler<T, S> {
    void handle(T what, S how);
}
