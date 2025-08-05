package try_1.other;

record Student(String name, int age) {

    private static final int adultAge = 18;

    public Student{
        if (age < 0) {
            System.out.println("Вы создали студента с отрицательным возрастом!");
        }
    }
    public Student (String name) {
        this(name, 18);
    }

    public boolean isAdult() {
        return age >= adultAge;
    }

    public static Student createAdultStudent(String name){
        return new Student(name, adultAge);
    }
}
