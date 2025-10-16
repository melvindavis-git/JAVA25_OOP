package OOP_1_3;

public class Student extends Person{

    private Course[] courses;
    private int courseCounter;

    public Student(String name, int age) {
        super(name, age);
        this.courses = new Course[10];
        this.courseCounter = 0;
    }

    public void addCourse(Course course) {
        if (courseCounter < courses.length){
            courses[courseCounter] = course;
            courseCounter++;
        }
    }

    public void printAllCourses(){
        System.out.println("The student: " + getName() + " is currently reading the courses: ");
        for (Course c : courses){
            if (c != null){
                System.out.println(c.getName());
            }
        }
    }

}
