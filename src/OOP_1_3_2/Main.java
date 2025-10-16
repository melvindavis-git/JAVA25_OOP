package OOP_1_3_2;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("David", 30);
        Student student1 = new Student("Melvin", 20);
        Student student2 = new Student("Emil", 20);
        Student student3 = new Student("Tim", 20);
        Course course1 = new Course("Javautveckling", teacher1);
        Course course2 = new Course("OOP", teacher1);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course2.addStudent(student1);
        course1.printStudents();
        System.out.println();
        student1.printAllCourses();


    }
}
