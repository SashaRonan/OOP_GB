package Seminar_03;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

   private List<Student> list;

    public StudentGroup() {
        list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        list.add(student);

    }
}
