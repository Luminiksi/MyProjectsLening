package main.try_2.records;

public record StudentRecord(String name, int age) {
//    если добавлять не статические поля - будет ошибка

    private static final int adultAge = 18;

    public StudentRecord{
        if (age < 0) {
            System.out.println("Вы создали студента с отрицательным возрастом!");
        }
    }
    public StudentRecord (String name) {
        this(name, 18);
    }

    public boolean isAdult() {
        return age >= adultAge;
    }

    public static Student createAdultStudent(String name){
        return new Student(name, adultAge);
    }
}