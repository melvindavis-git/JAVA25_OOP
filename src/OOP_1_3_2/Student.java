package OOP_1_3_2;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, int age) {
        super(name, age);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void printAllCourses(){
        System.out.println("The student: " + getName() + " is currently reading the courses: ");
        for (Course c : courses){
                System.out.println(c.getName());
        }
    }

}
