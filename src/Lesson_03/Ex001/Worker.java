package Lesson_03.Ex001;

public class Worker {
    private String firstName;
    private String lastName;
    private int age;
    public int salary;
    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s %d", firstName, lastName, age);
    }
}
