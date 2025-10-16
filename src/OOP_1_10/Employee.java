package OOP_1_10;

public class Employee extends Person {

    private int ID;
    private int salary;

    public Employee(String name, int ID, int salary) {
        super(name);
        this.ID = ID;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "Name: " + getName() + " ID: " + ID + " Salary: " + salary;
    }
}
