package Seminar_03;

public class Program {
    public static void main(String[] args) {
        Student student_1 = new Student(1, "Паша", 18 );
        Student student_2 = new Student(2, "Даша", 19 );

        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(student_1);
        studentGroup.addStudent(student_2);

        Student student_3 = new Student(2, "Витя", 20 );

    }
}
