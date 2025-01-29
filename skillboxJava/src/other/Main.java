package other;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", 34);
        System.out.println(student1);
        System.out.println(student1.isAdult());
        System.out.println();
        Student student2 = new Student("Боря", -65);
        System.out.println(student2);
        System.out.println();
        Student student3 = new Student("Маша");
        System.out.println(student3);
        System.out.println();
        Student student4 = Student.createAdultStudent("Николай");
        System.out.println(student4);
    }
}
