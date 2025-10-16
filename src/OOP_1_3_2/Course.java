package OOP_1_3_2;

import java.util.ArrayList;

public class Course {

    private String name;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void addStudent (Student student){
        students.add(student);
        student.addCourse(this);
    }

    public void printStudents() {
        System.out.println("Students in the course " + name + " (Teacher " + teacher.getName() + "): ");
        for (Student s : students) {
                System.out.println(s.getName());
        }
    }

    public String getName() {
        return name;
    }
}
