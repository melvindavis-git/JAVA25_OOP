package OOP_1_3;

public class Course {

    private String name;
    private Teacher teacher;
    private Student[] students;
    private int studentCounter;

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new Student[30];
        this.studentCounter = 0;
    }

    public void addStudent (Student student){
        if (studentCounter < students.length) {
            students[studentCounter] = student;
            studentCounter++;
            student.addCourse(this);
        } else {
            System.out.println("The course is full!");
        }
    }

    public void printStudents() {
        System.out.println("Students in the course " + name + " (Teacher " + teacher.getName() + "): ");
        for (Student s : students) {
            if (s != null){
                System.out.println(s.getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}
